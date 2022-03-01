package br.com.rafael.graphical_interfaces.combobox;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Frame extends JFrame implements ActionListener, ItemListener {
    private final JLabel languagesLabel;
    private final JComboBox<String> languagesComboBox;
    private final JButton addNewElementButton;
    private final JTextField selectedLanguageTextField, quantityOfLanguagesTextField, languageToAddTextField;

    {
        this.languagesLabel = new JLabel("Languages", JLabel.CENTER);
        this.languagesLabel.setForeground(Color.BLUE);
        this.languagesLabel.setFont(new Font("Arial", Font.BOLD, 15));
        this.addNewElementButton = new JButton("Add new language");
        this.addNewElementButton.addActionListener(this);
        this.selectedLanguageTextField = new JTextField("None language selected yet");
        this.selectedLanguageTextField.setEditable(false);
        this.quantityOfLanguagesTextField = new JTextField("There are 4 languages to choose from");
        this.quantityOfLanguagesTextField.setEditable(false);
        this.languageToAddTextField = new JTextField();
        this.languagesComboBox = new JComboBox<>(new String[]{"English", "French", "German", "Spanish"});
        this.languagesComboBox.addItemListener(this);
    }

    public Frame() {
        this.setTitle("Using ComboBox");
        this.setBounds(550, 280, 500, 170);
        this.getContentPane().setBackground(new Color(190, 190, 190));
        this.getContentPane().setLayout(new GridLayout(4, 2));
//      First line -----------------------------------------
        this.getContentPane().add(this.languagesLabel);
        this.getContentPane().add(this.languagesComboBox);
//      Second line -------------------------------------------
        this.getContentPane().add(languageToAddTextField);
        this.getContentPane().add(addNewElementButton);
//      Third line --------------------------------------------
        this.getContentPane().add(this.selectedLanguageTextField);
        this.getContentPane().add(this.quantityOfLanguagesTextField);
//      -----------------------------------------------------------
        this.setUndecorated(true);
        this.getRootPane().setWindowDecorationStyle(JRootPane.QUESTION_DIALOG);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setResizable(false);
    }

    @Override
    public void actionPerformed(ActionEvent actionEvent) {
        if (actionEvent.getSource() == this.addNewElementButton) {
            String text = this.languageToAddTextField.getText();
            if (text.isBlank()) {
                this.setVisible(false);
                JOptionPane.showMessageDialog(null, "Not a valid language", "Invalid Language", JOptionPane.ERROR_MESSAGE);
                this.setVisible(true);
            } else {
                this.languagesComboBox.addItem(text);
                this.languageToAddTextField.setText("");
                this.quantityOfLanguagesTextField.setText("There are " + this.languagesComboBox.getItemCount() + " languages to choose from");
            }
        }
    }

    @Override
    public void itemStateChanged(ItemEvent itemEvent) {
        if (itemEvent.getSource() == this.languagesComboBox) {
            String selectedLanguage = String.valueOf(this.languagesComboBox.getSelectedItem());
            if (selectedLanguage != null)
                this.selectedLanguageTextField.setText(selectedLanguage + " was selected");
        }
    }
}
