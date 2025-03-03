import javax.swing.*;
import packages.informationPage;
import java.awt.*;

public class Main {
    public static void main(String[] args) {
        // Create the main frame
        JFrame frame = new JFrame("فرم نظرسنجی");
        frame.setSize(600, 600);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new BorderLayout());

        // Create the main panel
        JPanel panel = new JPanel(new BorderLayout());
        panel.setBackground(Color.YELLOW);

        // Create title label
        JLabel title = new JLabel("فرم نظرسنجی");
        title.setHorizontalAlignment(JLabel.CENTER);
        title.setFont(new Font("Arial", Font.BOLD, 18));
        panel.add(title, BorderLayout.NORTH);

        // Create center panel for the button
        JPanel centerPanel = new JPanel();
        centerPanel.setLayout(new BoxLayout(centerPanel, BoxLayout.Y_AXIS));
        centerPanel.setBackground(Color.YELLOW);

        // Create start button
        JButton startButton = new JButton("شروع!");
        startButton.setAlignmentX(Component.CENTER_ALIGNMENT);
        startButton.setFont(new Font("Arial", Font.BOLD, 16));


        centerPanel.add(Box.createVerticalGlue());
        centerPanel.add(startButton);
        centerPanel.add(Box.createVerticalGlue());

        panel.add(centerPanel, BorderLayout.CENTER);
        frame.add(panel);

        // Add action listener to the start button
        startButton.addActionListener(e -> {
            // Remove current content and update frame
            frame.getContentPane().removeAll();
            frame.getContentPane().setBackground(Color.YELLOW);
            frame.revalidate();
            frame.repaint();

            // Load and display the first page
            informationPage informationPage = new informationPage();
            informationPage.create(frame);
        });

        // Make the frame visible
        frame.setVisible(true);
    }
}
