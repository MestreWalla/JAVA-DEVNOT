import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;
import java.awt.*;

public class ExemploCardLayout extends JFrame {
    //Construtor
    public ExemploCardLayout() {
        super("Exemplo CardLayout");
        JPanel painel1 = new JPanel(); //Painel principal
        //Elemento de seleção dos Cards JComboBox
        String ItensCB[] = {"Card1", "Card2", "Card3", "Card4"};
        JComboBox cb = new JComboBox<>(ItensCB);
        painel1.add(cb);
        //Criar os cards
        JPanel cards = new JPanel(); //Card principal - vai permitir a navegação
        CardLayout cl = new CardLayout();
        cards.setLayout(cl);
        //Criar cards da pilha
        JPanel card1 = new JPanel();
        card1.add(new JButton("Botão 01"));
        card1.add(new JButton("Botão 02"));
        card1.add(new JButton("Botão 03"));
        JPanel card2 = new JPanel();
        card2.add(new JTextField("Card com Jtext", 20));
        //Add cardas da pilha
        cards.add(card1, "Card1"); //No lugar do nome do card pode ser utilizar ItensCB[0]
        cards.add(card2, ItensCB[1]);
        painel1.add(cards);
        this.add(painel1); //Adicionar painel1 ao frame
        //Set do frame
        this.setDefaultCloseOperation(2);
        this.setBounds(100, 100, 300, 300);
        this.setVisible(true);
        //Criar ação para o ComboBox
        cb.addItemListener(e->{
            cl.show(cards, (String)e.getItem());
        });
    }
}
