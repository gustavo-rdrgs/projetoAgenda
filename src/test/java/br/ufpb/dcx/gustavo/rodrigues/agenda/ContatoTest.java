package br.ufpb.dcx.gustavo.rodrigues.agenda;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Collection;

import static org.junit.jupiter.api.Assertions.*;

public class ContatoTest {
    AgendaAyla agenda;

    @BeforeEach
    void setup(){
        this.agenda = new AgendaAyla();
    }

    @Test
    public void testaConstrutor(){
        Contato c0 = new Contato("Ayla", 5, 10);
        assertEquals("Ayla", c0.getNome());
        assertEquals(5, c0.getDiaAniversario());
        assertEquals(10, c0.getMesAniversario());
    }

    @Test
    public void testaContato(){
        Collection<Contato> contatosAchados = agenda.pesquisaAniversariantes(8, 6);
        assertEquals(0, contatosAchados.size());

        agenda.cadastraContato("Gustavo", 8, 6);
        agenda.cadastraContato("Fulano", 8, 6);
        //Contato c1 = new Contato("Anderson", 17, 11);
        //Contato c2 = new Contato("Romildo", 31, 1);
        //Contato c3 = new Contato("Kauã", 4, 5);

        contatosAchados = agenda.pesquisaAniversariantes(8, 6);
        assertEquals(2, contatosAchados.size());

        try{
            boolean removeu = agenda.removeContato("Gustavo");
            assertTrue(removeu);
        } catch (ContatoInexistenteException e){
            fail("Não deveria lançar exceção");
        }

        contatosAchados = agenda.pesquisaAniversariantes(8, 6);
        assertEquals(1, contatosAchados.size());
    }
}
