import javax.swing.*;
import java.awt.*;
import packages.informationPage;

public class Main {

    public static void main(String[] args) {
        // Create the main frame
        JFrame frame = new JFrame("فرم نظرسنجی");
        frame.setSize(600, 600);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Create the main panel with BorderLayout
        JPanel panel = new JPanel(new BorderLayout());

        // Create title label
        JLabel title = new JLabel("فرم نظرسنجی", SwingConstants.CENTER);
        panel.add(title, BorderLayout.NORTH);

        // Create start button
        JButton startButton = new JButton("شروع!");
        panel.add(startButton, BorderLayout.CENTER);

        // Add panel to the frame
        frame.add(panel);

        // Add action listener to the start button
        startButton.addActionListener(e -> {
            // Remove the current panel
            frame.remove(panel);
            frame.revalidate();
            frame.repaint();

            // Load and display the first page
            informationPage informationPage = new informationPage();
            informationPage.create(frame);

            // Refresh the frame
            frame.revalidate();
            frame.repaint();
        });

        // Make the frame visible
        frame.setVisible(true);
    }
}
