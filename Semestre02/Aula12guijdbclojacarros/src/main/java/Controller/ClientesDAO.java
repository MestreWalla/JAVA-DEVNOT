package Controller;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import Model.Clientes;

public class ClientesDAO {

    private static final String URL = "jdbc:sqlite:clientes.db"; // Altere para a URL do seu banco de dados SQLite

    public void criaTabela() {
        try (Connection connection = DriverManager.getConnection(URL)) {
            String sql = "CREATE TABLE IF NOT EXISTS clientes (" +
                    "id INTEGER PRIMARY KEY AUTOINCREMENT," +
                    "nome TEXT NOT NULL," +
                    "cpf TEXT NOT NULL UNIQUE," +
                    "telefone TEXT," +
                    "email TEXT" +
                    ")";
            try (PreparedStatement statement = connection.prepareStatement(sql)) {
                statement.executeUpdate();
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void cadastrar(String nome, String cpf, String telefone, String email) {
        try (Connection connection = DriverManager.getConnection(URL)) {
            String sql = "INSERT INTO clientes (nome, cpf, telefone, email) VALUES (?, ?, ?, ?)";
            try (PreparedStatement statement = connection.prepareStatement(sql)) {
                statement.setString(1, nome);
                statement.setString(2, cpf);
                statement.setString(3, telefone);
                statement.setString(4, email);
                statement.executeUpdate();
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void atualizar(String nome, String cpf, String telefone, String email) {
        try (Connection connection = DriverManager.getConnection(URL)) {
            String sql = "UPDATE clientes SET nome=?, telefone=?, email=? WHERE cpf=?";
            try (PreparedStatement statement = connection.prepareStatement(sql)) {
                statement.setString(1, nome);
                statement.setString(2, telefone);
                statement.setString(3, email);
                statement.setString(4, cpf);
                statement.executeUpdate();
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void apagar(String cpf) {
        try (Connection connection = DriverManager.getConnection(URL)) {
            String sql = "DELETE FROM clientes WHERE cpf=?";
            try (PreparedStatement statement = connection.prepareStatement(sql)) {
                statement.setString(1, cpf);
                statement.executeUpdate();
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public List<Clientes> listarTodos() {
        List<Clientes> clientes = new ArrayList<>();
        try (Connection connection = DriverManager.getConnection(URL)) {
            String sql = "SELECT * FROM clientes";
            try (PreparedStatement statement = connection.prepareStatement(sql)) {
                try (ResultSet resultSet = statement.executeQuery()) {
                    while (resultSet.next()) {
                        String nome = resultSet.getString("nome");
                        String cpf = resultSet.getString("cpf");
                        String telefone = resultSet.getString("telefone");
                        String email = resultSet.getString("email");
                        clientes.add(new Clientes(nome, cpf, telefone, email));
                    }
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return clientes;
    }
}
