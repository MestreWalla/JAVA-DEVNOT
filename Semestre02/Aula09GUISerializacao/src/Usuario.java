import java.io.Serializable;

public class Usuario implements Serializable {
    // Atributos
    private String nome;
    private int idade;
    // Metodos
    public Usuario(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
        
    }
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
    
}
