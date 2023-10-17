import java.awt.BorderLayout;
import java.awt.CardLayout;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.util.ArrayList;
import java.util.List;
import javax.swing.DefaultListModel;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextField;
import javax.swing.UIManager;
import javax.swing.UIManager.LookAndFeelInfo;
import javax.swing.UnsupportedLookAndFeelException;

public class TodoList extends JFrame {

    // atributos
    private JPanel mainPanel;
    private JPanel cards;
    private CardLayout cl;
    private JPanel Inicial;
    private JPanel tempPanel;
    private JTextField taskInputField;
    private JTextField taskInputField2;
    private JButton addButton;
    private JButton addButton2;
    private JButton addTimer;
    private JButton voltar;
    private JList<String> taskList;
    private DefaultListModel<String> listModel;
    private JButton deleteButton;
    private JButton markDoneButton;
    private JComboBox<String> filterComboBox;
    private JButton clearCompletedButton;
    private List<Task> tasks;

    // CONSTRUTOR
    public TodoList() {
        // Configuração da janela principal
        super("To-Do List App");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(500, 300);
        AplicaNimbusLookAndFeel.pegaNimbus();

        // Inicializa os paineis
        mainPanel = new JPanel();
        mainPanel.setLayout(new BorderLayout());
            // Inicializa os cards
            cl = new CardLayout(); // criar o objeto do cardLayout
            cards = new JPanel(cl);
            mainPanel.add(cards, BorderLayout.NORTH); // add o JPanel "cards" ao painel principal
                // Inicializa o painel inicial
                Inicial = new JPanel();
                Inicial.setLayout(new BorderLayout());
                cards.add(Inicial, "Inicial");
                Inicial.setSize(500, 300);

                // Inicializa o painel temporizador
                tempPanel = new JPanel();
                tempPanel.setLayout(new BorderLayout());
                cards.add(tempPanel, "Temporizador");

        // Inicializa a lista de tasks e a lista de tasks concluídas
        tasks = new ArrayList<>();
        listModel = new DefaultListModel<>();
        taskList = new JList<>(listModel);

        // Inicializa campos de entrada, botões e JComboBox
        taskInputField = new JTextField();
        taskInputField2 = new JTextField(); 
        addButton = new JButton("Adicionar");
        addButton2 = new JButton("Adicionar");
        addTimer = new JButton("Timer");
        voltar = new JButton("Voltar");
        deleteButton = new JButton("Excluir");
        markDoneButton = new JButton("Concluir");
        filterComboBox = new JComboBox<>(new String[] { "Todas", "Ativas", "Concluídas" });
        clearCompletedButton = new JButton("Limpar Concluídas");

        // Dicas de uso
        taskInputField.setToolTipText("Digite a tarefa aqui");
        taskInputField2.setToolTipText("Digite a tarefa aqui");
        addButton.setToolTipText("Adicionar tarefa a lista");
        addButton2.setToolTipText("Adicionar tarefa a lista");
        addTimer.setToolTipText("Adicionar uma tarefa com um atrazo de tempo");
        voltar.setToolTipText("Voltar ao menu anterior");
        deleteButton.setToolTipText("Excluir tarefa selecionada");
        markDoneButton.setToolTipText("Marcar tarefa selecionada como concluida");
        filterComboBox.setToolTipText("Mudar modo de exibição da lista entre as tarefas Ativas, Concluidas e Ativas");
        clearCompletedButton.setToolTipText("Excluir todas as tarefas concluidas");

        // Configuração do painel de entrada
        JPanel inputPanel = new JPanel(new BorderLayout());
        inputPanel.add(addTimer, BorderLayout.WEST);
        inputPanel.add(taskInputField, BorderLayout.CENTER);
        inputPanel.add(addButton, BorderLayout.EAST);

        // Configuração do painel de botões
        JPanel buttonPanel = new JPanel(new FlowLayout(FlowLayout.LEFT));
        buttonPanel.add(deleteButton);
        buttonPanel.add(markDoneButton);
        buttonPanel.add(filterComboBox);
        buttonPanel.add(clearCompletedButton);

        // Configuração do painel de entrada Temp
        JPanel inputPanel2 = new JPanel(new BorderLayout());
        inputPanel2.add(taskInputField2, BorderLayout.CENTER);
        inputPanel2.add(voltar, BorderLayout.WEST);
        // inputPanel2.add(taskInputField, BorderLayout.CENTER);
        
        // Adiciona os componentes ao painel Inicial
        Inicial.add(inputPanel, BorderLayout.NORTH);
        Inicial.add(new JScrollPane(taskList), BorderLayout.CENTER);
        Inicial.add(buttonPanel, BorderLayout.SOUTH);

        // Adiciona os componenter ao tempPanel
        tempPanel.add(new JLabel("Marque o tempo de atrazo para adicionar a tarefa:"), BorderLayout.WEST);
        tempPanel.add(new JTextField("01 min", 20), BorderLayout.CENTER);
        tempPanel.add(addButton2, BorderLayout.EAST);
        tempPanel.add(inputPanel2, BorderLayout.NORTH);

        // Adiciona o painel Inicial à janela
        this.add(mainPanel);

        // Criar os Tratamentos de Eventos - Listener e eventos

        // Inserir dados com a tecla ENTER
        taskInputField.addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent arg0) {
                if (arg0.getKeyCode() == KeyEvent.VK_ENTER) {
                    addTask();
                }
            }
        });

        // Remover dados da lista com a tecla DELETE
        taskList.addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent arg0) {
                if (arg0.getKeyCode() == KeyEvent.VK_DELETE) {
                    deleteTask();
                }
            }
        });

        // Ação dos botões
        addTimer.addActionListener(e -> {
            cl.show(cards, "Temporizador");
            // Inicio.setEnabled(true);
        });

        voltar.addActionListener(e -> {
            cl.show(cards, "Inicial");
            // Inicio.setEnabled(true);
        });

        addTimer.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                addTask();
            }
        });
        addButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                addTask();
            }
        });
        deleteButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                deleteTask();
            }
        });
        markDoneButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                markTaskDone();
            }
        });
        clearCompletedButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                clearCompletedTasks();
            }
        });
        filterComboBox.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                filterTasks();
            }
        });
    }

    // Criar os metodos (CRUD)

    private void addTask() {
        // Adiciona uma nova task à lista de tasks
        String taskDescription = taskInputField.getText().trim();// remove espaços vazios
        if (!taskDescription.isEmpty()) {
            Task newTask = new Task(taskDescription);
            tasks.add(newTask);
            updateTaskList();
            taskInputField.setText("");

        }
    }

    private void deleteTask() {
        // Exclui a task selecionada da lista de tasks
        int selectedIndex = taskList.getSelectedIndex();
        if (selectedIndex >= 0 && selectedIndex < tasks.size()) {
            Object[] options = { "   Sim   ", "   Não   " };
            int n = JOptionPane.showOptionDialog(null, " Deseja realmente excluir a tarefa?", "Confirmar exclusão?",
                    JOptionPane.YES_NO_OPTION, JOptionPane.WARNING_MESSAGE, null, options, options[1]);
            if (n == 0) {
                tasks.remove(selectedIndex);
                // System.exit(0);
            }
            updateTaskList();
        }
    }

    private void markTaskDone() {
        // Marca a task selecionada como concluída
        int selectedIndex = taskList.getSelectedIndex();
        if (selectedIndex >= 0 && selectedIndex < tasks.size()) {
            Task task = tasks.get(selectedIndex);
            task.setDone(true);
            updateTaskList();
        }
    }

    private void filterTasks() {
        // Filtra as tasks com base na seleção do JComboBox
        String filter = (String) filterComboBox.getSelectedItem();
        listModel.clear();
        for (Task task : tasks) {
            if (filter.equals("Todas") || (filter.equals("Ativas") &&
                    !task.isDone()) || (filter.equals("Concluídas") && task.isDone())) {
                listModel.addElement(task.getDescription());
            }
        }
    }

    private void clearCompletedTasks() {
        // Limpa todas as tasks concluídas da lista
        List<Task> completedTasks = new ArrayList<>();
        for (Task task : tasks) {
            if (task.isDone()) {

                Object[] options = { "   Sim   ", "   Não   " };
                int n = JOptionPane.showOptionDialog(null, " Deseja realmente excluir todas as tarefas concluidas?",
                        "Confirmar exclusão de concluido?",
                        JOptionPane.YES_NO_OPTION, JOptionPane.WARNING_MESSAGE, null, options, options[1]);

                if (n == 0) {
                    completedTasks.add(task);
                }
            }
        }
        tasks.removeAll(completedTasks);
        updateTaskList();
    }

    private void updateTaskList() {
        // Atualiza a lista de tasks exibida na GUI
        listModel.clear();
        for (Task task : tasks) {
            listModel.addElement(task.getDescription() + (task.isDone() ? " (Concluída)" : ""));

        }
    }

    public void run() {
        // Exibe a janela
        this.setVisible(true);
    }

    // - Singleton para aplicação do Nimbus:
    public class AplicaNimbusLookAndFeel {

        private AplicaNimbusLookAndFeel() {
        }

        public static void pegaNimbus() {
            try {
                for (LookAndFeelInfo info : UIManager.getInstalledLookAndFeels()) {
                    if ("Nimbus".equals(info.getName())) {
                        UIManager.setLookAndFeel(info.getClassName());
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