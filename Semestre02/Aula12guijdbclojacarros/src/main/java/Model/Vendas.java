package Model;

public class Vendas {

    private String cpf;
    private String data;
    private String pagamento;

    public Vendas(String data, String pagamento, String cpf) {
        this.data = data;
        this.pagamento = pagamento;
        this.cpf = cpf;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public String getPagamento() {
        return pagamento;
    }

    public void setPagamento(String pagamento) {
        this.pagamento = pagamento;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
    
}
