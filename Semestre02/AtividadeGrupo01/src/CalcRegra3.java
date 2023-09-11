
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

public class CalcRegra3 extends JPanel {

    // =========================Calculadora Regra de 3 =========================//
    public CalcRegra3() {
        super(new BorderLayout());

        JPanel frame = new JPanel(new BorderLayout()); // Criar Frame principal onde ficaram todos os outros JPanel

        // ============================Painel superior (primeiropainel)================
        JPanel painel1 = new JPanel(new BorderLayout());
        painel1.setBackground(Color.decode("#03dbfc"));
        // criar caixa para inserir o primeiro valor
        JTextField campoTextoA = new JTextField("A", 25);
        campoTextoA.setHorizontalAlignment(SwingConstants.CENTER); // Centraliza o texto
        campoTextoA.setBackground(Color.decode("#127382"));
        painel1.add(campoTextoA, BorderLayout.NORTH);
        // Texto para ficar entre os dois primeros campos
        JLabel texto1 = new JLabel("Está para");
        painel1.add(texto1, BorderLayout.CENTER);
        // criar caixa para inserir o segundo valor
        JTextField campoTextoB = new JTextField("B", 25);
        campoTextoB.setHorizontalAlignment(SwingConstants.CENTER); // Centraliza o texto
        campoTextoB.setBackground(Color.decode("#127382"));
        painel1.add(campoTextoB, BorderLayout.SOUTH);
        //
        // ========================Painel intermediario "Assim Como"==================
        //
        JPanel painel2 = new JPanel();
        painel2.setBackground(Color.decode("#03dbfc"));
        JLabel texto2 = new JLabel("Assim Como");
        painel2.add(texto2);
        //
        // =======================Painel inferior (terceiro painel)===================
        //
        JPanel painel3 = new JPanel();
        painel3.setBackground(Color.decode("#03dbfc"));
        // crir caixa para inserir o terceiro valor
        JTextField campoTextoC = new JTextField("C", 25);
        campoTextoC.setHorizontalAlignment(SwingConstants.CENTER); // Centraliza o texto
        campoTextoC.setBackground(Color.decode("#127382"));
        painel3.add(campoTextoC);
        // Texto para ficar entre os dois ultimos campos
        JLabel texto3 = new JLabel("Está para");
        painel3.add(texto3);
        // ==============================Resultado
        JTextField resultado = new JTextField("Resultado");
        resultado.setBackground(Color.decode("#a7e5eb"));
        resultado.setEditable(false);
        resultado
                .setPreferredSize(new Dimension(painel3.getPreferredSize().width, resultado.getPreferredSize().height));
        resultado.setHorizontalAlignment(SwingConstants.CENTER); // Centraliza o texto
        this.add(resultado);
        // Botão para realizar o cálculo
        JButton calcular = new JButton("Calcular");
        calcular.setBackground(Color.decode("#127382"));
        this.add(calcular, BorderLayout.EAST);

        // ==========================Realizar os Calculos===============================

        calcular.addActionListener(null); // Adiciona ação ao botão
        calcular.addActionListener(e -> { // o que fazer quando o botaão for selecionado
            // Pega os valores digitados
            double valorA = Double.parseDouble(campoTextoA.getText());
            double valorB = Double.parseDouble(campoTextoB.getText());
            double valorC = Double.parseDouble(campoTextoC.getText());
            // Realiza o cálculo
            double solucao = (valorC * valorB) / valorA;
            // Exibe o resultado no JTextList solucao
            resultado.setText(Double.toString(solucao));
        });
        frame.add(painel1, BorderLayout.NORTH);
        frame.add(painel2, BorderLayout.CENTER);
        frame.add(painel3, BorderLayout.SOUTH);
        frame.setSize(310, 330);
        frame.setVisible(true);
    }
}
