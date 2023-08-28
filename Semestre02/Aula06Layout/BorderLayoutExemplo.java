package Semestre02.Aula06Layout;

import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.BorderLayout;

public class BorderLayoutExemplo {
    public BorderLayoutExemplo() {
        super();
        JFrame janelaP = new JFrame("Janela Principal");
        // Mudando o Layout para BorderLayout do JFrame
        BorderLayout border = new BorderLayout();
        janelaP.setLayout(border);
        janelaP.add(new JButton("West"),BorderLayout.WEST);
        janelaP.add(new JButton("East"),BorderLayout.EAST);
        janelaP.add(new JButton("Center"),BorderLayout.CENTER);
        janelaP.add(new JButton("South"),BorderLayout.SOUTH);
        janelaP.add(new JButton("North"),BorderLayout.NORTH);
        // Set JFrame
        janelaP.setDefaultCloseOperation(2);
        janelaP.pack();
        janelaP.setVisible(true);
    }
}
