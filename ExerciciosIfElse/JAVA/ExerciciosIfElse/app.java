package JAVA.ExerciciosIfElse;

import java.util.Scanner;

public class app {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Exercicios obj = new Exercicios();

        System.out.println("Escolha o exercício que deseja executar:");
        System.out.println("1 - Exercício 01");
        System.out.println("2 - Exercício 02");
        System.out.println("3 - Exercício 03");
        System.out.println("4 - Exercício 04");
        System.out.println("5 - Exercício 05");
        System.out.println("6 - Exercício 06");
        System.out.println("7 - Exercício 07");
        System.out.println("8 - Exercício 08");

        int escolha = scanner.nextInt();

        switch (escolha) {
            case 1:
                obj.exercicio01();
                break;
            case 2:
                obj.exercicio02();
                break;
            case 3:
                obj.exercicio03();
                break;
            case 4:
                obj.exercicio04();
                break;
            case 5:
                obj.exercicio05();
                break;
            case 6:
                obj.exercicio06();
                break;
            case 7:
                obj.exercicio07();
                break;
            case 8:
                obj.exercicio08();
                break;
            default:
                System.out.println("Opção inválida!");
                break;
        }

        scanner.close();
    }
}
