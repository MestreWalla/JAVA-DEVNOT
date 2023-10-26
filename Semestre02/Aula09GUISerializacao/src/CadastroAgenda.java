import java.awt.BorderLayout;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ArrayList;
import java.util.List;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

    public class CadastroAgenda extends JPanel {
        // Atributos
        private JPanel cadastroAgenda;
        private JTextField inputNome;
        private JTextField inputData;
        private JTextField inputHora;
        private JTextField inputDescricao;

        private DefaultTableModel tableModel;
        private JTable table;
        private List<Agenda> agendas = new ArrayList<>();
        private int linhaSelecionada = -1;

        public void cadastroAgendas() {

         // Modelagem e criação da tabela
        tableModel = new DefaultTableModel(); // Cria um modelo de tabela vazio
        tableModel.addColumn("Nome"); // Adiciona uma coluna "Nome" ao modelo
        tableModel.addColumn("Data");
        tableModel.addColumn("Hora");
        tableModel.addColumn("Descrição");
        table = new JTable(tableModel); // Cria uma tabela usando o modelo
        JScrollPane scrollPane = new JScrollPane(table); // Cria um painel rolável para a tabela

            JPanel inputPanel = new JPanel(); // Cria um painel para os componentes de entrada
            
                inputNome = new JTextField(10); // Cria um campo de texto com 20 colunas
                    inputPanel.add(new JLabel("Nome:")); // Adiciona um rótulo "Nome" ao painel
                    inputPanel.add(inputNome); // Adiciona o campo de texto "inputNome" ao painel
            
                inputData = new JTextField(8); // Cria um campo de texto com 20 colunas
                    inputPanel.add(new JLabel("Data:")); // Adiciona um rótulo "Nome" ao painel
                    inputPanel.add(inputData); // Adiciona o campo de texto "inputNome" ao painel

                inputHora = new JTextField(5); // Cria um campo de texto com 5 colunas
                    inputPanel.add(new JLabel("Hora:")); // Adiciona um rótulo "Idade" ao painel
                    inputPanel.add(inputHora); // Adiciona o campo de texto "inputIdade" ao painel

                inputDescricao = new JTextField(5); // Cria um campo de texto
                    inputPanel.add(new JLabel("Descricao:")); // Adiciona um rótulo "descrição" ao painel
                    inputPanel.add(inputDescricao); // Adiciona o campo de texto "inputDescricao" ao painel

                JButton cadastrarButton = new JButton("Cadastrar"); // Cria um botão "Cadastrar"
                    inputPanel.add(cadastrarButton); // Adiciona o botão "Cadastrar" ao painel

                JButton atualizarButton = new JButton("Atualizar"); // Cria um botão "Atualizar"
                    inputPanel.add(atualizarButton); // Adiciona o botão "Atualizar" ao painel

                JButton apagarButton = new JButton("Apagar"); // Cria um botão "Apagar"
                    inputPanel.add(apagarButton); // Adiciona o botão "Apagar" ao painel

                JButton salvarButton = new JButton("Salvar"); // Cria um botão "Salvar"
                    inputPanel.add(salvarButton); // Adiciona o botão "Salvar" ao painel

        //Set do Layout
        cadastroAgenda = new JPanel(new BorderLayout()); // Cria o painel "cadastroAgenda"
        add(cadastroAgenda); // Adiciona o painel de cadastroAgenda ao componente pai
        cadastroAgenda.add(inputPanel, BorderLayout.NORTH); // Adiciona o painel de entrada ao "cadastroAgenda"
        cadastroAgenda.add(scrollPane, BorderLayout.CENTER); // Adiciona a tabela rolável ao "cadastro"
    

    // Tratamento de eventos

    table.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent evt) {
                linhaSelecionada = table.rowAtPoint(evt.getPoint()); // Obtém a linha clicada
            }
        });

        OperacoesAgendas operacoes = new OperacoesAgendas(agendas, tableModel, table); // Cria um objeto para operações com usuários

        // Configura os ouvintes de eventos para os botões
        cadastrarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                operacoes.cadastrarAgendas(inputData.getText(), inputHora.getText(), inputNome.getText(), inputDescricao.getText()); // Chama o método de cadastro
                inputData.setText(""); // Limpa o campo "Data"
                inputHora.setText(""); // Limpa o campo "Hora"
                inputNome.setText(""); // Limpa o campo Nome"
                inputDescricao.setText(""); // Limpa o campo "Descrição"
            }
        });

        atualizarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                operacoes.atualizarAgendas(linhaSelecionada, inputData.getText(), inputHora.getText(), inputNome.getText(), inputDescricao.getText()); // Chama o método de atualização
            }
        });

        apagarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                operacoes.apagarAgendas(linhaSelecionada); // Chama o método de exclusão
            }
        });


        // salvarButton.addActionListener(new ActionListener() {
        //     @Override
        //     public void actionPerformed(ActionEvent e) {
        //         operacoes.salvarUsuarios(); // Chama o método de salvar os usuários
        //     }
        // });

    }
}