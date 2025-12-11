import javax.swing.*;

public class GameFrame extends JFrame {
    public GameFrame() {
        this.add(new GamePanel());            // add the panel (NOT another GameFrame)
        this.setTitle("Snake Game");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setResizable(false);
        this.pack();                         // uses GamePanel.getPreferredSize()
        this.setLocationRelativeTo(null);
        this.setVisible(true);
    }
}
