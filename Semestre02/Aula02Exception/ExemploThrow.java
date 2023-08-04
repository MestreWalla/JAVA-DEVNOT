package Semestre02.Aula02Exception;

import javax.swing.JOptionPane;

public class ExemploThrow {
    // public static void main(String[] args) {
    // Digitação de senhas
    // boolean senha = true;
    // while (senha) {
    // try {
    // String senhaDigitada = JOptionPane.showInputDialog("Informe a senha: ");
    // if (senhaDigitada.length() < 8) {
    // throw new Exception("Senha invalida!!!");
    // }
    // JOptionPane.showMessageDialog(null, "Foi!");
    // senha = false;
    // } catch (Exception e) {
    // JOptionPane.showMessageDialog(null, e.getMessage());
    // }
    // }
    // }

    // public static void main(String[] args) {
    // // Digitação de senhas
    // String login = "maycon";
    // String senha = "123123123";
    // boolean laco = true;
    // while (laco) {
    // try {
    // String loginDigitado = JOptionPane.showInputDialog("Informe login: ");
    // String senhaDigitada = JOptionPane.showInputDialog("Informe a senha: ");
    // if (senhaDigitada.equals(senha) && loginDigitado.equals(login)) {
    // JOptionPane.showMessageDialog(null, "Login Realizado com sucesso!");
    // laco = false;
    // } else if (senhaDigitada.length() < 8) {
    // throw new Exception("Senha curta!!!");
    // } else {
    // throw new Exception("Senha invalida!!!");
    // }
    // } catch (Exception e) {
    // JOptionPane.showMessageDialog(null, e.getMessage());
    // } finally {
    // JOptionPane.showMessageDialog(null, "laço fechado!");
    // laco = false;
    // }
    // }
    // }
    public static void main(String[] args) {
        // Digitação de senhas
        boolean laco = true;
        while (laco) {
            try {
                String usuarioDigitado = JOptionPane.showInputDialog("Informe login: ");
                String senhaDigitada = JOptionPane.showInputDialog("Informe a senha: ");
                String dataNascimento = JOptionPane.showInputDialog("Informe data: ");
                dataNascimento = dataNascimento.replace("/", "");
                int idade = Integer.parseInt(JOptionPane.showInputDialog("Informe a sua idade: "));
                if (senhaDigitada.equals(usuarioDigitado)) { //SENHA IGUAL
                    JOptionPane.showMessageDialog(null, "Senha nao pode ser igual ao nome de usuario!");
                } else if (senhaDigitada.length() < 8) { //SENHA MENOR A 8 DIGITOS
                    throw new Exception("\nSenha muito curta! " + "\ninsira una senha valida");
                } else if (idade <= 17) { //IDADE MENOR DE 18
                    throw new Exception("\nSua idade deve ser maior que 18 anos!");
                } else if (dataNascimento == null) { //VALIDAÇÃO DE DATA DE NASCIMENTO
                    JOptionPane.showMessageDialog(null, "Preencha a idade");
                } else { //CONFIRMAÇÃO DE SUCESSO
                    throw new Exception("Cadastro realizado com sucesso!");
                }
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, e.getMessage());
            } finally {
                JOptionPane.showMessageDialog(null, "laço fechado!");
                laco = false;
            }
        }
    }
}