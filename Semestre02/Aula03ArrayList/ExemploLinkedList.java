package Semestre02.Aula03ArrayList;

import java.util.LinkedList;

public class ExemploLinkedList {
    // Criar uma lista usando elementos do linkedList
    public static void main(String[] args) {
        LinkedList<String> flores = new LinkedList<>();
        flores.add("Rosas");
        flores.add("Margarida");
        flores.addFirst("Begônias");
        flores.addLast("Cravos");
        System.out.println(flores.getFirst());
    }
}