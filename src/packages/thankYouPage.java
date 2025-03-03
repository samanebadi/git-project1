package packages;

import javax.swing.*;
import java.awt.*;

public class thankYouPage {

    public void create(JFrame frame) {
        // Create the panel with BorderLayout
        JPanel panel = new JPanel(new BorderLayout());
        panel.setBackground(Color.YELLOW);

        // Create label
        JLabel thankYouLabel = new JLabel("با تشکر از مشارکت شما!");
        thankYouLabel.setHorizontalAlignment(JLabel.CENTER);
        thankYouLabel.setVerticalAlignment(JLabel.CENTER);
        thankYouLabel.setFont(new Font("Arial", Font.BOLD, 18));

        // Add the panel at the center
        panel.add(thankYouLabel, BorderLayout.CENTER);

        // Remove existing components
        frame.getContentPane().removeAll();
        frame.getContentPane().setBackground(Color.YELLOW);
        frame.add(panel);

        // Refresh the frame
        frame.revalidate();
        frame.repaint();
    }
}
