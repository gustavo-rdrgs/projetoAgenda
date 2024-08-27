package br.ufpb.dcx.gustavo.agenda.controller;

import br.ufpb.dcx.gustavo.agenda.Agenda;
import br.ufpb.dcx.gustavo.agenda.ContatoInexistenteException;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class AgendaRemoveController implements ActionListener {
    private Agenda agenda;
    private JFrame janelaPrincipal;
    public AgendaRemoveController(Agenda agenda, JFrame janela) {
        this.agenda = agenda;
        this.janelaPrincipal = janela;
    }


    public void actionPerformed(ActionEvent e) {
        String nome = JOptionPane.showInputDialog(janelaPrincipal,
                "Qual o nome do aniversariante a remover?");
        boolean removeu = false;
        try {
            agenda.removeContato(nome);
            JOptionPane.showMessageDialog(janelaPrincipal,
                    "Aniversariante removido com sucesso");
        } catch (ContatoInexistenteException ex) {
            JOptionPane.showMessageDialog(janelaPrincipal,
                    "Aniversariante não foi encontrado. "+
                            "Operação não realizada");
        }
    }
}
