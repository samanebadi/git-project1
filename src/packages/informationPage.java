package packages;

import javax.swing.*;
import java.awt.*;

public class informationPage {

    public void create(JFrame frame) {
        // Create the main panel with BoxLayout
        JPanel panel = new JPanel();
        panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));
        panel.setBackground(Color.YELLOW);


        panel.add(Box.createRigidArea(new Dimension(0, 100)));

        // Name Label and Text Field
        JLabel nameLabel = new JLabel("اسم");
        JTextField nameField = new JTextField(15);


        panel.add(nameLabel);
        panel.add(Box.createRigidArea(new Dimension(0, 10)));
        panel.add(nameField);
        panel.add(Box.createRigidArea(new Dimension(0, 20)));

        // Age Label and Text Field
        JLabel ageLabel = new JLabel("سن");
        JTextField ageField = new JTextField(15);

        // Add rigid area between components
        panel.add(ageLabel);
        panel.add(Box.createRigidArea(new Dimension(0, 10)));
        panel.add(ageField);
        panel.add(Box.createRigidArea(new Dimension(0, 20)));

        // Email Label and Text Field
        JLabel emailLabel = new JLabel("ایمیل");
        JTextField emailField = new JTextField(15);

        // Add rigid area between components
        panel.add(emailLabel);
        panel.add(Box.createRigidArea(new Dimension(0, 10)));
        panel.add(emailField);
        panel.add(Box.createRigidArea(new Dimension(0, 20)));

        // Software Familiarity Level
        JLabel levelLabel = new JLabel("سطح آشنایی با نرم افزارهای مشابه");
        JRadioButton level1 = new JRadioButton("مبتدی");
        JRadioButton level2 = new JRadioButton("متوسط");
        JRadioButton level3 = new JRadioButton("پیشرفته");
        JRadioButton level4 = new JRadioButton("بدون آشنایی");

        // Group the radio buttons
        ButtonGroup group = new ButtonGroup();
        group.add(level1);
        group.add(level2);
        group.add(level3);
        group.add(level4);

        // Add level components to the panel
        panel.add(levelLabel);
        panel.add(Box.createRigidArea(new Dimension(0, 10)));
        panel.add(level1);
        panel.add(level2);
        panel.add(level3);
        panel.add(level4);
        panel.add(Box.createRigidArea(new Dimension(0, 20)));

        // Next Page Button
        JButton nextButton = new JButton("صفحه بعد");
        nextButton.addActionListener(e -> {
            frame.getContentPane().removeAll();
            frame.revalidate();
            frame.repaint();

            questionsPage questionsPage = new questionsPage();
            questionsPage.create(frame);
        });

        // Add the next button to the panel
        panel.add(nextButton);


        panel.add(Box.createRigidArea(new Dimension(0, 30)));

        // Clear previous components and add new panel
        frame.getContentPane().removeAll();
        frame.add(panel);
        frame.revalidate();
        frame.repaint();
    }
}
