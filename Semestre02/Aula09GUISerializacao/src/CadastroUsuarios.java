import javax.swing.*;
import javax.swing.UIManager.LookAndFeelInfo;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.File;
import java.util.ArrayList;
import java.util.List;

public class CadastroUsuarios extends JPanel {
    // Atributos
    private JPanel cadastro;
    private JTextField inputNome;
    private JTextField inputIdade;
    
    private DefaultTableModel tableModel;
    private JTable table;
    private List<Usuario> usuarios = new ArrayList<>();
    private int linhaSelecionada = -1;

    // Construtor
    public CadastroUsuarios() {

        // Aplica o visual Nimbus à interface
        AplicaNimbusLookAndFeel.pegaNimbus();

        // Modelagem e criação da tabela
        tableModel = new DefaultTableModel(); // Cria um modelo de tabela vazio
        tableModel.addColumn("Nome"); // Adiciona uma coluna "Nome" ao modelo
        tableModel.addColumn("Idade"); // Adiciona uma coluna "Idade" ao modelo
        table = new JTable(tableModel); // Cria uma tabela usando o modelo
        JScrollPane scrollPane = new JScrollPane(table); // Cria um painel rolável para a tabela

        // Declaração dos componentes
        inputNome = new JTextField(20); // Cria um campo de texto com 20 colunas
        inputIdade = new JTextField(5); // Cria um campo de texto com 5 colunas
        JButton cadastrarButton = new JButton("Cadastrar"); // Cria um botão "Cadastrar"
        JButton atualizarButton = new JButton("Atualizar"); // Cria um botão "Atualizar"
        JButton apagarButton = new JButton("Apagar"); // Cria um botão "Apagar"
        JButton apagarTodosButton = new JButton("Apagar Todos"); // Cria um botão "Apagar Todos"
        JButton salvarButton = new JButton("Salvar"); // Cria um botão "Salvar"

        JPanel inputPanel = new JPanel(); // Cria um painel para os componentes de entrada
        inputPanel.add(new JLabel("Nome:")); // Adiciona um rótulo "Nome" ao painel
        inputPanel.add(inputNome); // Adiciona o campo de texto "inputNome" ao painel
        inputPanel.add(new JLabel("Idade:")); // Adiciona um rótulo "Idade" ao painel
        inputPanel.add(inputIdade); // Adiciona o campo de texto "inputIdade" ao painel
        inputPanel.add(cadastrarButton); // Adiciona o botão "Cadastrar" ao painel
        inputPanel.add(atualizarButton); // Adiciona o botão "Atualizar" ao painel
        inputPanel.add(apagarButton); // Adiciona o botão "Apagar" ao painel
        inputPanel.add(apagarTodosButton); // Adiciona o botão "Apagar Todos" ao painel
        inputPanel.add(salvarButton); // Adiciona o botão "Salvar" ao painel
        
        cadastro = new JPanel(new BorderLayout()); // Cria o painel "cadastro"
        add(cadastro);
        cadastro.add(inputPanel, BorderLayout.NORTH); // Adiciona o painel de entrada ao "cadastro"
        cadastro.add(scrollPane, BorderLayout.CENTER); // Adiciona a tabela rolável ao "cadastro"


        File arquivo = new File("dados.txt"); // Cria um objeto de arquivo para "dados.txt"
        if (arquivo.exists()) { // Verifica se o arquivo existe
            usuarios = Serializacao.deserializar("dados.txt"); // Deserializa dados do arquivo
            atualizarTabela(); // Atualiza a tabela com os dados carregados
        }

        // Configura um ouvinte de mouse para a tabela
        table.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent evt) {
                linhaSelecionada = table.rowAtPoint(evt.getPoint()); // Obtém a linha clicada
                if (linhaSelecionada != -1) {
                    inputNome.setText((String) table.getValueAt(linhaSelecionada, 0)); // Preenche o campo "Nome" com o valor da coluna 0
                    inputIdade.setText(table.getValueAt(linhaSelecionada, 1).toString()); // Preenche o campo "Idade" com o valor da coluna 1
                }
            }
        });

        OperacoesUsuarios operacoes = new OperacoesUsuarios(usuarios, tableModel, table); // Cria um objeto para operações com usuários

        // Configura os ouvintes de eventos para os botões
        cadastrarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                operacoes.cadastrarUsuario(inputNome.getText(), inputIdade.getText()); // Chama o método de cadastro
                inputNome.setText(""); // Limpa o campo "Nome"
                inputIdade.setText(""); // Limpa o campo "Idade"
            }
        });

        atualizarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                operacoes.atualizarUsuario(linhaSelecionada, inputNome.getText(), inputIdade.getText()); // Chama o método de atualização
            }
        });

        apagarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                operacoes.apagarUsuario(linhaSelecionada); // Chama o método de exclusão
            }
        });

        apagarTodosButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                operacoes.apagarTodosUsuarios(); // Chama o método de exclusão de todos os usuários
            }
        });

        salvarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                operacoes.salvarUsuarios(); // Chama o método de salvar os usuários
            }
        });
    }

    // Outros métodos
    private void atualizarTabela() {
        tableModel.setRowCount(0); // Limpa todas as linhas da tabela
        for (Usuario usuario : usuarios) {
            tableModel.addRow(new Object[] { usuario.getNome(), usuario.getIdade() }); // Adiciona dados à tabela
        }
    }

    // Classe interna para aplicar o estilo Nimbus
    public class AplicaNimbusLookAndFeel {
        private AplicaNimbusLookAndFeel() {
        }

        public static void pegaNimbus() {
            try {
                for (LookAndFeelInfo info : UIManager.getInstalledLookAndFeels()) {
                    if ("Nimbus".equals(info.getName())) { // Verifica se o estilo "Nimbus" está disponível
                        UIManager.setLookAndFeel(info.getClassName()); // Aplica o estilo Nimbus
                        break;
                    }
                }
            } catch (UnsupportedLookAndFeelException e) {
                System.out.println("Erro: " + e.getMessage());
                e.printStackTrace();
            } catch (ClassNotFoundException e) {
                System.out.println("Erro: " + e.getMessage());
                e.printStackTrace();
            } catch (InstantiationException e) {
                System.out.println("Erro: " + e.getMessage());
                e.printStackTrace();
            } catch (IllegalAccessException e) {
                System.out.println("Erro: " + e.getMessage());
                e.printStackTrace();
            }
        }
    }
}
