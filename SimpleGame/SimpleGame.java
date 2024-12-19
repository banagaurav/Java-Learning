import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class SimpleGame extends JPanel implements KeyListener {
    int playerX = 50, playerY = 50;

    public SimpleGame() {
        JFrame frame = new JFrame("2D Game");
        frame.setSize(400, 400);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.add(this);
        frame.addKeyListener(this);
        frame.setVisible(true);
    }

    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.setColor(Color.GREEN);
        g.fillRect(playerX, playerY, 30, 30); // Draw player
    }

    @Override
    public void keyPressed(KeyEvent e) {
        if (e.getKeyCode() == KeyEvent.VK_UP) playerY -= 10;
        if (e.getKeyCode() == KeyEvent.VK_DOWN) playerY += 10;
        if (e.getKeyCode() == KeyEvent.VK_LEFT) playerX -= 10;
        if (e.getKeyCode() == KeyEvent.VK_RIGHT) playerX += 10;
        repaint(); // Redraw the screen
    }

    @Override public void keyReleased(KeyEvent e) {}
    @Override public void keyTyped(KeyEvent e) {}

    public static void main(String[] args) {
        new SimpleGame();
    }
}
