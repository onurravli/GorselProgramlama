import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Main {
    static boolean state = false;
    public static void main(String[] args) {
        JFrame mainFrame = new JFrame("Main Page");
        mainFrame.setBounds(0, 0, 1280, 720);
        mainFrame.setLayout(null);
        mainFrame.setVisible(true);
        mainFrame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        JButton button = new JButton("Click Me");
        button.setBounds(10, 10, 100, 50);
        mainFrame.add(button);
        mainFrame.setResizable(false);
        ImageIcon icon = new ImageIcon("/home/onur/Downloads/47084109.jpeg");
        mainFrame.setIconImage(icon.getImage());
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                if (!state) {
                    System.out.println("State has changed to Clicked");
                    button.setText("Clicked");
                    state = true;
                } else {
                    System.out.println("State has changed to Click Me");
                    button.setText("Click Me");
                    state = false;
                }
            }
        });
    }
}