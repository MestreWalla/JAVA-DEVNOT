package Semestre02.Aula03ArrayList;

import java.util.ArrayList;
import java.util.Collections;
// import java.util.List;

public class ExemploArrayList {
    public static void main(String[] args) {
        // Criando a ArrayList com objeto de nome carros
        ArrayList<String> carros = new ArrayList<String>(); // ArrayList (Elemento da correção)
        // List carros1 = new ArrayList<>(); // coleção
        carros.add("Fusca");
        carros.add("Brasilia");
        carros.add("Chevete");
        carros.add("Monza");
        carros.add("Monza");

        System.out.println(">>>>> Impressao de FOR <<<<<");
        for (int i = 0; i < carros.size(); i++) { // Iterando com laço for
            System.out.println(carros.get(i)); // Imprimindo ArrayList
        }
        
        // Ordenar uma lista (SORT - COLLECTIONS)
        System.out.println(">>>>> Organizado em ordem alfabetica com SORT - COLLECTIONS <<<<<");
        Collections.sort(carros); // Ordenar em ordem alfabetica
        Collections.reverse(carros); // Ordenar de forma reversa, sort deve ser usado primeiro
        
        // Iterando com For-Each
        System.out.println(">>>>> Impressao de FOR-EACH <<<<<");
        for (String i : carros) {
            System.out.println(i);
        }
        carros.clear(); // Apagar ArrayList
    }
}