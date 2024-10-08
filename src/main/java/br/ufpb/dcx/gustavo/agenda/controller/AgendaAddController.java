package br.ufpb.dcx.gustavo.agenda.controller;

import br.ufpb.dcx.gustavo.agenda.Agenda;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class AgendaAddController implements ActionListener {
    private Agenda agenda;
    private JFrame janelaPrincipal;

    public AgendaAddController(Agenda agenda, JFrame janela){
        this.agenda = agenda;
        this.janelaPrincipal = janela;
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        String nome = JOptionPane.showInputDialog(janelaPrincipal, "Qual o nome do aniversariante?");
        int dia = Integer.parseInt(JOptionPane.showInputDialog(janelaPrincipal, "Qual dia do mês em que nasceu? [1-31]"));
        int mes = Integer.parseInt(JOptionPane.showInputDialog(janelaPrincipal, "Qual o mês em que nasceu"));
        boolean cadastrou = agenda.cadastraContato(nome, dia, mes);
        if (cadastrou) {
            JOptionPane.showMessageDialog(janelaPrincipal, "Aniversariante cadastrado.");
        } else {
            JOptionPane.showMessageDialog(janelaPrincipal, "Aniversariante não foi cadastrado. Verifique se já não existia.");
        }
    }
}
