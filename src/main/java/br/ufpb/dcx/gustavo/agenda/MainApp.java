package br.ufpb.dcx.gustavo.agenda;

import br.ufpb.dcx.gustavo.agenda.gui.AgendaGUI;

import javax.swing.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

public class MainApp {
    public static void main(String[] args ){
        JFrame janela = new AgendaGUI();
        janela.setVisible(true);
        WindowListener fechadorDeJanelaPrincipal = new WindowAdapter(){
            public void windowClosing(WindowEvent e){
                System.exit(0);
            }
        };
        janela.addWindowListener(fechadorDeJanelaPrincipal);
    }
}
