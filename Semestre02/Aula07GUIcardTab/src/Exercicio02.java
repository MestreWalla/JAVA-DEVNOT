import java.awt.CardLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Exercicio02 extends JFrame{
    public Exercicio02() {
        super("Exercicio 1");

        JPanel principal = new JPanel(); // Painel Principal
        this.add(principal); //Adicionando Painel Principal dentro do JFrame

            JButton proximo = new JButton("Próximo"); //Botão proximo
            principal.add(proximo); // add o botão ao painel principal

            CardLayout cl = new CardLayout(); // criar o objeto do cardLayout
            JPanel cards = new JPanel(cl); // painel de cards no padrão CL (CardLayout)
            principal.add(cards); // add o JPanel "cards" ao painel principal

                JPanel card1 = new JPanel(); // criar painel de card
                card1.add(new JLabel("Início")); // diferenciando os cards
                cards.add(card1, "card1"); //add o card ao cards e atribui um "nome"

                    JButton logarI = new JButton("Logar"); // Botão logar da pagina inicial
                    card1.add(logarI); // add o botão ao painel login na pagina inicial
                    JButton cadastrarI = new JButton("Cadastrar"); // Botão cadastrar da pagina inicial
                    card1.add(cadastrarI); // add o botão ao painel cadastrar na pagina inicial

                JPanel card2 = new JPanel(); // criar painel de card
                card2.add(new JLabel("Login")); // diferenciando os cards
                cards.add(card2, "card2"); //add o card ao cards e atribui um "nome"

                    card2.add(new JTextField("Email", 20)); // Campo Email
                    card2.add(new JTextField("Senha", 20)); // Campo Senha
                    JButton logar = new JButton("Logar"); // Botão logar
                    card2.add(logar); // add o botão ao painel Login

                JPanel card3 = new JPanel(); // criar painel de card
                card3.add(new JLabel("Cadastro")); // diferenciando os cards
                cards.add(card3, "card3"); //add o card ao cards e atribui um "nome"

                    card3.add(new JTextField("Email", 20)); // Campo Email
                    card3.add(new JTextField("Confirmar Email", 20)); // Campo Email
                    card3.add(new JTextField("Senha", 20)); // Campo Senha
                    card3.add(new JTextField("Confirmar Senha", 20)); // Campo Senha
                    JButton cadastrar = new JButton("Cadastrar"); // Botão Cadastrar
                    card3.add(logar); // add o botão ao painel Login

        // set do frame
        this.setDefaultCloseOperation(2);
        this.setBounds(100, 100, 300, 300);
        this.setVisible(true);

        // criar o evento para o botão
        proximo.addActionListener(e -> {
            cl.next(cards); // toda vez que clicar no botão , vai mudar o card (card1, card2, card3)
        });

        // criar o evento para o botão logarI
        logarI.addActionListener(e -> {
            // toda vez que clicar no botão , vai mudar para o card2
        });

        // criar o evento para o botão cadastrarI
        cadastrarI.addActionListener(e -> {
            // toda vez que clicar no botão , vai mudar para o card3
        });

        // criar o evento para o botão logar
        logar.addActionListener(e -> {
            // logica logar
        });

        // criar o evento para o botão cadastrar
        cadastrar.addActionListener(e -> {
            // logica cadastrar
        });
    }
}