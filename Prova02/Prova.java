package Prova02;

import java.util.Scanner;
import java.util.Random;

public class Prova {

    Scanner sc = new Scanner(System.in);
    Random rd = new Random();

    public void Atividade01() {
        // 1.Crie uma Classe que crie uma Matriz de Linha determinada pelo Usuário e
        // Coluna determinadas pelo Usuário
        // Preencha a Matriz com valores aleatórios entre 0 e 9 e imprimia a matriz
        // Substitua os valores da matriz anterior pelo seguinte sistema:
        // se i>j valor = 1
        // se i==j valor = 0
        // se j>i valor = 2

        System.out.println("Informe a quantidade de linhas: ");
        int linhas = sc.nextInt();
        System.out.println("Informe a quantidade de numeros: ");
        int numeros = sc.nextInt();
        // Criar Matriz
        int matriz[][] = new int[linhas][numeros];
        // Preencher Matriz
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                matriz[i][j] = rd.nextInt(10);
            }
        }
        // Imprimir Matriz [i][j]
        for (int i = 0; i < matriz.length; i++) {
            System.out.print("[ ");
            for (int j = 0; j < matriz[0].length; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println("]");
        }
        // Modificar Matriz [i][j] de acordo com as condições
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                if (matriz[i][j] > matriz[j][i]) {
                    matriz[i][j] = 1;
                } else if (matriz[i][j] == matriz[j][i]) {
                    matriz[i][j] = 0;
                } else if (matriz[i][j] < matriz[j][i]) {
                    matriz[i][j] = 2;
                }
            }
        }
        System.out.println("====================="); // Pular Linha
        // Imprimir matriz modificada
        for (int i = 0; i < matriz.length; i++) {
            System.out.print("[ ");
            for (int j = 0; j < matriz[0].length; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println("]");
        }
    }

    public void Atividade02() {
        // 2. Cria uma classe que:
        // Sortear um número de 0 a 1000 (dica: usar Math.random())
        // Pedir um palpite ao usuário. Se ele errar, informar se o palpite é maior ou
        // menor do que o número sorteado.
        // Pedir novos palpites até que o usuário acerte e, depois disso, mostrar em
        // quantas tentativas ele acertou.

        int numero = rd.nextInt(1000);// Numero Aleatorio de 0 a 999
        System.out.println("Adivinhe o numero que sorteei: ");
        int entrada = 0, i = 0; // Variavel armasena entrada e contador
        System.out.println("Digite um numero de 0 a 1000");
        while (entrada != numero) { // Diferente
            entrada = sc.nextInt(); // Entrada de dados
            if (entrada > numero) { // Maior que
                System.out.println("Você é um baita de um burrão.");
                System.out.println("é menor");
                i++; // Incrementa contador
            }
            if (entrada < numero) { // Menor que
                System.out.println("Você é um baita de um burrão.");
                System.out.println("é maior");
                i++; // Incrementa contador
            }
            System.out.println("Tenta outra:");
        }
        System.out.println("Acertou miseravi.");
        System.out.println("Voce acertou na " + i + "ª tentativa");
    }

    public void Atividade03() {
        // 3. Escreva um programa que:
        // Sortear o tamanho de uma vetor de minimo 100 e máximo 1000
        // Construir o vetor
        // Listar o vetor com números aleatórios de 1 a 100
        // Exibir apenas os números pares do vetor
        // Exibir apenas os números ímpares do vetor
        // Exibir a quantidade de números pares existem nas posições ímpares do vetor
        // Exibir a quantidade de números ímpares existem nas posições pares do vetor

        // Criar um vetor para os numeros
        int numeros[] = new int[900], contPar = 0, contImpar = 0;
        // Preencher os vetores
        for (int i = 0; i < numeros.length; i++) {
            int numerosRd = rd.nextInt(100) + 1;
            numeros[i] = numerosRd;
            if (numeros[i] % 2 == 0) { // Resto divisao = 0
                contPar++;
            } else {
                contImpar++;
            }
        }
        // Vetores Pares e Impares
        int nPar[] = new int[contPar], nImpar[] = new int[contImpar];
        // Distribuição nos vetores pares e impares
        contPar = 0;
        contImpar = 0;
        for (int i = 0; i < numeros.length; i++) {
            if (numeros[i] % 2 == 0) {
                nPar[contPar] = numeros[i];
                contPar++;
            } else {
                nImpar[contImpar] = numeros[i];
                contImpar++;
            }
        }
        // Imprimir números
        System.out.println("Pares: ");
        for (int i = 0; i < contPar; i++) {
            System.out.print(nPar[i] + " ");
        }
        System.out.println(); // Pular linha
        System.out.println("Ímpares: ");
        for (int i = 0; i < contImpar; i++) {
            System.out.print(nImpar[i] + " ");
        }
        System.out.println(); // Pular linha
        System.out.println("Pares: " + contPar + " Impares: " + contImpar); // Imprimir quantidade
    }
}
