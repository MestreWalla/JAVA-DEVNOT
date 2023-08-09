package Semestre02.Aula03ArrayList;

import java.util.HashMap;

public class ExemploHashMap {
    public static void main(String[] args) {
        HashMap<String, String> capitaisCidades = new HashMap<>();
        capitaisCidades.put("SP", "São Paulo");
        capitaisCidades.put("RJ", "Rio de Janeiro");
        capitaisCidades.put("MG", "Minas Gerais");
        capitaisCidades.put("ES", "Espirito Santo");
        System.out.println(capitaisCidades.get("SP"));
        System.out.println(capitaisCidades.keySet());
        // Imprimir chaves e os valores
        System.out.println(capitaisCidades.entrySet());
        System.out.println("===================================================");
        // Criar Hash map com nome (chave) e idade (valor)
        HashMap<String, Integer> nomesIdades = new HashMap<>();
        nomesIdades.put("Maria", 58);
        nomesIdades.put("Gabriela", 35);
        nomesIdades.put("José", 63);
        nomesIdades.put("Claudio", 45);
        System.out.println("José" + nomesIdades.get("José"));
        System.out.println(nomesIdades.keySet());
        // Imprimir chaves e os valores
        System.out.println(nomesIdades.entrySet());

    }
}