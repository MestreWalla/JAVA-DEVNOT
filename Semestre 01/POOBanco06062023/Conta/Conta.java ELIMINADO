package POOBanco06062023.Conta;

import javax.swing.JOptionPane;

import POOBanco06062023.Pessoa;

public class Conta {
    // VARIAVEIS DE ARMAZENAMENTO
    String nome; // Variável para armazenar o nome
    String sobreNome; // Variável para armazenar o sobrenome
    String cpf; // Variável para armazenar o CPF
    int idade; // Variável para armazenar a idade
    int saldo; // Variável para armazenar o saldo
    int valor; // Variável para armazenar o valor
    String numeroConta; // Variável para armazenar o número da conta
    String senha; // Variável para armazenar a senha

    // GETs
    public int getSaldo() {
        return saldo; // Retorna o saldo da conta
    }

    public String getCpf() {
        return cpf; // Retorna o CPF da conta
    }

    public String getSenha() {
        return senha; // Retorna a senha da conta
    }

    public static void cadastrar(Conta[] contas) {
        // Cria uma nova pessoa / usuario
        Pessoa pessoa01 = new Pessoa("", "", "", 0);

        // (SET) INFORMAR IDADE PARA VALIDAÇÃO
        pessoa01.setIdade(Integer.parseInt(JOptionPane.showInputDialog("Idade:"))); // Define a idade da pessoa

        // Validar Idade
        if (pessoa01.getIdade() >= 18) { // Verifica se a pessoa é maior de 18 anos
            // (SET) Informar cadastro
            pessoa01.setNome(JOptionPane.showInputDialog("Primeiro Nome:")); // Define o primeiro nome da pessoa
            pessoa01.setSobreNome(JOptionPane.showInputDialog("Sobrenome:")); // Define o sobrenome da pessoa
            pessoa01.setCpf(JOptionPane.showInputDialog("CPF:")); // Define o CPF da pessoa

            // Cria uma nova conta
            Conta novaConta = new Conta();
            novaConta.nome = pessoa01.getNome();
            novaConta.sobreNome = pessoa01.getSobreNome();
            novaConta.cpf = pessoa01.getCpf();
            novaConta.senha = JOptionPane.showInputDialog("Senha:"); // Define a senha da conta

            // Adiciona a nova conta ao array de contas
            for (int i = 0; i < contas.length; i++) {
                if (contas[i] == null) {
                    contas[i] = novaConta; // Adiciona a nova conta ao array
                    break;
                }
            }

            String mensagem = "Nome Completo: " + pessoa01.getNome() + " " + pessoa01.getSobreNome()
                    + "\nCPF: " + pessoa01.getCpf()
                    + "\nIdade: " + pessoa01.getIdade();
            JOptionPane.showMessageDialog(null, mensagem); // Exibe as informações da String mensagem em uma caixa de diálogo
        } else {
            JOptionPane.showMessageDialog(null,
                    "\nQue pena, sua idade não é suficiente"+"\nVocê não pode criar uma conta sozinho ainda," + "\nprocure uma agência fisica junto aos seus pais.");
        }
    }

    public static void realizarLogin(Conta[] contas) {
        String cpf = JOptionPane.showInputDialog("CPF:"); // Solicitar CPF para o login

        boolean loginSucesso = false;

        for (Conta conta : contas) {
            if (conta != null && conta.getCpf().equals(cpf)) { // Verifica se a conta existe e se o CPF corresponde ao
                                                               // informado
                String senha = JOptionPane.showInputDialog("Senha:"); // Solicitar senha para o login
                if (conta.getSenha().equals(senha)) { // Verificar senha
                    loginSucesso = true;
                    JOptionPane.showInputDialog("Logado");
                    break; // Interrompe o loop quando o login é bem-sucedido
                } else {
                    JOptionPane.showInputDialog("Senha Invalida");
                }
            } else {JOptionPane.showInputDialog("Usuario Invalido");}
        }

        if (loginSucesso) {
            System.out.println("Login realizado com sucesso!");
            // Ver Informaçoes da conta (Saldo, nConta, )
            // Transferir
            // Sair
        } else {
            System.out.println("Falha no login. Verifique o CPF e senha.");
        }
    }
}
