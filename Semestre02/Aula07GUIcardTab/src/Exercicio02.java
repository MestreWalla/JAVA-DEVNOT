import java.awt.CardLayout;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Exercicio02 extends JFrame{
    public Exercicio02() {
        super("Exercicio 2");

        JPanel principal = new JPanel(); // Painel Principal
        this.add(principal); //Adicionando Painel Principal dentro do JFrame

            JButton Inicio = new JButton("Inicio"); //Botão Inicio
            principal.add(Inicio); // add o botão ao painel principal

                CardLayout cl = new CardLayout(); // criar o objeto do cardLayout
                JPanel cards = new JPanel(cl); // painel de cards no padrão CL (CardLayout)
                principal.add(cards); // add o JPanel "cards" ao painel principal

                    JPanel card1 = new JPanel(new GridLayout(4, 1)); // criar painel de card
                    cards.add(card1, "card1"); //add o card ao cards e atribui um "nome"

                    card1.add(new JLabel("Início")); // diferenciando os cards

                        JButton logarI = new JButton("Logar"); // Botão logar da pagina inicial
                        card1.add(logarI); // add o botão ao painel login na pagina inicial
                        JButton cadastrarI = new JButton("Cadastrar"); // Botão cadastrar da pagina inicial
                        card1.add(cadastrarI); // add o botão ao painel cadastrar na pagina inicial

                    JPanel card2 = new JPanel(new GridLayout(3, 2)); // criar painel de card
                    cards.add(card2, "card2"); //add o card ao cards e atribui um "nome"

                    card2.add(new JLabel("Login")); // diferenciando os cards
                    card2.add(new JLabel(".")); // nada

                        card2.add(new JLabel("Email:"));
                        card2.add(new JTextField("Email", 20)); // Campo Email

                        card2.add(new JLabel("Senha:"));
                        card2.add(new JTextField("Senha", 20)); // Campo Senha

                        JButton logar = new JButton("Logar"); // Botão logar
                        card2.add(logar); // add o botão ao painel Login

                    JPanel card3 = new JPanel(new GridLayout(6, 2)); // GridLayout com 5 linhas e 2 colunas
                    cards.add(card3, "card3"); //// Adicionar o card3 ao cards

                    card3.add(new JLabel("Cadastro")); // diferenciando os cards
                    card3.add(new JLabel("")); //nada

                    // Campos de entrada e rótulos
                        card3.add(new JLabel("Email:"));
                        card3.add(new JTextField("Email", 20)); // Campo Email

                        card3.add(new JLabel("Confirmar Email:"));
                        card3.add(new JTextField("Confirmar Email", 20)); // Campo Email

                        
                        card3.add(new JLabel("Senha:"));
                        card3.add(new JTextField("Senha", 20)); // Campo Senha

                        card3.add(new JLabel("Confirmar Senha:"));
                        card3.add(new JTextField("Confirmar Senha", 20)); // Campo Senha

                        JButton cadastrar = new JButton("Cadastrar"); // Botão Cadastrar
                        card3.add(cadastrar); // add o botão ao painel Cadastro

        // set do frame
        this.setDefaultCloseOperation(2);
        this.setBounds(100, 100, 600, 300);
        this.setVisible(true);

        // criar o evento para o botão
        Inicio.addActionListener(e -> {
            // toda vez que clicar no botão , vai mudar para o inicio
            cl.show(cards, "card1"); // Mudar para o inicio
        });

        // criar o evento para o botão logarI
        logarI.addActionListener(e -> {
            // toda vez que clicar no botão , vai mudar para o card2
            cl.show(cards, "card2"); // Mudar para o card2 (Login)
        });

        // criar o evento para o botão cadastrarI
        cadastrarI.addActionListener(e -> {
            // toda vez que clicar no botão , vai mudar para o card3
            cl.show(cards, "card3"); // Mudar para o card3 (Cadastro)
        });

        // criar o evento para o botão logar
        logar.addActionListener(e -> {
            // Obtenha o texto dos campos de Email e Senha
            String email = ((JTextField) card2.getComponent(2)).getText();
            String senha = ((JTextField) card2.getComponent(4)).getText();
        
            // Implemente a lógica de autenticação aqui, por exemplo:
            if (autenticar(email, senha)) {
                // Autenticação bem-sucedida, faça alguma ação
                System.out.println("Autenticação bem-sucedida.");
            } else {
                // Autenticação falhou, exiba uma mensagem de erro
                System.out.println("Autenticação falhou.");
            }
        });

        // criar o evento para o botão cadastrar
        cadastrar.addActionListener(e -> {
            // Obtenha o texto dos campos de Email, Confirmar Email, Senha e Confirmar Senha
            String email = ((JTextField) card3.getComponent(2)).getText();
            String confirmarEmail = ((JTextField) card3.getComponent(4)).getText();
            String senha = ((JTextField) card3.getComponent(6)).getText();
            String confirmarSenha = ((JTextField) card3.getComponent(8)).getText();
        
            // Implemente a lógica de cadastro aqui, por exemplo:
            if (cadastrarUsuario(email, confirmarEmail, senha, confirmarSenha)) {
                // Cadastro bem-sucedido, faça alguma ação
                System.out.println("Cadastro bem-sucedido.");
            } else {
                // Cadastro falhou, exiba uma mensagem de erro
                System.out.println("Cadastro falhou.");
            }
        });
    }

    // Método de autenticação
    private boolean autenticar(String email, String senha) {

    // Verifique se o email e a senha correspondem a um usuário válido
    if (email.equals("maycon@gmail.com") && senha.equals("123")) {
        return true; // Autenticação bem-sucedida
    } else {
        return false; // Autenticação falhou
    }
}

    // Método de cadastro
    private boolean cadastrarUsuario(String email, String confirmarEmail, String senha, String confirmarSenha) {

        // Verificar se o email e o confirmarEmail são iguais
        if (!email.equals(confirmarEmail)) {
            return false; // Cadastro falhou devido à falta de correspondência no email
        }

        // Verifique se a senha e o confirmarSenha são iguais
        if (!senha.equals(confirmarSenha)) {
            return false; // Cadastro falhou devido à falta de correspondência na senha
        }

        return true; // Cadastro bem-sucedido
    }

}