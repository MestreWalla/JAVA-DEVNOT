package Semestre02.Aula06Layout;

import java.awt.BorderLayout;
import javax.swing.BoxLayout;
import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 * BoxLayoutExemplo
 */
public class BoxLayoutExemplo extends JFrame {

    public BoxLayoutExemplo() {
        super("Exemplo Box Layout");
        BorderLayout border = new BorderLayout();
        this.setLayout(border);
        // Criar dois paineis
        JPanel painel1 = new JPanel();
        JPanel painel2 = new JPanel();
        // Adicionar os paineis ao frame
        this.add(painel1, BorderLayout.WEST);
        this.add(painel2, BorderLayout.SOUTH);
        // Layout dos painéis
        painel1.setLayout(new BoxLayout(painel1, BoxLayout.Y_AXIS));
        painel2.setLayout(new BoxLayout(painel2, BoxLayout.X_AXIS));
    }
}