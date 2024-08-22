package br.ufpb.dcx.gustavo.rodrigues.agenda;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class AgendaGUI extends JFrame {
    public AgendaGUI(){
        setTitle("Agenda de Aniversários");
        setSize(960, 540);
        setLocation(100, 100);
        setResizable(true);
        getContentPane().setBackground(Color.blue);

        // Carregando a imagem
        //String imagePath = ""; // Substitua pelo caminho correto
        //try {
        //    BufferedImage image = ImageIO.read(new File(imagePath));
        //    JLabel label = new JLabel(new ImageIcon(image));
        //     setContentPane(label);
        //} catch (IOException e) {
        //    System.out.println("Erro ao carregar a imagem: " + e.getMessage());
        //}
    }

}
