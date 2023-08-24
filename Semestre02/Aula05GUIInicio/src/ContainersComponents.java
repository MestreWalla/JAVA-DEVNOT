import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
public class ContainersComponents extends JFrame {
    public ContainersComponents() {
        super("Exemplo Janela");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setBounds(200, 200, 400, 400);
        //determinando o Layout da janela
        FlowLayout flow = new FlowLayout();
        this.setLayout(flow);
        //Utilizando um novo container
        JPanel painel = new JPanel(); //Por padrao é um FlowLayout
        this.getContentPane().add(painel);//Adicinar painel na janela
        for (int i = 0; i < 6; i++) {
            painel.add(new JButton("Number "+i));
        }
        this.setVisible(true);
    }
}
