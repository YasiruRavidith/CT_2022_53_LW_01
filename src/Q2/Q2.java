package Q2;

import javax.swing.JFrame;
import javax.swing.SwingUtilities;
import java.util.Scanner;

public class Q2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter first name: ");
        String firstName = scanner.nextLine().trim();
        System.out.print("Enter last name: ");
        String lastName = scanner.nextLine().trim();

        String fullName = firstName + " " + lastName;

        SwingUtilities.invokeLater(() -> {
            JFrame frame = new JFrame(fullName);
            frame.setSize(600, 400);
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setVisible(true);
        });
    }
}
