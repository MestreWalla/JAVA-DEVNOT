import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import java.awt.*;

public class Exercicio01Correcao02 extends JFrame {
    public Exercicio01Correcao02() {
        super("Exercicio 1");
        
        JPanel mainPanel = new JPanel(new BorderLayout()); //painel principal
        this.add(mainPanel);

        //criar os elementos do painel principal
        //add um botão ao norte
        JButton button = new JButton("Next");
        mainPanel.add(button,BorderLayout.NORTH);

        //add um painel de cards ao centro -> CardLayout
        CardLayout cl = new CardLayout();//layout do painel
        JPanel cardPanel = new JPanel(cl); //criação do painel no layout
        mainPanel.add(cardPanel,BorderLayout.CENTER);
        //Criar os paineis do cardLayout
        JPanel card1 = new JPanel(); //CARD1
        card1.add(new JLabel("Card 1"));
        cardPanel.add(card1, "Card1");
        JPanel card2 = new JPanel(); //CARD2
        card2.add(new JLabel("Card 2"));
        cardPanel.add(card2, "Card2");
        JPanel card3 = new JPanel(); //CARD3
        card3.add(new JLabel("Card 1"));
        cardPanel.add(card3, "Card3");

        //criar set do frame
        this.setDefaultCloseOperation(2);
        this.setBounds(100, 100, 300, 300);
        this.setVisible(true);

        //criar a ação para o botão
        button.addActionListener(e->{
            cl.next(cardPanel);
        });


    }
}