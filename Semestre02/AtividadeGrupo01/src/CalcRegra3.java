import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

public class CalcRegra3 extends JPanel {

    // Construtor da classe CalcRegra3
    public CalcRegra3() {
        super(new BorderLayout()); // Cria um painel com layout de borda
        
        // Cria o painel principal que conterá todos os outros painéis
        JPanel frame = new JPanel(new BorderLayout());
        
        // Criação do primeiro painel superior
        JPanel painel1 = new JPanel(new BorderLayout());
        painel1.setBackground(Color.decode("#03dbfc")); // Define a cor de fundo
        
        // Criação da caixa de texto para inserir o primeiro valor
        JTextField campoTextoA = new JTextField("A", 25);
        campoTextoA.setHorizontalAlignment(SwingConstants.CENTER); // Centraliza o texto na caixa
        campoTextoA.setBackground(Color.decode("#127382")); // Define a cor de fundo da caixa
        painel1.add(campoTextoA); // Adiciona a caixa ao painel
        
        // Criação do texto "Está para" entre os dois primeiros campos
        JLabel texto1 = new JLabel("Está para");
        painel1.add(texto1); // Adiciona o texto ao painel
        
        // Criação da caixa de texto para inserir o segundo valor
        JTextField campoTextoB = new JTextField("B", 25);
        campoTextoB.setHorizontalAlignment(SwingConstants.CENTER); // Centraliza o texto na caixa
        campoTextoB.setBackground(Color.decode("#127382")); // Define a cor de fundo da caixa
        painel1.add(campoTextoB); // Adiciona a caixa ao painel
        
        // Criação do segundo painel intermediário com o texto "Assim Como"
        JPanel painel2 = new JPanel(new BorderLayout());
        painel2.setBackground(Color.decode("#03dbfc")); // Define a cor de fundo
        JLabel texto2 = new JLabel("Assim Como");
        painel2.add(texto2); // Adiciona o texto ao painel
        
        // Criação do terceiro painel inferior
        JPanel painel3 = new JPanel(new BorderLayout());
        painel3.setBackground(Color.decode("#03dbfc")); // Define a cor de fundo
        
        // Criação da caixa de texto para inserir o terceiro valor
        JTextField campoTextoC = new JTextField("C", 25);
        campoTextoC.setHorizontalAlignment(SwingConstants.CENTER); // Centraliza o texto na caixa
        campoTextoC.setBackground(Color.decode("#127382")); // Define a cor de fundo da caixa
        painel3.add(campoTextoC); // Adiciona a caixa ao painel
        
        // Criação do texto "Está para" entre os dois últimos campos
        JLabel texto3 = new JLabel("Está para");
        painel3.add(texto3); // Adiciona o texto ao painel
        
        // Criação do campo de resultado
        JTextField resultado = new JTextField("Resultado");
        resultado.setBackground(Color.decode("#a7e5eb")); // Define a cor de fundo
        resultado.setEditable(false); // Impede a edição do campo pelo usuário
        resultado.setPreferredSize(new Dimension(painel3.getPreferredSize().width, resultado.getPreferredSize().height));
        resultado.setHorizontalAlignment(SwingConstants.CENTER); // Centraliza o texto
        painel3.add(resultado); // Adiciona o campo de resultado ao painel
        
        // Criação do botão "Calcular"
        JButton calcular = new JButton("Calcular");
        calcular.setBackground(Color.decode("#127382")); // Define a cor de fundo do botão
        painel3.add(calcular); // Adiciona o botão ao painel
        
        // Adiciona um ouvinte de ação ao botão "Calcular"
        calcular.addActionListener(null); // Adiciona ação ao botão
        calcular.addActionListener(e -> { // Define o que fazer quando o botão for selecionado
            // Obtém os valores digitados nos campos de texto
            double valorA = Double.parseDouble(campoTextoA.getText());
            double valorB = Double.parseDouble(campoTextoB.getText());
            double valorC = Double.parseDouble(campoTextoC.getText());
            
            // Realiza o cálculo da regra de três
            double solucao = (valorC * valorB) / valorA;
            
            // Exibe o resultado no campo de resultado
            resultado.setText(Double.toString(solucao));
        });
        
        // Adiciona os painéis ao painel principal
        frame.add(painel1);
        frame.add(painel2);
        frame.add(painel3);
        
        // Define o tamanho do painel principal
        frame.setSize(310, 330);
        
        // Torna o painel principal visível
        frame.setVisible(true);
    }
}
