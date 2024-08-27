package br.ufpb.dcx.gustavo.agenda.gui;

import javax.swing.*;

public class AgendaGUIV3ComRunnable {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                JFrame janela = new AgendaGUIV3();
                janela.setVisible(true);
                janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            }
        });
    }
}
