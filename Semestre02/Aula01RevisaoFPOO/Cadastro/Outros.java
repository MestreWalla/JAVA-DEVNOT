package Semestre02.Aula01RevisaoFPOO.Cadastro;

public class Outros extends Animal {
    String especie;

    public Outros(String tipoAnimal, String nome, double peso, String especie, String sexo, String proprietario,
            String especie2) {
        super(tipoAnimal, nome, peso, especie, sexo, proprietario);
        especie = especie2;
    }

    public Outros(String especie) {
        this.especie = especie;
    }

    public String getEspecie() {
        return especie;
    }

    public void setEspecie(String especie) {
        this.especie = especie;
    }
    
}
