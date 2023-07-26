package Semestre02.Aula01RevisaoFPOO.Cadastro;

public class Cachorro extends Animal {
    String raca;
    String corPredominante;
    
    public Cachorro(String tipoAnimal, String nome, double peso, String especie, String sexo, String proprietario,
            String raca, String corPredominante) {
        super(tipoAnimal, nome, peso, especie, sexo, proprietario);
        this.raca = raca;
        this.corPredominante = corPredominante;
    }
    public Cachorro(String raca, String corPredominante) {
        this.raca = raca;
        this.corPredominante = corPredominante;
    }
    public String getRaca() {
        return raca;
    }
    public void setRaca(String raca) {
        this.raca = raca;
    }
    public String getCorPredominante() {
        return corPredominante;
    }
    public void setCorPredominante(String corPredominante) {
        this.corPredominante = corPredominante;
    }
    
}
