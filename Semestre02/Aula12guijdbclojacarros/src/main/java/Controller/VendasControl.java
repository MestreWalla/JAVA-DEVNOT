package Controller;

import java.util.List;

import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

import Model.Vendas;

public class VendasControl {

    private List<Vendas> vendas;
    private DefaultTableModel tableModel;
    private JTable table;

    public VendasControl(List<Vendas> vendas, DefaultTableModel tableModel, JTable table) {
        this.vendas = vendas;
        this.tableModel = tableModel;
        this.table = table;
    }

    public void cadastrar(String data, String pagamento, String cpf) {
        new VendasDAO().cadastrar(data, pagamento, cpf);
        atualizarTabela(); // Atualiza a tabela de exibição após o cadastro
    }

    public void atualizar(String data, String pagamento, String cpf) {
        new VendasDAO().atualizar(data, pagamento, cpf);
        atualizarTabela(); // Atualiza a tabela de exibição após a atualização
    }

    public void apagar(String cpf) {
        new VendasDAO().apagar(cpf);
        // Atualiza a tabela após a exclusão
        atualizarTabela();
    }

    private void atualizarTabela() {

        tableModel.setRowCount(0); // Limpa todas as linhas existentes na tabela
        vendas = new VendasDAO().listarTodos();
        // Obtém os clientes atualizados do banco de dados
        for (Vendas vendas : vendas) {
            // Adiciona os dados de cada vendas como uma nova linha na tabela Swing
            tableModel.addRow(new Object[] { vendas.getData(), vendas.getPagamento(),
                    vendas.getCpf() });
        }

        // Limpa todas as linhas existentes na tabela
        tableModel.setRowCount(0);

        // Adiciona os clientes à tabela
        for (Vendas venda : vendas) {
            tableModel.addRow(new Object[] { venda.getData(), venda.getPagamento(), venda.getCpf() });
        }
    }
}
