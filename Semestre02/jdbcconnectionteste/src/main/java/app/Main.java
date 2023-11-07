package app;

import java.util.Scanner;

import Connection.ConnectionDAO;

public class Main {
    public static void main(String[] args) {
        // new ConnectionDAO().apagarTabela();

        System.out.println("Escolha o exercício que deseja executar:");
        System.out.println("01 - Criar Tabela");
        System.out.println("02 - Inserir na tabela");
        System.out.println("03 - Buscar na tabela");
        System.out.println("04 - Apagar tabela");
        Scanner scanner = new Scanner(System.in);
        int escolha = scanner.nextInt();
        switch (escolha) {
            case 1:
                new ConnectionDAO().criarTabela();
                ;
                break;
            case 2:
                Scanner sc = new Scanner(System.in);
                System.out.println("Informe o nome:");
                String nome = sc.nextLine();
                System.out.println("Informe o e-mail:");
                String eMail = sc.nextLine();
                new ConnectionDAO().inserir(nome, eMail);
                break;
            case 3:
                new ConnectionDAO().buscarPorId(escolha);
                ;
                break;
            case 4:
                new ConnectionDAO().apagarTabela();
                break;
            default:
                System.out.println("Opção Invalida");
                break;
        }
        scanner.close();
    }
}