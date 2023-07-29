package Semestre02.Aula01RevisaoFPOO.Cadastro;

public class Outros extends Animal {
    String especie;

    public Outros(double data, String informaçoes, String tipoAnimal, String nome, double peso, String sexo,
            String proprietario, String especie) {
        super(data, informaçoes, tipoAnimal, nome, peso, sexo, proprietario);
        this.especie = especie;
    }

    public String getEspecie() {
        return especie;
    }

    public void setEspecie(String especie) {
        this.especie = especie;
    }

}
