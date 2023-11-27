package Controller;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import Connection.ConnectionFactory;
import Model.Vendas;

public class VendasDAO {
   
    // atributo
    private Connection connection;
    private List<Vendas> vendas;

    // Construtor
    public VendasDAO() {
        this.connection = ConnectionFactory.getConnection();
    }

    public void criaTabela() {
        String sql = "CREATE TABLE IF NOT EXISTS vendas (DATA VARCHAR(255),PAGAMENTO VARCHAR(255), CPF VARCHAR(255) PRIMARY KEY)";
        try (Statement stmt = this.connection.createStatement()) {
            stmt.execute(sql);
            System.out.println("Tabela VENDA criada com sucesso.");
        } catch (SQLException e) {
            throw new RuntimeException("Erro ao criar a tabela: " + e.getMessage(), e);
        } finally {
            ConnectionFactory.closeConnection(this.connection);
        }
    }

    public void cadastrar(String data, String pagamento, String cpf) {
        PreparedStatement stmt = null;
        // Define a instrução SQL parametrizada para cadastrar na tabela
        String sql = "INSERT INTO vendas (data, pagamento, cpf) VALUES (?, ?, ?)";
        try {
            stmt = connection.prepareStatement(sql);
            stmt.setString(1, data);
            stmt.setString(2, pagamento);
            stmt.setString(3, cpf);
            stmt.executeUpdate();
            System.out.println("Dados inseridos com sucesso");
        } catch (SQLException e) {
            throw new RuntimeException("Erro ao atualizar dados no banco de dados.", e);
        } finally {
            ConnectionFactory.closeConnection(connection, stmt);
        }
    }

    public void atualizar(String data, String pagamento, String cpf) {
        PreparedStatement stmt = null;
        // Define a instrução SQL parametrizada para atualizar dados pela placa
        String sql = "UPDATE vendas SET data=?, pagamento=?, WHERE cpf=?,";
        try {
            stmt = connection.prepareStatement(sql);
            stmt.setString(1, data);
            stmt.setString(2, pagamento);
            stmt.setString(3, cpf);
            stmt.executeUpdate();
            System.out.println("Dados atualizados com sucesso");
        } catch (SQLException e) {
            throw new RuntimeException("Erro ao atualizar dados no banco de dados.", e);
        } finally {
            ConnectionFactory.closeConnection(connection, stmt);
        }
    }

    public void apagar(String cpf) {
        PreparedStatement stmt = null;
        String sql = "DELETE FROM vendas WHERE cpf=?";
        try {
            stmt = connection.prepareStatement(sql);
            stmt.setString(1, cpf);
            stmt.executeUpdate();
        } catch (SQLException e) {
            throw new RuntimeException("Erro ao apagar dados no banco de dados.", e);
        } finally {
            ConnectionFactory.closeConnection(connection, stmt);
        }
    }

    public List<Vendas> listarTodos() {
        PreparedStatement stmt = null;
        ResultSet resultSet = null;
        vendas = new ArrayList<>();
        try {
            stmt = connection.prepareStatement("SELECT * FROM vendas");
            resultSet = stmt.executeQuery();
            while (resultSet.next()) {
                String data = resultSet.getString("data");
                String pagamento = resultSet.getString("pagamento");
                String cpf = resultSet.getString("cpf");
                vendas.add(new Vendas(data, pagamento, cpf));
            }
        } catch (SQLException ex) {
            System.out.println(ex); // Em caso de erro durante a consulta, imprime o erro
        } finally {
            ConnectionFactory.closeConnection(connection, stmt, resultSet);
        }
        return vendas; // Retorna a lista de vendas recuperados do banco de dados
    }
}
