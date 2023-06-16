package ExerciciosWhile;

import java.util.Scanner;

/**
 * ExerciciosWhile
 */
public class ExerciciosWhile {
    Scanner sc = new Scanner(System.in);

    public void Exercicio04() {
        // Faça um programa que leia um vetor de 10 caracteres, e diga quantas
        // consoantes foram lidas. Imprima as consoantes.
        String letras[] = new String[] { "a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o", "p",
                "q", "r", "s", "t", "u", "v", "w", "x", "y", "z" }; // Declaração e criação de um vetor de strings
        int i = 0; // Variável de controle do loop para iterar sobre o vetor letras
        int consoantes = 0; // Variável para contagem de consoantes, iniciando em 0
        int vogais = 0; // Variável para contagem de vogais
        // Leitura dos caracteres do vetor letras
        while (i < letras.length) { // Loop while para ler os caracteres do usuário e armazená-los no vetor letras
            if (letras[i].equalsIgnoreCase("a") || letras[i].equalsIgnoreCase("e") || letras[i].equalsIgnoreCase("i")
                    || letras[i].equalsIgnoreCase("o") || letras[i].equalsIgnoreCase("u")) {// Verificar se é vogal
                vogais++; // Incrementa o contador de vogais
                System.out.println(letras[i] + " é vogal"); // Imprime a letra atual se for uma vogal
            } else {
                consoantes++; // Incrementa o contador de consoantes
                System.out.println(letras[i] + " é consoante"); // Imprime a letra atual se for uma consoante
            }
            i++; // Incrementa o iterador do loop
        }
        System.out.println("O nº de consoantes é " + consoantes); // Imprime o número de consoantes
        System.out.println("O nº de vogais é " + vogais); // Imprime o número de vogais
    }

    public void Exercicio04B() {
        // Declaração e inicialização de um vetor de strings chamado letras com 26
        // letras do alfabeto
        String letras[] = new String[] { "a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o", "p",
                "q", "r", "s", "t", "u", "v", "w", "x", "y", "z", };
        int i = 0; // Variável de controle do loop para iterar sobre o vetor letras
        int consoantes = 0; // Variável para contagem de consoantes, iniciando em 0
        while (i < letras.length) { // Loop while para iterar sobre cada letra do vetor letras
            switch (letras[i]) { // Utilização de um switch para verificar cada letra
                case "a":
                case "e":
                case "i":
                case "o":
                case "u":
                    break; // Caso a letra seja uma vogal, não faz nada e passa para a próxima letra
                default: // Similar ao else
                    consoantes++; // Caso a letra seja uma consoante, incrementa o contador de consoantes
                    System.out.println(letras[i] + " é consoante"); // Imprime a letra atual se for uma consoante
            }
            i++;
        }
        System.out.println("o nº de consoantes é " + consoantes); // Imprime o número de consoantes contadas
    }

    // Faça um programa que leia 20 numeros inteiros e armazene-os num vetor.
    // Aarmazene os numeros pares no vetor PAR e os numeros impares no vetor IMPAR.
    // Imprima ostres valores.
    public void Exercicio05() {
        int numeros[] = new int[] { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20 };
        int par = 0, imp = 0, i = 0;
        String impares = "", pares = "";
        while (i < numeros.length) {
            if (numeros[i] % 2 != 0) {
                imp++;
                if (impares.isEmpty()) {
                    impares += numeros[i];
                } else {
                    impares += ", " + numeros[i];
                }
            } else if (numeros[i] % 2 != 1) {
                par++;
                if (pares.isEmpty()) {
                    pares += numeros[i];
                } else {
                    pares += ", " + numeros[i];
                }
            }
            i++;
        }
        System.out.println(imp + " numeros impares, com os seguintes numeros: " + impares);
        System.out.println(par + " números pares, com os seguintes numeros: " + pares);
    }

    // Faça um programa que peça as quatro notas de 10 lunos, calcule e armazene num
    // vetor a média de cada aluno, imprima o número de alunos com média maior ou
    // igual a 7.
    public void Exercicio06() {
        int media01[] = new int[4];
        int i = 0;
        while (i < media01.length) {
            int nota = sc.nextInt();
            media01[i] = nota;
            i++;
        }
        
        System.out.println(media01);
    }

    // Faça um programa que leia um vetor de 5 números inteiros, mostre a soma, a
    // multiplicação e os números.
    public void Exercicio07() {
    }

    // faça um programa que peça a idade e altura de 5 pessoas, armazene cada
    // informação no seu respectivo vetor. Imprma a idade e a altura na ordem
    // inversa a ordem lida.
    public void Exercicio08() {
    }

    // Faça um programa que leia um vetorA com 10 números inteiros, calcule e mostre
    // a soma dos quadrados dos elementos do vetor.
    public void Exercicio09() {
    }
}