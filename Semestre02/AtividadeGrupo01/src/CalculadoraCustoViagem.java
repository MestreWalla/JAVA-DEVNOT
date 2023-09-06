import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CalculadoraCustoViagem extends JPanel {
    private JTextField caixa1;
    private JTextField caixa2;
    private JTextField caixa3;
    private JLabel resultadoLabel1;
    private JLabel resultadoLabel2;

    public CalculadoraCustoViagem() {
        super(new BorderLayout());

        // Painel para os campos de entrada
        JPanel inputPanel = new JPanel(new BorderLayout());

        // Adicionar os Componentes ao inputPanel
        JPanel labelsPanel = new JPanel(new BorderLayout());
        JPanel fieldsPanel = new JPanel(new BorderLayout());

        JLabel texto1 = new JLabel("Valor do Combustível:");
        caixa1 = new JTextField(25);

        JLabel texto2 = new JLabel("Consumo do Veículo:");
        caixa2 = new JTextField(25);

        JLabel Texto3 = new JLabel("Distância do Trajeto:");
        caixa3 = new JTextField(25);

        labelsPanel.add(texto1, BorderLayout.NORTH);
        labelsPanel.add(texto2, BorderLayout.CENTER);
        labelsPanel.add(Texto3, BorderLayout.SOUTH);

        fieldsPanel.add(caixa1, BorderLayout.NORTH);
        fieldsPanel.add(caixa2, BorderLayout.CENTER);
        fieldsPanel.add(caixa3, BorderLayout.SOUTH);

        inputPanel.add(labelsPanel, BorderLayout.WEST);
        inputPanel.add(fieldsPanel, BorderLayout.CENTER);

        // Adicionar o painel de entrada ao centro do CalculadoraCustoViagem
        this.add(inputPanel, BorderLayout.CENTER);

        // Botão para calcular
        JButton botao1 = new JButton("Enviar");
        this.add(botao1, BorderLayout.SOUTH);

        resultadoLabel1 = new JLabel();
        resultadoLabel2 = new JLabel();

        // Ação do botão
        botao1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                calcularResultado();
            }
        });
    }

    private void calcularResultado() {
        try {
            int distancia = Integer.parseInt(caixa1.getText());
            double consumo = Double.parseDouble(caixa2.getText());
            double valorCombustivelRS = Double.parseDouble(caixa3.getText());
            double consumoCombustivel = distancia / consumo;
            double custoViagem = consumoCombustivel * valorCombustivelRS;

            resultadoLabel1.setText("O combustível gasto é de " + consumoCombustivel + " Litros");
            resultadoLabel2.setText("O custo total da viagem é de R$ " + custoViagem);

            // Adicionar os resultados abaixo do botão
            this.add(resultadoLabel1, BorderLayout.SOUTH);
            this.add(resultadoLabel2, BorderLayout.SOUTH);

            // Atualizar a interface gráfica
            this.revalidate();
            this.repaint();
        } catch (NumberFormatException ex) {
            System.out.println("Erro de entrada inválida. Certifique-se de que todos os campos sejam preenchidos corretamente.");
        }
    }
}
