package Semestre02.Aula03ArrayList;

import java.util.ArrayList;
import java.util.Collections;

import javax.swing.JOptionPane;

public class Exercicio01 {
    public static void main(String[] args) {
        // Criar um array list com 5 numeros, e imprimir em ordem normal e reversa
        ArrayList<Integer> numeros = new ArrayList<Integer>();
        for (int i = 0; i < 5; i++) {
            numeros.add(Integer.parseInt(JOptionPane.showInputDialog("Digite um Nº")));
        }

        System.out.println(">>>>> Impressao de Armazenamento <<<<<");
        for (Integer i : numeros) {
            System.out.println(i);
        }

        Collections.sort(numeros);
        System.out.println(">>>>> Impressao Ordenada <<<<<");
        for (Integer i : numeros) {
            System.out.println(i);
        }

        Collections.reverse(numeros);
        System.out.println(">>>>> Impressao Reversa <<<<<");
        for (Integer i : numeros) {
            System.out.println(i);
        }
    }
}
