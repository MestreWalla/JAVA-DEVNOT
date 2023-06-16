package POOExercicio306062023;

public class Elevador {
    // Atributos
    int qtdPessoasAtual;
    int qtdMaxPessoas;
    int nMaxAndares;
    int andarAtual;

    // Métodos
    // Contrutor
    public Elevador(int qtdMaxPessoas, int nMaxAndares) {
        this.qtdMaxPessoas = qtdMaxPessoas;
        this.nMaxAndares = nMaxAndares;
    }

    // Sets e Gets
    public int getQtdPessoasAtual() {
        return qtdPessoasAtual;
    }

    public void setQtdPessoasAtual(int qtdPessoasAtual) {
        this.qtdPessoasAtual = qtdPessoasAtual;
    }

    public int getAndarAtual() {
        return andarAtual;
    }

    public void setAndarAtual(int andarAtual) {
        this.andarAtual = andarAtual;
    }

    // Metodos
    // Inicializa
    public void inicializa() {
        andarAtual = 0;
        qtdPessoasAtual = 0;
    }

    // Entrar
    public int entrar() {
        if (qtdPessoasAtual < qtdMaxPessoas) {
            qtdPessoasAtual++;
        } else {
            System.out.println("You shold not pass");
        }
        return qtdPessoasAtual;
    }
    // Sair
    public int sair() {
        if (qtdPessoasAtual > qtdMaxPessoas) {
            qtdPessoasAtual--;
        } else {
            System.out.println("Is everybody here?");
        }
        return qtdPessoasAtual;
    }
    // Subir
    public int subir(int nAndares) {
        if(andarAtual+nAndares<=nMaxAndares) {
            andarAtual += nAndares;
        } else {
            System.out.println("Informe um número válido");
        }
        return andarAtual;
    }
    // Descer
    public int descer(int nAndares) {
        if(andarAtual-nAndares>=0) {
            andarAtual -= nAndares;
        } else {
            System.out.println("Informe um número válido");
        }
        return andarAtual;
    }
}
