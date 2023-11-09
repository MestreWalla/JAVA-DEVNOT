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
        System.out.println("05 - Apagar id");
        System.out.println("06 - Atualizar pelo id");
        System.out.println("07 - Listar tudo");
        
        Scanner scanner = new Scanner(System.in);
        int escolha = scanner.nextInt();
        Scanner scan = new Scanner(System.in);

        switch (escolha) {
            case 1:
                new ConnectionDAO().criarTabela();
                ;
                break;
            case 2:
                System.out.println("Informe o nome:");
                String nome = scan.nextLine();
                System.out.println("Informe o e-mail:");
                String eMail = scan.nextLine();
                new ConnectionDAO().inserir(nome, eMail);
                break;
            case 3:
                System.out.println("Informe o id:");
                int id = scan.nextInt();
                new ConnectionDAO().buscarPorId(id);
                break;
            case 4:
                new ConnectionDAO().apagarTabela();
                break;
            case 5:
                System.out.println("Informe o id:");
                int idErase = scan.nextInt();
                new ConnectionDAO().apagarID(idErase);
                break;
            case 6:
                System.out.println("Informe o id:");
                int idUpdate = scan.nextInt();
                String novoNome = scan.nextLine();
                String novoEmail = scan.nextLine();
                new ConnectionDAO().atualizarID(idUpdate, novoNome, novoEmail);
                break;
             case 7:
                new ConnectionDAO().listarTodos();
                break;
            default:
                System.out.println("Opção Invalida");
                break;
        }
        scanner.close();
        scan.close();
    }
}