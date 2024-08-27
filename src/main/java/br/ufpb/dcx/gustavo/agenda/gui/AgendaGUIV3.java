package br.ufpb.dcx.gustavo.agenda.gui;

import br.ufpb.dcx.gustavo.agenda.Agenda;
import br.ufpb.dcx.gustavo.agenda.AgendaAyla;
import br.ufpb.dcx.gustavo.agenda.controller.AgendaAddController;
import br.ufpb.dcx.gustavo.agenda.controller.AgendaRemoveController;
import br.ufpb.dcx.gustavo.agenda.controller.AgendaSearchController;

import javax.swing.*;
import java.awt.*;

public class AgendaGUIV3 extends JFrame {
    JLabel linha1, linha2;
    ImageIcon boloImg = new ImageIcon("./imgs/bolo.jpg");
    ImageIcon addImg = new ImageIcon("./imgs/icons/add_person.png");
    ImageIcon pesqImg = new ImageIcon("./imgs/icons/search_person.png");
    ImageIcon removeImg = new ImageIcon("./imgs/icons/remove_person.png");
    JButton botaoAdicionar, botaoPesquisar, botaoRemover;
    Agenda agenda = new AgendaAyla();

    public AgendaGUIV3(){
        setTitle("Agenda de Aniversários");
        setSize(800, 600);
        setLocation(150, 150);
        setResizable(false);
        getContentPane().setBackground(Color.white);

        linha2 = new JLabel(boloImg, JLabel.CENTER);
        linha1 = new JLabel("Minha Agenda de Aniversários", JLabel.CENTER);
        linha1.setForeground(Color.red);
        linha1.setFont(new Font("Serif", Font.BOLD, 24));

        botaoAdicionar  = new JButton("Adicionar", addImg);
        botaoPesquisar  = new JButton("Pesquisar", pesqImg);
        botaoRemover    = new JButton("Remover", removeImg);

        botaoAdicionar.addActionListener(new AgendaAddController(agenda, this));
        botaoPesquisar.addActionListener(new AgendaSearchController(agenda, this));
        botaoRemover.addActionListener(new AgendaRemoveController(agenda, this));

        getContentPane().setLayout(new GridLayout(3, 2));
        getContentPane().add(linha1);
        getContentPane().add(botaoAdicionar);
        getContentPane().add(linha2);
        getContentPane().add(botaoPesquisar);
        getContentPane().add(new JLabel());
        getContentPane().add(botaoRemover);
    }

    public static void main(String [] args){
        JFrame janela = new AgendaGUIV3();
        janela.setVisible(true);
        janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
