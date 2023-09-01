import java.awt.BorderLayout;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class CalculadoraCustoViagem extends JPanel {
    public CalculadoraCustoViagem() {
        super(); // Chama o construtor da classe pai JPanel.
        this.add(new JLabel("Calculadora de Viagem")); // Adiciona um rótulo com o texto "Calculadora de Viagem" ao painel.

        // Mudando o Layout para BorderLayout do JFrame
        BorderLayout border = new BorderLayout();
        this.setLayout(border);
        JPanel valorCombustivel = new JPanel();
        JPanel consumoVeiculo = new JPanel();
        JPanel distanciaTrajeto = new JPanel();
        this.add(valorCombustivel, BorderLayout.NORTH);
        // this.add(new JButton("West"), BorderLayout.WEST);
        this.add(consumoVeiculo, BorderLayout.CENTER);
        // this.add(new JButton("East"), BorderLayout.EAST);
        this.add(distanciaTrajeto, BorderLayout.SOUTH);
        


        // Adicionar os Componentes
        JLabel texto1 = new JLabel("Valor do Combustivel:"); // Cria um rótulo com o texto "Valor do Combustivel:".
        this.add(texto1); // Adiciona o rótulo ao painel.
        JTextField caixa1 = new JTextField(25); // Cria uma caixa de texto com espaço para 25 caracteres.
        this.add(caixa1); // Adiciona a caixa de texto ao painel.

        JLabel texto2 = new JLabel("Consumo do veiculo:"); // Cria um rótulo com o texto "Consumo do veiculo:".
        this.add(texto2); // Adiciona o rótulo ao painel.
        JTextField caixa2 = new JTextField(25); // Cria uma caixa de texto com espaço para 25 caracteres.
        this.add(caixa2); // Adiciona a caixa de texto ao painel.

        JLabel Texto3 = new JLabel("Distancia do trajeto:"); // Cria um rótulo com o texto "Distancia do trajeto:".
        this.add(Texto3); // Adiciona o rótulo ao painel.
        JTextField caixa3 = new JTextField(25); // Cria uma caixa de texto com espaço para 25 caracteres.
        this.add(caixa3); // Adiciona a caixa de texto ao painel.

        JButton botao1 = new JButton("Enviar"); // Cria um botão com o texto "Enviar".
        this.add(botao1); // Adiciona o botão ao painel.

        // Ação do botão
        botao1.addActionListener(e -> {
            int distancia = Integer.parseInt(caixa1.getText()); // Converte o conteúdo da caixa1 para um número inteiro (distância).
            double consumo = Integer.parseInt(caixa2.getText()); // Converte o conteúdo da caixa2 para um número de ponto flutuante (consumo).
            double valorCombustivel = Integer.parseInt(caixa3.getText()); // Converte o conteúdo da caixa3 para um número de ponto flutuante (valor do combustível).
            double consumoCombustivel = distancia / consumo; // Calcula o consumo de combustível.
            double custoViagem = consumoCombustivel * valorCombustivel; // Calcula o custo total da viagem.
            
            System.out.println("O combustivel gasto é de " + consumoCombustivel + " Litros"); // Exibe a quantidade de combustível gasta.
            this.add(new JLabel("O combustivel gasto é de " + consumoCombustivel + " Litros")); // Exibe o resultado dentro da propria janela.
            System.out.println("O custo total da viagem é de R$ " + custoViagem + "."); // Exibe o custo total da viagem.
            this.add(new JLabel("O custo total da viagem é de R$ " + custoViagem + ".")); // Exibe o resultado dentro da propria janela.
        });
    }
}
