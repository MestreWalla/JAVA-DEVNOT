import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JPanel;
import javax.swing.JTextField;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Exercicio01 extends Jframe {
    //Construtor
    public Exercicio01() {
        super("Exercicio 01");
        JPanel painel1 = new JPanel(); //Painel principal
        String botao[] = {"botaoA", "botaoB"};

        JButton botaoA = new JButton(botao[0]);
        painel1.add(botaoA);
        JButton botaoB = new JButton(botao[1]);
        painel1.add(botaoB);

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
        card2.add(new JTextField("Campo de texto 01", 20));
        card2.add(new JTextField("Campo de texto 02", 20));
        card2.add(new JTextField("Campo de texto 03", 20));

        //Add cards da pilha
        cards.add(card1, botao[0]);
        cards.add(card2, botao[1]);
        painel1.add(cards);
        this.add(painel1); //Adicionar painel1 ao frame

        //Set do frame
        this.setDefaultCloseOperation(2);
        this.setBounds(100, 100, 300, 300);
        this.setVisible(true);

        // Ação do botão
        botaoA.addActionListener(new ActionListener() {  // Adiciona um ouvinte de ação ao botão
            @Override
            public void actionPerformed(ActionEvent e) {
                cl.next(cards);
            }
        });
    }
}
