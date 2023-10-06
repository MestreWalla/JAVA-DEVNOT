import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class Exercicio02 extends JFrame{
    // Atributos
    private JPanel mainPanel;
    private JLabel letraDigitada;
    private JTextField caixaDigitacao;
    private JLabel textoDigitado;

    // Construtor
    public Exercicio02() {
        super("Exercicio02");
        this.setDefaultCloseOperation(2);
        this.setBounds(100, 100, 400, 250);

        // Add painel principal -> GriLayout(4,1)
        mainPanel = new JPanel(new GridLayout(4,1));
        this.add(mainPanel);

        // Add componentes
        letraDigitada = new JLabel("A letra digitada é: ");
        mainPanel.add(letraDigitada);
        mainPanel.add(new JLabel("Digite seu texto aqui: "));
        caixaDigitacao = new JTextField();
        mainPanel.add(caixaDigitacao);
        textoDigitado = new JLabel();
        mainPanel.add(textoDigitado);

        // Tratamento de eventos - Handler
        Handler evt = new Handler();
        caixaDigitacao.addKeyListener(evt);
    }
    public class Handler implements KeyListener { // key press - key release - key typed

        @Override
        public void keyTyped(KeyEvent e) {
            char typedKey = e.getKeyChar();
            letraDigitada.setText("A letra digitada é: " + typedKey);
        }

        @Override
        public void keyPressed(KeyEvent e) {
            // Sem uso
        }

        @Override
        public void keyReleased(KeyEvent e) {
            textoDigitado.setText(caixaDigitacao.getText());
        }
        
    }
    public void run(){
        this.setVisible(true);
    }
}
