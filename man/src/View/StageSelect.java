package View;

import javax.swing.*;
import java.awt.*;

class StageSelect extends JFrame {
    private ViewManager viewManager;
    public StageSelect(ViewManager viewManager) {
        this.viewManager = viewManager;
        // Initialize the JFrame
        setTitle("LEVEL SELECT");
        setSize(600, 600);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setLocationRelativeTo(null);
        setLayout(new GridLayout(3, 2, 10, 10));

        // Customize the background color
        getContentPane().setBackground(Color.BLACK);

        // Create and add stage buttons
        JButton stageButton1 = createStageButton(1);
        JButton stageButton2 = createStageButton(2);
        JButton stageButton3 = createStageButton(3);
        JButton stageButton4 = createStageButton(4);
        JButton stageButton5 = createStageButton(5);

        add(stageButton1);
        add(Box.createVerticalStrut(10)); // Add some space between buttons
        add(stageButton2);
        add(Box.createVerticalStrut(10)); // Add some space between buttons
        add(stageButton3);
        add(Box.createVerticalStrut(10)); // Add some space between buttons
        add(stageButton4);
        add(Box.createVerticalStrut(10)); // Add some space between buttons
        add(stageButton5);

        // Make the frame visible
        setVisible(true);
    }

    private JButton createStageButton(int stageNumber) {
        JButton button = new JButton(stageNumber + "");
        button.setFont(new Font("Arial", Font.BOLD, 20));
        button.setBackground(Color.YELLOW);
        button.setForeground(Color.BLACK);
        button.setAlignmentX(Component.CENTER_ALIGNMENT);
        button.addActionListener(e -> onStageButtonClicked(stageNumber));
        return button;
    }

    private void onStageButtonClicked(int stageNumber) {
        // Handle stage button click
        // For example, start the selected stage
        JOptionPane.showMessageDialog(this, "Stage " + stageNumber + " button clicked");
    }
}