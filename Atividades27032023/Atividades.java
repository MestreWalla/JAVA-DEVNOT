package Atividades27032023;

import java.util.Scanner;

/**
 * Atividades
 */
public class Atividades {
    Scanner sc = new Scanner(System.in);

    public void Atividade01() {
        // entradas
        System.out.println("Digite o nome do aluno:");
        String nome = sc.nextLine();
        System.out.println("Digite a idade do aluno:");
        int idade = sc.nextInt();
        sc.nextLine();
        System.out.println("Digite o sexo do aluno:");
        String sexo = sc.nextLine();
        System.out.println("Digite a altura do aluno:");
        double altura = sc.nextDouble();
        System.out.println("Digite o peso do aluno:");
        double peso = sc.nextDouble();

        // formulas
        double imc = peso / (altura * altura);
        double perder = imc - peso;
        double ganhar = peso - imc;

        // HOMEM
        // Menor que 20 = abaixo do peso.
        // Entre 20 a 24,9 = peso normal.
        // Entre 25 a 29 = obesidade leve.
        // Entre 28 a 99,9 = obesidade moderada.
        // Acima de 40 = obesidade mórbida.
        // MULHER
        // Menor que 19 = abaixo do peso.
        // Entre 19 a 23,9 = peso normal.
        // Entre 24 a 28,9 = obesidade leve.
        // Entre 29 a 38,9 = obesidade moderada.
        // Acima de 39 = obesidade mórbida.

        System.out.println("O peso ideal do aluno é: " + imc + "kg."); // peso ideal
        // Variaveis Masculino e Feminino
        if (sexo.equalsIgnoreCase("masculino") && imc <= 20) { // MASCULINO
            System.out.println("O aluno esta abaixo do peso e deve ganhar " + ganhar + "kg.");
            System.out.println(
                    "Sugerir Atividade Difícil, para melhorar a capacidade maxima de desempenho para treinos curtos e ganhar massa muscular.");
        } else if (sexo.equalsIgnoreCase("masculino") && imc > 20.1 && imc <= 24.9) {
            System.out.println("O aluno esta no peso normal.");
            System.out.println("Sugerir Atividade Moderada, para melhorar a capacidade aeróbica.");
        } else if (sexo.equalsIgnoreCase("masculino") && imc > 25 && imc <= 29) {
            System.out.println("O aluno com obesidade leve, e deve perder " + perder + "kg.");
            System.out.println("Sugerir Atividade Leve, para melhorar a resistência e promover a queima de gordura.");
        } else if (sexo.equalsIgnoreCase("masculino") && imc > 28 && imc <= 40) {
            System.out.println("O aluno esta com obesidade moderada, e deve perder " + perder + "kg.");
            System.out.println("Sugerir Atividade Leve, para melhorar a resistência e promover a queima de gordura.");
        } else if (sexo.equalsIgnoreCase("masculino") && imc > 40) {
            System.out.println("O aluno esta com obesidade mórbida, e deve perder " + perder + "kg.");
            System.out.println("Sugerir Atividade Leve, para melhorar a resistência e promover a queima de gordura.");
        } else if (sexo.equalsIgnoreCase("feminino") && imc <= 18.9) { // FEMININO
            System.out.println("A aluna esta abaixo do peso e deve ganhar " + ganhar + "kg.");
            System.out.println(
                    "Sugerir Atividade Difícil, para melhorar a capacidade maxima de desempenho para treinos curtos e ganhar massa muscular.");
        } else if (sexo.equalsIgnoreCase("feminino") && imc > 19 && imc <= 23.9) {
            System.out.println("A aluna esta no peso normal.");
            System.out.println("Sugerir Atividade Moderada, para melhorar a capacidade aeróbica.");
        } else if (sexo.equalsIgnoreCase("feminino") && imc > 24 && imc <= 28.9) {
            System.out.println("A aluna esta com obesidade leve, e deve perder " + perder + "kg.");
            System.out.println("Sugerir Atividade Leve, para melhorar a resistência e promover a queima de gordura.");
        } else if (sexo.equalsIgnoreCase("feminino") && imc > 29 && imc <= 39) {
            System.out.println("A aluna esta com obesidade moderada, e deve perder " + perder + "kg.");
            System.out.println("Sugerir Atividade Leve, para melhorar a resistência e promover a queima de gordura.");
        } else if (sexo.equalsIgnoreCase("feminino") && imc > 39) {
            System.out.println("A aluna esta com obesidade mórbida, e deve perder " + perder + "kg.");
            System.out.println("Sugerir Atividade Leve, para melhorar a resistência e promover a queima de gordura.");
        }

// Identificar a Faixa Etário do Aluno:
// Idade I - 16 a 25 anos
// Idade II - 25 a 35 anos
// Idade III – 36 a 45 anos
// Idade IV – 46 a 55 anos
// Idade V – 56 a 65 anos
// Idade VI – 66+

        String faixaEtaria = " ";

        if (idade >= 16 && idade < 25) {
            faixaEtaria = "Idade I";
            System.out.println("O aluno(a) " + nome + " esta na faixa etaria: " + faixaEtaria);
        } else if (idade >= 25 && idade < 35) {
            faixaEtaria = "Idade II";
            System.out.println("O aluno(a) " + nome + " esta na faixa etaria: " + faixaEtaria);
        } else if (idade >= 36 && idade < 45) {
            faixaEtaria = "Idade III";
            System.out.println("O aluno(a) " + nome + " esta na faixa etaria: " + faixaEtaria);
        } else if (idade >= 46 && idade < 55) {
            faixaEtaria = "Idade IV";
            System.out.println("O aluno(a) " + nome + " esta na faixa etaria: " + faixaEtaria);
        } else if (idade >= 56 && idade < 65) {
            faixaEtaria = "Idade V";
            System.out.println("O aluno(a) " + nome + " esta na faixa etaria: " + faixaEtaria);
        } else if (idade >= 66) {
            faixaEtaria = "Idade VI";
            System.out.println("O aluno(a) " + nome + " esta na faixa etaria: " + faixaEtaria);
        }
    }
}