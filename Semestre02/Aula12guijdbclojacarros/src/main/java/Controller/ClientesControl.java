package Controller;

import java.util.List;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

import Model.Clientes;

public class ClientesControl {

    private List<Clientes> clientes;
    private DefaultTableModel tableModel;
    private JTable table;

    public ClientesControl(List<Clientes> clientes, DefaultTableModel tableModel, JTable table) {
        this.clientes = clientes;
        this.tableModel = tableModel;
        this.table = table;
    }

    public void cadastrar(String nome, String cpf, String telefone, String email) {
        // Adicione aqui a lógica para cadastrar um novo cliente no banco de dados
        // Exemplo: ClientesDAO.cadastrar(nome, cpf, telefone, email);

        // Atualiza a tabela após o cadastro
        atualizarTabela();
    }

    public void atualizar(String nome, String cpf, String telefone, String email) {
        // Adicione aqui a lógica para atualizar um cliente no banco de dados
        // Exemplo: ClientesDAO.atualizar(nome, cpf, telefone, email);

        // Atualiza a tabela após a edição
        atualizarTabela();
    }

    public void apagar(String cpf) {
        // Adicione aqui a lógica para apagar um cliente do banco de dados
        // Exemplo: ClientesDAO.apagar(cpf);

        // Atualiza a tabela após a exclusão
        atualizarTabela();
    }

    private void atualizarTabela() {
        // Adicione aqui a lógica para atualizar a tabela com os dados do banco de dados
        // Exemplo: clientes = ClientesDAO.listarTodos();

        // Limpa todas as linhas existentes na tabela
        tableModel.setRowCount(0);

        // Adiciona os clientes à tabela
        for (Clientes cliente : clientes) {
            tableModel.addRow(new Object[] { cliente.getNome(), cliente.getCPF(), cliente.getTelefone(), cliente.getEmail() });
        }
    }
}
