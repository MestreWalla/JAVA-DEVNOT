import java.io.Serializable;

public class Agenda implements Serializable {

    // Atributos
    private String data;
    private String hora;
    private String nome;
    private String descricao;
    
    public Agenda(String data, String hora, String nome, String descricao) {
        this.data = data;
        this.hora = hora;
        this.nome = nome;
        this.descricao = descricao;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public String getHora() {
        return hora;
    }

    public void setHora(String hora) {
        this.hora = hora;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

}
