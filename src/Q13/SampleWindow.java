package Q13;

import javax.swing.JFrame;

public class SampleWindow {
    public static void main(String[] args) {
        JFrame myWindow = new JFrame();
        myWindow.setSize(500, 250);
        myWindow.setTitle("UOK");
        myWindow.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        myWindow.setVisible(true);

        try {
            Thread.sleep(500);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }

        myWindow.setVisible(false);

        try {
            Thread.sleep(500);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }

        myWindow.setVisible(true);
    }
}
