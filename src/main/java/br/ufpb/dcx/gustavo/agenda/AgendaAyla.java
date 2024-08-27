package br.ufpb.dcx.gustavo.agenda;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class AgendaAyla implements Agenda{
    private Map<String, Contato> contatos;
    private GravadorDeDados gravador;

    public AgendaAyla(){
        this.contatos = new HashMap<>();
        this.gravador = new GravadorDeDados();
    }

    @Override
    public boolean cadastraContato(String nome, int dia, int mes) {
        Contato novoContato = new Contato(nome, dia, mes);
        if (this.contatos.containsValue(novoContato)){
            return false;
        }
        this.contatos.put(nome, novoContato);
        return true;
    }

    @Override
    public Collection<Contato> pesquisaAniversariantes(int dia, int mes) {
        Collection<Contato> aniversariantes = new ArrayList<>();
        for (Contato c: this.contatos.values()){
            if (c.getDiaAniversario() == dia && c.getMesAniversario() == mes){
                aniversariantes.add(c);
            }
        }
        return aniversariantes;
    }

    @Override
    public boolean removeContato(String nome) throws ContatoInexistenteException {
        if (!this.contatos.containsKey(nome)){
            throw new ContatoInexistenteException("Contato de nome '"+nome+"' não foi encontrado");
        }
        this.contatos.remove(nome);
        return true;
    }

    @Override
    public void salvarDados() throws IOException {
        gravador.salvarContatos((HashMap<String, Contato>) contatos);
    }

    @Override
    public void recuperarDados() throws IOException {
        gravador.recuperarContatos();
    }
}
