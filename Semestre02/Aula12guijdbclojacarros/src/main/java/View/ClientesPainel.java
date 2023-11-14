package View;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;

import Controller.ClientesControl;
import Controller.ClientesDAO;
import Model.Clientes;

import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.List;

public class ClientesPainel extends JPanel {
    private JButton cadastrar, editar, apagar;
    private JTextField nomeField, cpfField, telefoneField, emailField, enderecoField;
    private List<Clientes> clientes;
    private JTable table;
    private DefaultTableModel tableModel;
    private int linhaSelecionada = -1;

    public ClientesPainel() {
        super();
        setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));

        // Componentes
        add(new JLabel("Cadastro Clientes"));
        JPanel inputPanel = new JPanel();
        inputPanel.setLayout(new GridLayout(5, 2));

        inputPanel.add(new JLabel("Nome"));
        nomeField = new JTextField(20);
        inputPanel.add(nomeField);

        inputPanel.add(new JLabel("CPF"));
        cpfField = new JTextField(20);
        inputPanel.add(cpfField);

        inputPanel.add(new JLabel("Telefone"));
        telefoneField = new JTextField(20);
        inputPanel.add(telefoneField);

        inputPanel.add(new JLabel("E-mail"));
        emailField = new JTextField(20);
        inputPanel.add(emailField);

        inputPanel.add(new JLabel("Endereço"));
        enderecoField = new JTextField(20);
        inputPanel.add(enderecoField);

        add(inputPanel);

        JPanel botoes = new JPanel();
        botoes.add(cadastrar = new JButton("Cadastrar"));
        botoes.add(editar = new JButton("Editar"));
        botoes.add(apagar = new JButton("Apagar"));
        add(botoes);

        // Dicas de uso
        cadastrar.setToolTipText("Cadastrar novo carro");
        editar.setToolTipText("Editar registro selecionado");
        apagar.setToolTipText("Apagar registro selecionado");

        // Tratamentos de eventos para os botões e a tabela

        JScrollPane jSPane = new JScrollPane();
        add(jSPane);
        tableModel = new DefaultTableModel(new Object[][] {}, new String[] { "Nome", "CPF", "Telefone", "Email" });
        table = new JTable(tableModel);
        jSPane.setViewportView(table);

        new ClientesDAO().criaTabela();
        atualizarTabela();

        // Tratamento de eventos na tabela
        table.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent evt) {
                linhaSelecionada = table.rowAtPoint(evt.getPoint());
                if (linhaSelecionada != -1) {
                    // Preencha os campos de texto com os dados da linha selecionada
                    nomeField.setText((String) table.getValueAt(linhaSelecionada, 0));
                    // Preencha os outros campos...
                }
            }
        });

        // Cria um objeto operacoes da classe ClientesControl para executar operações no
        // banco de dados
        ClientesControl operacoes = new ClientesControl(clientes, tableModel, table);

        // Tratamento do botão "Cadastrar"
        cadastrar.addActionListener(e -> {
            // Adicione aqui o código para cadastrar um novo cliente
            // ...
            // Limpe os campos após o cadastro bem-sucedido
            nomeField.setText("");
            // Limpe os outros campos...
        });

        // Tratamento do botão "Editar"
        editar.addActionListener(e -> {
            // Adicione aqui o código para editar o cliente
            // ...
            // Limpe os campos após a edição, independentemente do sucesso ou falha
            nomeField.setText("");
            // Limpe os outros campos...
        });

        // Tratamento do botão "Apagar"
        apagar.addActionListener(e -> {
            // Adicione aqui o código para apagar o cliente
            // ...
            // Limpe os campos após a exclusão, independentemente do sucesso ou falha
            nomeField.setText("");
            // Limpe os outros campos...
        });
    }

    private void atualizarTabela() {
    }

    // Adicione aqui os métodos necessários para atualizar a tabela, semelhante ao
    // exemplo de CarrosPainel.
    // ...
}
