package packages;

import javax.swing.*;
import java.awt.*;

public class thankYouPage {

    public void create(JFrame frame) {
        // Create and configure the panel with BorderLayout
        JPanel panel = new JPanel(new BorderLayout());

        // Create thank you label
        JLabel thankYouLabel = new JLabel("با تشکر از مشارکت شما!");

        // Add label to the panel
        panel.add(thankYouLabel, BorderLayout.CENTER);

        // Add panel to the frame
        frame.add(panel);
    }
}



