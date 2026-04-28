package Q6;

import javax.swing.JFrame;
import javax.swing.SwingUtilities;
import java.util.Scanner;

public class Q6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter frame width: ");
        int width = scanner.nextInt();
        System.out.print("Enter frame height: ");
        int height = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Enter frame title: ");
        String title = scanner.nextLine();

        SwingUtilities.invokeLater(() -> {
            JFrame frame = new JFrame(title);
            frame.setSize(width, height);
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setVisible(true);
        });
    }
}
