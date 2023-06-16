package Exercicio30052023;

import java.util.random.RandomGenerator;

import javax.swing.JOptionPane;

public class App {

    private static RandomGenerator rd;

    public static void main(String[] args) {
        // Criar um vetor de 10 objetos
        Agenda contatos[] = new Agenda[10];
        // Criar os objetos e preencher os atributos
        for (int i = 0; i < contatos.length; i++) {
            // Criar objeto
            contatos[i] = new Agenda();
            // Preencher os atributos
            contatos[i].setNome(JOptionPane.showInputDialog("Nome: "));
            contatos[i].setIdade(i + 18);
            contatos[i].setAltura(rd.nextDouble(1.5, 2));
        }
        // Procurar uma pessoa no vetor
        String nomeBuscado = JOptionPane.showInputDialog("Digite um nome para buscar na agenda");
        int cont = 0;
        boolean procurar = true;
        while (procurar) {
            if (nomeBuscado.equals(contatos[cont].getNome())) {
                procurar = false;
                contatos[cont].imprimir();
            }
            cont++;
        }
    }
}