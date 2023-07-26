package POOHeranca16052023.Pessoas;

public class Alunos extends Pessoas{
    // Atributos especificos
    private int nMatricula;
    private String curso;
    private String turma;

    // Metodos
    public int getnMatricula() {
        return nMatricula;
    }
    public void setnMatricula(int nMatricula) {
        this.nMatricula = nMatricula;
    }
    public String getCurso() {
        return curso;
    }
    public void setCurso(String curso) {
        this.curso = curso;
    }
    public String getTurma() {
        return turma;
    }
    public void setTurma(String turma) {
        this.turma = turma;
    }
    
}
