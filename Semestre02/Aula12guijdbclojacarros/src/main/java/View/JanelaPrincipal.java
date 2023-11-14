package View;

import javax.swing.JFrame;
import javax.swing.JTabbedPane;

public class JanelaPrincipal extends JFrame {
    // criação do tabbedPane para incluir as tabs
    private JTabbedPane jTPane;

    public JanelaPrincipal() {
        jTPane = new JTabbedPane();
        add(jTPane);

        // criandos as tabs
        // Tab01: Carros
        CarrosPainel tab1 = new CarrosPainel();
        jTPane.add("Carros", tab1);

        // Tab02: Clientes
        ClientesPainel tab2 = new ClientesPainel();
        jTPane.add("Clientes", tab2);

        // Tab03: Venda de Carros
        VendaCarrosPainel tab3 = new VendaCarrosPainel();
        // jTPane.add("Venda de Carros", tab3);

        setBounds(100, 100, 600, 600);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    // métodos para tornar a janela visível
    public void run() {
        this.setVisible(true);
    }

    public static void main(String[] args) {
        JanelaPrincipal janela = new JanelaPrincipal();
        janela.run();
    }
}
