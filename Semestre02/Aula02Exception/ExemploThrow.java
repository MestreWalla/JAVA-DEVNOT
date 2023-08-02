package Semestre02.Aula02Exception;

import javax.swing.JOptionPane;

public class ExemploThrow {
    public static void main(String[] args) {
        // Digitação de senhas
        boolean senha = true;
        while (senha) {
            try {
                String senhaDigitada = JOptionPane.showInputDialog("Informe a senha: ");
                if (senhaDigitada.length() < 8) {
                    throw new Exception("Senha invalida!!!");
                }
                JOptionPane.showMessageDialog(null, "Foi!");
                senha = false;
            } catch (Exception ex) {
                JOptionPane.showMessageDialog(null, ex.getMessage());
            }
        }
    }
}