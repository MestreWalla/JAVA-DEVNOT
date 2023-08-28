package Semestre02.Aula06Layout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

import java.awt.BorderLayout;
import java.awt.GridLayout;

public class LayoutCalculadora {
    public LayoutCalculadora() {
        // Construir o Layout de uma calculadora
        JFrame janelaP = new JFrame("Layout Calculadora");
        // Mudando o Layout da Frame
        BorderLayout border = new BorderLayout();
        JPanel painelV = new JPanel(); // Painel Visor
        JPanel painelB = new JPanel(); //Padrão Botoes
        janelaP.getContentPane().add(painelB, BorderLayout.CENTER);
        janelaP.getContentPane().add(painelV, BorderLayout.NORTH);
        // Adicionar o textField no PainelV
        JTextField caixa1 = new JTextField(25);
        painelV.add(caixa1);
        // Define o Layout do JPanel como GridLayout
        GridLayout grid = new GridLayout(4, 4);
        painelB.setLayout(grid);
        // Vetor com os textos dos botões
        String textBotoes[]={"c", "9", "8", "7", "6", "5", "4", "*", "3", "2", "1", "+", "0", "="};
        for (int i = 0; i < textBotoes.length; i++) {
            painelB.add(new JButton(textBotoes[i]));
        }
        // Set do Frame
        janelaP.setDefaultCloseOperation(2);
        janelaP.pack();
        janelaP.setVisible(true);
    }
}
