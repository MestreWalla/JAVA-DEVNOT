package Matriz;

import java.util.Random;
import java.util.Scanner;

public class MatrizExemplo {
    Scanner sc = new Scanner(System.in);
    Random rd = new Random();

    public void enxemplo1() {
        // gerar preencher, imprkimir e manipular matrizes
        // criar uma matriz 10x9
        int matriz[][] = new int[10][9]; // bidimensional 10x9
        // preencher minha matriz
        for (int i = 0; i < matriz.length; i++) { // 1ª dimensão ou linha
            for (int j = 0; j < matriz[0].length; j++) { // 2ª dimensão ou coluna
                // System.out.print("matriz["+i+"]["+j+"]");
                matriz[i][j] = rd.nextInt(10);
            }
        }
        // imprimir elemento por elemento da matriz
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                System.out.println("matriz[" + i + "][" + j + "]=" + matriz[i][j]);
            }
        }
        // imprimir a matriz em formato linha x coluna
        for (int i = 0; i < matriz.length; i++) {
            System.out.print("[ ");
            for (int j = 0; j < matriz[0].length; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println("]");
        }
        int soma = 0;
        for (int i = 0; i < matriz[9].length; i++) {
            soma += matriz[3][i];
        }
        System.out.println(soma);

        int somaC = 0;
        for (int i = 0; i < matriz[10].length; i++) {
            somaC += matriz[i][3];
        }
        System.out.println(somaC);
    }

    public void exercicio01() {
        int matriz[][] = new int[5][5];
        for (int i = 0; i < 5; i++) {
            matriz[i][i] = 1;
        }
        for (int i = 0; i < matriz.length; i++) {
            System.out.print("[ ");
            for (int j = 0; j < matriz[0].length; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println("]");
        }
    }

    public void exercicio02() {
        int matriz[][] = new int[4][4];
        for (int i = 0; i < matriz.length; i++) {
            System.out.print("[ ");
            for (int j = 0; j < matriz[0].length; j++) {
                matriz[i][j] = rd.nextInt(10);
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println("]");
        }
        System.out.println("-----------");
        for (int i = 0; i < matriz.length; i++) {
            System.out.print("[ ");
            for (int j = 0; j < matriz[0].length; j++) {
                System.out.print(matriz[j][i] + " ");
            }
            System.out.println("]");
        }
    }

    public void exercicio03() {
        // Faça um programa que preencha uma matriz 4 x 4 com o produto do valor da
        // linha e da coluna de cada elemento. Em seguida, imprima na tela a matriz.
        int matriz[][] = new int[4][4];
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                matriz[i][j] = (i + 1) * (j + 1);
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println("");
        }
    }

    public void exercicio04() {
        // Leia uma matriz 4 x 4(random), imprima a matriz e retorne a localização
        // (linha e a coluna) do maior valor.
        int matriz[][] = new int[4][4];
        for (int i = 0; i < matriz.length; i++) {
            System.out.print("[ ");
            for (int j = 0; j < matriz[0].length; j++) {
                matriz[i][j] = rd.nextInt(10);
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println("]");
        }
        System.out.println("-----------");
    }
}