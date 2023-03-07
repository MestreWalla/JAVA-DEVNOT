package JAVA.ExerciciosIfElse;

import java.util.Scanner;

public class app {
    /**
     * @param args
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Exercicios obj = new Exercicios();

        System.out.println("Escolha o exercício que deseja executar:");
        System.out.println("1 - Exercício 01 - Mostrar qual número é maior.");
        System.out.println("2 - Exercício 02 - Mostrar se você ja pode votar.");
        System.out.println("3 - Exercício 03 - Informar se senha esta correta ou não.");
        System.out.println("4 - Exercício 04 - Calcular valor do produto com desconto ou não.");
        System.out.println("5 - Exercício 05 - Ao informar 3 numeros, o sistema ira exibilos em ordem crescente.");
        System.out.println("6 - Exercício 06 - Calcular peso ideal com base em suas informações.");
        System.out.println("7 - Exercício 07 - Informar aprovação do aluno.");
        System.out.println("8 - Exercício 08 - Informar se o numero digitado é impar ou par.");
        System.out.println("9 - Exercicio 09 - Ver se passou de ano");

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
            case 9:
                obj.exercicio09();
                break;
            default:
                System.out.println("Opção inválida!");
                break;
        }

        scanner.close();
    }
}
