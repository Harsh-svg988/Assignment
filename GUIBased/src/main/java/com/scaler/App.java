package com.scaler;

import com.scaler.components.Footer;
import com.scaler.components.Form;
import com.scaler.components.Header;

import javax.swing.*;
import java.awt.*;

public class App {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            JFrame frame = new JFrame("GUI Project");
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setSize(800, 600);
            frame.setLayout(new BorderLayout());

            // Add components
            frame.add(new Header(), BorderLayout.NORTH);
            frame.add(new Footer(), BorderLayout.SOUTH);
            frame.add(new Form(), BorderLayout.CENTER);

            frame.setVisible(true);
        });
    }
}
