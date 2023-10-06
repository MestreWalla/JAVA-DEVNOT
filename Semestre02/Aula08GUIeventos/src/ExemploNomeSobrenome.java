import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ExemploNomeSobrenome extends JFrame {

    // Atributos - 3ª Forma Continuação
    private JLabel texto;
    private JTextField caixaNome;
    private JTextField caixaSobrenome;

    // Construtor
    public ExemploNomeSobrenome() {
        super("Nome Sobrenome");
        this.setDefaultCloseOperation(2);
        this.setBounds(100, 100, 300, 150);

        // Criar o painel principal -> Grid Layout
        JPanel mainPanel = new JPanel(new GridLayout(3, 2));

            // Criar componentes do painel
            mainPanel.add(new JLabel("Nome"));
            caixaNome = new JTextField(); //No 3º metodo é removido parte do codigo por ja estar declarado no inicio JTextField caixaNome = new JTextField();
            mainPanel.add(caixaNome);

            mainPanel.add(new JLabel("Sobrenome"));
            caixaSobrenome = new JTextField(); //No 3º metodo é removido parte do codigo por ja estar declarado no inicio JTextField caixaSobrenome = new JTextField();
            mainPanel.add(caixaSobrenome);

            JButton botao = new JButton("Concatenar");
            mainPanel.add(botao);

            JLabel texto = new JLabel();
            mainPanel.add(texto);

        // Set do Frame
        this.add(mainPanel);
        this.setVisible(true);

        // Tratamento de eventos
        // 1ª forma : e->
        // botao.addActionListener(e->{ // ouvinte
        //     //evento
        //     texto.setText(caixaNome.getText()+" "+caixaSobrenome.getText());
        //     caixaNome.setText("");
        //     caixaSobrenome.setText("");
        // })Override
        // 2ª forma - 
        // botao.addActionListener(new ActionListener() {
        //     @Override
        //     public void actionPerformed(ActionEvent e) {
        //         texto.setText(caixaNome.getText()+" "+caixaSobrenome.getText());
        //         caixaNome.setText("");
        //         caixaSobrenome.setText("");
        //     }
        // });
        //3ª Forma - Handler -
        //Importar a classe Handler -> botão
        Handler evt = new Handler();
        botao.addActionListener(evt);
    }
    public class Handler implements ActionListener{ //3ª Forma continuação
            @Override
            public void actionPerformed(ActionEvent e) {
                texto.setText(caixaNome.getText()+" "+caixaSobrenome.getText());
                caixaNome.setText("");
                caixaSobrenome.setText("");
            }
        }
}
