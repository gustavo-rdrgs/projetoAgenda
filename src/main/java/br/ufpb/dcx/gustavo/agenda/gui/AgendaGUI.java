package br.ufpb.dcx.gustavo.agenda.gui;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class AgendaGUI extends JFrame {
    public AgendaGUI(){
        setTitle("Agenda de Aniversários");  // título
        setSize(600, 600);  // tamanho
        setLocation(0, 0);  // localização
        setResizable(true);  // redimensionável
        getContentPane().setBackground(Color.lightGray);

    }

    public static void main(String [] args){
        AgendaGUI janela = new AgendaGUI();
        janela.setVisible(true);
        WindowListener fechadorDeJanelaPrincipal = new WindowAdapter() {
            public void windowClosing(WindowEvent e){

                System.exit(0);
            }
        };
        janela.addWindowListener(fechadorDeJanelaPrincipal);
    }

}
