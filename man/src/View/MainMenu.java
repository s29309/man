package View;// File path: src/PacmanMenu.java
import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MainMenu extends JFrame {
private ViewManager viewManager;
    public MainMenu(ViewManager viewManager) {
        this.viewManager = viewManager;
        // Initialize the JFrame
        setTitle("MAN");
        setSize(600, 600);
        setResizable(false);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setLayout(new BoxLayout(getContentPane(), BoxLayout.Y_AXIS));

        getContentPane().setBackground(Color.BLACK);

        //Tytul
        ImageIcon icon = new ImageIcon("src/Data/Graphics/title.png"); // Replace with your image path
        JLabel imageLabel = new JLabel(icon);
        imageLabel.setAlignmentX(CENTER_ALIGNMENT);
        imageLabel.setBorder(new EmptyBorder(50, 0, 50, 0));
        add(imageLabel);

        // do wyboru leveli
        JButton playButton = new JButton("PLAY");
        playButton.setFocusPainted(false);
        playButton.setAlignmentX(CENTER_ALIGNMENT);
        playButton.setFont(new Font("Helvetica", Font.BOLD, 20));
        playButton.setBackground(Color.YELLOW);
        playButton.setForeground(Color.BLACK);
        playButton.setPreferredSize(new Dimension(200, 50));
        playButton.addActionListener(e -> viewManager.openLevelSelect());

        // do rankingu
        JButton scoreboardButton = new JButton("SCOREBOARD");
        scoreboardButton.setFocusPainted(false);
        scoreboardButton.setAlignmentX(CENTER_ALIGNMENT);
        scoreboardButton.setFont(new Font("Helvetica", Font.BOLD, 20));
        scoreboardButton.setBackground(Color.YELLOW);
        scoreboardButton.setForeground(Color.BLACK);
        scoreboardButton.setPreferredSize(new Dimension(200, 50));
        scoreboardButton.addActionListener(e -> viewManager.openScoreboard());

        add(Box.createVerticalStrut(50));  // Add some vertical space at the top
        add(playButton);
        add(Box.createVerticalStrut(20));  // Add space between buttons
        add(scoreboardButton);
        setVisible(true);
    }

}
