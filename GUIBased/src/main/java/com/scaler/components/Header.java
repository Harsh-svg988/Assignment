package com.scaler.components;
import javax.swing.*;
import java.awt.*;

public class Header extends JPanel {
    public Header() {
        setLayout(new FlowLayout(FlowLayout.CENTER));
        JLabel titleLabel = new JLabel("GUI Project");
        titleLabel.setFont(new Font("Arial", Font.BOLD, 24));
        add(titleLabel);
    }
}
