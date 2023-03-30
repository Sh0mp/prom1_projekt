package gui;

import java.awt.Color;

import javax.swing.BorderFactory;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextPane;

public class PrehledAdmin {
    public PrehledAdmin() {
        JFrame frame = new JFrame("Přehled");
        frame.setDefaultCloseOperation(javax.swing.WindowConstants.HIDE_ON_CLOSE);
        frame.setResizable(false);

        frame.setSize(760, 500);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);

    }
}
