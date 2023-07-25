package POOHeranca16052023.Pessoas;

public class Professores extends Funcionarios{
    private String materia;
    private String contrato;
    private int ninf;
    
    public String getMateria() {
        return materia;
    }
    public void setMateria(String materia) {
        this.materia = materia;
    }
    public String getContrato() {
        return contrato;
    }
    public void setContrato(String contrato) {
        this.contrato = contrato;
    }
    public int getNinf() {
        return ninf;
    }
    public void setNinf(int ninf) {
        this.ninf = ninf;
    }

}
