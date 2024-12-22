package com.scaler.components;
import javax.swing.*;
import java.awt.*;

public class Form extends JPanel {
    public Form() {
        setLayout(new GridBagLayout());
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.insets = new Insets(10, 10, 10, 10);

        JLabel nameLabel = new JLabel("Name:");
        JTextField nameField = new JTextField(20);
        JButton submitButton = new Button("Submit");

        gbc.gridx = 0;
        gbc.gridy = 0;
        add(nameLabel, gbc);

        gbc.gridx = 1;
        add(nameField, gbc);

        gbc.gridx = 0;
        gbc.gridy = 1;
        gbc.gridwidth = 2;
        add(submitButton, gbc);
    }
}
