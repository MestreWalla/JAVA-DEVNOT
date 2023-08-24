import javax.swing.JFrame;
public class SwingJFrameExemplo extends JFrame {
    public SwingJFrameExemplo () {
        super("Minha primeira janela de Swing");
        this.setSize(400, 400);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setVisible(true);
    }
}
