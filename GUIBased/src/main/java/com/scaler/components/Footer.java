package com.scaler.components;
import javax.swing.*;
import java.awt.*;

public class Footer extends JPanel {
    public Footer() {
        setLayout(new FlowLayout(FlowLayout.CENTER));
        JLabel footerLabel = new JLabel("© 2024 Harsh Kumar");
        footerLabel.setFont(new Font("Arial", Font.PLAIN, 14));
        add(footerLabel);
    }
}
