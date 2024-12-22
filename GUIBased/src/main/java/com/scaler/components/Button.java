package com.scaler.components;

import javax.swing.*;
import java.awt.*;

public class Button extends JButton {
    public Button(String text) {
        super(text);
        setFont(new Font("Arial", Font.BOLD, 16));
        setBackground(new Color(59, 89, 182));
        setForeground(Color.WHITE);
        setFocusPainted(false);
        setBorderPainted(false);
    }
}
