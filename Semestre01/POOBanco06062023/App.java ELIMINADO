package POOBanco06062023;

import javax.swing.JOptionPane;

import POOBanco06062023.Conta.Conta;

public class App {
    public static void main(String[] args) {
        Conta[] contas = new Conta[5]; // Criar 5 contas

        String opcoes = JOptionPane.showInputDialog("\n-------------Bem vindo ao Banco PT*-------------"+"\nAqui você não perde, mas tambem não ganha"+"\nInforme a ação desejada\n1-Logar\n2-Cadastrar\n3-Encerrar");

        while (opcoes != null) {
            int acao  = Integer.parseInt(opcoes);
            switch (acao) {
                case 1:
                    System.out.println("LOGIN");
                    Conta.realizarLogin(contas);
                    break;
                case 2:
                    System.out.println("CADASTRO");
                    Conta.cadastrar(contas);
                    break;
                case 3:
                    break;
                default:
                    System.out.println("Informe um número válido");
                    break;
            }
        }
    }
}
