package Exercicio30052023;

import javax.swing.JOptionPane;

public class Agenda {
    // atributos
    String nome;
    int idade;
    double altura;

    // Metodos
    // "ctor" - cria um construtor vazio
    // Construtor com parametros (valores atribuidos na constrçao)
    public Agenda(String nome, int idade, double altura) {
        this.nome = nome;
        this.idade = idade;
        this.altura = altura;
    }
    // Construtor Vazio
    public Agenda() {
        super();
    }
    // Sets and gets
    // "gets" busca um valor "sets" atribui valor a variavel
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }
    // Metodos definidos pelo programador
    // Imprimir
    public void imprimir () {
        JOptionPane.showMessageDialog(null, "\nNome: " + nome + "\nIdade: " + idade + "\nAltura: " + altura);
    }
}