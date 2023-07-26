package Semestre02.Aula01RevisaoFPOO.Cadastro;

public abstract class Animal {
    // atributos
    String tipoAnimal;
    String nome;
    double peso;
    String sexo;
    String proprietario;

    // métodos
    // construtor cheio
    public Animal(String tipoAnimal, String nome, double peso, String especie, String sexo, String proprietario) {
        this.tipoAnimal = tipoAnimal;
        this.nome = nome;
        this.peso = peso;
        this.sexo = sexo;
        this.proprietario = proprietario;
    }

    // construtor vazio
    public Animal() {
    }

    // gets & sets
    public String getTipoAnimal() {
        return tipoAnimal;
    }

    public void setTipoAnimal(String tipoAnimal) {
        this.tipoAnimal = tipoAnimal;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public String getProprietario() {
        return proprietario;
    }

    public void setProprietario(String proprietario) {
        this.proprietario = proprietario;
    }
}
