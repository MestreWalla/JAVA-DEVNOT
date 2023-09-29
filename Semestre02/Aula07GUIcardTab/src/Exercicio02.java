import java.awt.BorderLayout;
import java.awt.CardLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Exercicio02 extends JFrame{
    public Exercicio02() {
        super("Exercicio 2");

        JPanel principal = new JPanel(new BorderLayout()); // Painel Principal
        principal.setBackground(new Color(240,255,240));
        this.add(principal); //Adicionando Painel Principal dentro do JFrame

                CardLayout cl = new CardLayout(); // criar o objeto do cardLayout
                JPanel cards = new JPanel(cl); // painel de cards no padrão CL (CardLayout)
                principal.add(cards, BorderLayout.NORTH); // add o JPanel "cards" ao painel principal

                    JPanel card1 = new JPanel(new GridLayout(4, 1, 20, 20)); // criar painel de card
                    card1.setBackground(new Color(240,255,240));
                    cards.add(card1, "card1"); //add o card ao cards e atribui um "nome"

                        JLabel labelInicio = new JLabel("Início"); // Cria um JLabel
                        card1.add(labelInicio);
                            Font fonte = new Font("Arial", Font.BOLD, 30); // Define o tamanho da fonte - Fonte Arial, negrito, tamanho 20
                            labelInicio.setFont(fonte); // Aplica a fonte da variavel fonte
                            labelInicio.setForeground(Color.BLUE); // Define a cor do texto

                        JButton logarI = new JButton("Logar"); // Botão logar da pagina inicial
                            logarI.setPreferredSize(new Dimension(50, 45));
                            logarI.setBackground(new Color(176,224,230));
                            logarI.setForeground(new Color(70,130,180));
                            logarI.setBorder(javax.swing.BorderFactory.createLineBorder(new Color(0, 100, 0), 3));
                        card1.add(logarI); // add o botão ao painel na pagina inicial

                        JButton cadastrarI = new JButton("Cadastrar"); // Botão cadastrar da pagina inicial
                            cadastrarI.setPreferredSize(new Dimension(100, 45));
                            cadastrarI.setBackground(new Color(230,230,250));
                            cadastrarI.setForeground(new Color(70,130,180));
                            cadastrarI.setBorder(javax.swing.BorderFactory.createLineBorder(new Color(0, 100, 0), 3));
                        card1.add(cadastrarI); // add o botão ao painel na pagina inicial

                    JPanel card2 = new JPanel(new GridLayout(4, 2, 20, 20)); // criar painel de card
                    card2.setBackground(new Color(240,255,240));
                    cards.add(card2, "card2"); //add o card ao cards e atribui um "nome"

                    JLabel labelLogin = new JLabel("Logar"); // Cria um JLabel
                        card2.add(labelLogin);
                            labelLogin.setFont(fonte); // Aplica a fonte da variavel fonte
                            labelLogin.setForeground(Color.BLUE); // Define a cor do texto

                    card2.add(new JLabel("")); // nada

                        card2.add(new JLabel("Email:"));
                        card2.add(new JTextField("Email", 20)); // Campo Email

                        card2.add(new JLabel("Senha:"));
                        card2.add(new JTextField("Senha", 20)); // Campo Senha

                    JPanel card3 = new JPanel(new GridLayout(6, 2,20,20)); // GridLayout com 5 linhas e 2 colunas
                    card3.setBackground(new Color(240,255,240));
                    cards.add(card3, "card3"); //// Adicionar o card3 ao cards

                    JLabel labelCadastro = new JLabel("Cadastrar"); // Cria um JLabel
                        card3.add(labelCadastro);
                            labelCadastro.setFont(fonte); // Aplica a fonte da variavel fonte
                            labelCadastro.setForeground(Color.BLUE); // Define a cor do texto

                    card3.add(new JLabel("")); //nada

                        // Campos de entrada e rótulos
                        card3.add(new JLabel("Email:"));
                        card3.add(new JTextField("Email", 20)); // Campo Email

                        card3.add(new JLabel("Confirmar Email:"));
                        card3.add(new JTextField("Confirmar Email", 20)); // Campo Email

                        
                        card3.add(new JLabel("Senha:"));
                        card3.add(new JTextField("Senha", 15)); // Campo Senha

                        card3.add(new JLabel("Confirmar Senha:"));
                        card3.add(new JTextField("Confirmar Senha", 20)); // Campo Senha

        JPanel botoes = new JPanel(); // Painel Botoes
        botoes.setBackground(new Color(240,255,240));
        principal.add(botoes, BorderLayout.SOUTH);
        this.add(principal); //Adicionando Painel Botoes dentro do JFrame

            JButton Inicio = new JButton("Inicio"); //Botão Inicio
                Inicio.setPreferredSize(new Dimension(100, 45));
                Inicio.setBackground(new Color(35,35,142));
                Inicio.setForeground(new Color(255,255,255));
                Inicio.setBorder(javax.swing.BorderFactory.createLineBorder(new Color(0, 0, 102), 3));
            botoes.add(Inicio);

            JButton logar = new JButton("Logar"); // Botão logar
                logar.setPreferredSize(new Dimension(100, 45));
                logar.setBackground(new Color(0,128,0));
                logar.setForeground(new Color(255,255,255));
                logar.setBorder(javax.swing.BorderFactory.createLineBorder(new Color(0, 100, 0), 3));
            botoes.add(logar); // add o botão ao painel botoes

            JButton cadastrar = new JButton("Cadastrar"); // Botão Cadastrar
                cadastrar.setPreferredSize(new Dimension(100, 45));
                cadastrar.setBackground(new Color(0,128,0));
                cadastrar.setForeground(new Color(255,255,255));
                cadastrar.setBorder(javax.swing.BorderFactory.createLineBorder(new Color(0, 100, 0), 3));
            botoes.add(cadastrar); // add o botão ao painel botoes

            Inicio.setVisible(false);
            logar.setVisible(false);
            cadastrar.setVisible(false);

        // set do frame
        this.setDefaultCloseOperation(2);
        this.setBounds(100, 100, 400, 400);
        this.setVisible(true);

        // criar o evento para o botão
        Inicio.addActionListener(e -> {
            // toda vez que clicar no botão , vai mudar para o inicio
            cl.show(cards, "card1"); // Mudar para o inicio
            // Inicio.setEnabled(true);
            Inicio.setVisible(false);
            logar.setVisible(false);
            cadastrar.setVisible(false);
        });

        // criar o evento para o botão logarI
        logarI.addActionListener(e -> {
            // toda vez que clicar no botão , vai mudar para o card2
            cl.show(cards, "card2"); // Mudar para o card2 (Login)
            Inicio.setVisible(true);
            logar.setVisible(true);
            cadastrar.setVisible(false);
        });

        // criar o evento para o botão cadastrarI
        cadastrarI.addActionListener(e -> {
            // toda vez que clicar no botão , vai mudar para o card3
            cl.show(cards, "card3"); // Mudar para o card3 (Cadastro)
            Inicio.setVisible(true);
            logar.setVisible(false);
            cadastrar.setVisible(true);
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