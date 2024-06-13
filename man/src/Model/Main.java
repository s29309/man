package Model;

import View.ViewManager;

import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(ViewManager::new);
    }
}
