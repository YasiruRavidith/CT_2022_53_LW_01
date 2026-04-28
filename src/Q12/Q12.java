package Q12;

import javax.swing.JFrame;
import javax.swing.SwingUtilities;

public class Q12 {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            JFrame frame = new JFrame("My First Frame");
            frame.setSize(300, 200);
            frame.setLocation(100, 50);
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setVisible(true);
        });
    }
}
