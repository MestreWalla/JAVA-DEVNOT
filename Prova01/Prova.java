package JAVA.Prova01;

import java.util.Scanner;
import java.util.Random;

public class Prova {
    Scanner sc = new Scanner(System.in);

    public void Situacao01() {

        System.out.println("Digite o primeiro numero:");
        int primeiro = sc.nextInt();
        System.out.println("digite (1) para adição, (2) para subtração (3) para multiplicação (4) para Divisão.");
        int operacao = sc.nextInt();
        System.out.println("Digite o segundo numero:");
        int segundo = sc.nextInt();
        if (operacao == 1) {
            System.out.println(primeiro + segundo);
        } else if (operacao == 2) {
            System.out.println(primeiro - segundo);
        } else if (operacao == 3) {
            System.out.println(primeiro * segundo);
        } else if (operacao == 4) {
            System.out.println(primeiro / segundo);
        } else {
            System.out.println("Opção invalida reinicie a aplicação.");
        }
    }

    public void Situacao02() {
        System.out.println(
                "Bem vindo ao sistema da Escola Corleone do Brooklyn. Informe o número de matricula do aluno:");
        int matricula = sc.nextInt();
        // (Time do Chris, Time do Greg, Time do Caruso, Time do Jerome).
        Random rd = new Random();
        int random = rd.nextInt(4);
        int time = 0;
        if (time == 0) {
        System.out.println("Você esta registrado no time " + 0);
        } else if (time == 1) {
        System.out.println("Você esta registrado no time" + 1);
        } else if (time == 2) {
        System.out.println("Você esta registrado no time" + 2);
        } else if (time == 3) {
        System.out.println("Você esta registrado no time" + 3);
        }
    }

    public void Situacao03() {
        // Morangos – R$ 2,50 o kilo;
        // Maças – R$ 1,80 o kilo;
        // Bananas – R$ 1,30 o kilo;
        // Se o cliente comprar mais de 8 Kg em frutas ou o valor total da compra
        // ultrapassar R$ 25,00, receberá ainda um desconto de 10% sobre este total.
        System.out.println("Bem vindo a kitanda do Seu Madruga.");
        System.out.println("Informe com numero de 1 a 3 o que ira comprar:");
        System.out.println("(1) para Morangos;");
        System.out.println("(2) para Maçãs");
        System.out.println("(3) para Bananas");
        int selecao01 = sc.nextInt();
        String fruta1 = ("Morangos");
        switch (selecao01) {
            case 1:
                fruta1 = ("Morangos");
                break;
            case 2:
                fruta1 = ("Maças");
                break;
            case 3:
                fruta1 = ("Bananas");
                break;
                default:
                break;
        }
        if (fruta1 == "Morangos" || fruta1 == "Maças" || fruta1 == "Bananas") {
            System.out.println("A fruta escolhida foi " + fruta1 , "informe a quantidade em kilos:");
            double kg01 = sc.nextInt();
            System.out.println(fruta1 + kg01);
        } else {System.out.println("Seleção invalida.");}
        
        System.out.println("Informe com numero de 1 a 3 o que ira comprar:");
        System.out.println("(1) para Morangos;");
        System.out.println("(2) para Maçãs");
        System.out.println("(3) para Bananas");
        int selecao02 = sc.nextInt();
        String fruta2 = ("Morangos");
        switch (selecao02) {
            case 1:
                fruta2 = ("Morangos");
                break;
            case 2:
                fruta2 = ("Maças");
                break;
            case 3:
                fruta2 = ("Bananas");
                break;
                default:
                break;
        }

        if (fruta2 == "Morangos" || fruta2 == "Maças" || fruta2 == "Bananas") {
            System.out.println("A fruta escolhida foi " + fruta2 , "informe a quantidade em kilos:");
            double kg02 = sc.nextInt();
            System.out.println(fruta2 + kg02);
        } else {System.out.println("Seleção invalida.");}
        
        System.out.println("Informe com numero de 1 a 3 o que ira comprar:");
        System.out.println("(1) para Morangos;");
        System.out.println("(2) para Maçãs");
        System.out.println("(3) para Bananas");
        int selecao03 = sc.nextInt();
        String fruta3 = ("Morangos");
        switch (selecao03) {
            case 1:
                fruta3 = ("Morangos");
                break;
            case 2:
                fruta3 = ("Maças");
                break;
            case 3:
                fruta3 = ("Bananas");
                break;
                default:
                break;
        }

        if (fruta3 == "Morangos" || fruta3 == "Maças" || fruta3 == "Bananas") {
            System.out.println("A fruta escolhida foi " + fruta3 , "informe a quantidade em kilos:");
            double kg02 = sc.nextInt();
            System.out.println(fruta3 + kg03);
        } else {System.out.println("Seleção invalida.");}

        double valorMorango = 2.5;
        double valorMaca = 1.8;
        double valorBanana = 1.3;

        if (selecao01 == 1) {
            System.out.println(fruta1 + kg01 + "=" + valorMorango + (valorMorango*kg01));
        } else if (selecao02 == 2) {
            System.out.println(fruta2 + kg02 + "=" + valorMaca + (valorMaca*kg02));
        } else {
            System.out.println(fruta3 + kg03 + "=" + valorBanana + (valorBanana*kg03));
        }
        if (selecao02 == 1) {
            System.out.println(fruta1 + kg01 + "=" + valorMorango + (valorMorango*kg01));
        } else if (selecao02 == 2) {
            System.out.println(fruta2 + kg02 + "=" + valorMaca + (valorMaca*kg02));
        } else {
            System.out.println(fruta3 + kg03 + "=" + valorBanana + (valorBanana*kg03));
        }
        if (selecao03 == 1) {
            System.out.println(fruta1 + kg01 + "=" + valorMorango + (valorMorango*kg01));
        } else if (selecao02 == 2) {
            System.out.println(fruta2 + kg02 + "=" + valorMaca + (valorMaca*kg02));
        } else {
            System.out.println(fruta3 + kg03 + "=" + valorBanana + (valorBanana*kg03));
        }
        double valorTotal = (fruta2 * kg02)+(fruta1 * kg01)+(fruta3 * kg03);
        if (valorTotal >= 25) {
            int desconto = .1;
        System.out.println("O valor total da compra é" + (valorTotal-(valorTotal*desconto)));
    } else { System.out.println("O valor total da compra é" + valorTotal);
}
}
}