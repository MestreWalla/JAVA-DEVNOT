package Semestre01.POOBanco06062023.Conta;

public class ContaPJ extends ContaParametros {
    // atributos
    private String nCnpj;
    private String nomePJ;

    // métodos
    public String getnCnpj() {
        return nCnpj;
    }

    public void setnCnpj(String nCnpj) {
        this.nCnpj = nCnpj;
    }

    public String getNomePJ() {
        return nomePJ;
    }

    public void setNomePJ(String nomePJ) {
        this.nomePJ = nomePJ;
    }
}
