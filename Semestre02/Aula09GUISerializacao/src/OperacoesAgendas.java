import java.util.List;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class OperacoesAgendas {

    // Atributos
    private List<Agenda> agendas;
    private DefaultTableModel tableModel;
    private JTable table;

    // Metodos Construtor
    public OperacoesAgendas(List<Agenda> agendas, DefaultTableModel tableModel, JTable table) {
        this.agendas = agendas;
        this.tableModel = tableModel;
        this.table = table;
    }
    
    // Métodos CRUD
    public void cadastrarAgendas(String data, String hora, String nome, String descricao) {
        Agenda agenda = new Agenda(data, hora, nome, descricao);
        agendas.add(agenda);
        atualizarTabela();
    }

    public void atualizarAgendas(int linhaSelecionada, String data, String hora, String nome, String descricao) {
        if (linhaSelecionada != -1) {
            Agenda agenda = new Agenda(data, hora, nome, descricao);
            agendas.set(linhaSelecionada, agenda);
            atualizarTabela();
        }
    }

    public void apagarAgendas(int linhaSelecionada) {
        if (linhaSelecionada != -1) {
            agendas.remove(linhaSelecionada);
            atualizarTabela();
        }
    }

    public void apagarTodosUsuarios() {
        agendas.clear();
        atualizarTabela();
    }

    // public void salvarAgendas() {
    //     Serializacao.serializar("dados.txt", agendas);
    // }

    private void atualizarTabela() {
        tableModel.setRowCount(0);
        for (Agenda agenda : agendas) {
            tableModel.addRow(new Object[] { agenda.getNome(), agenda.getData(), agenda.getHora(), agenda.getDescricao() });
        }
    }
}