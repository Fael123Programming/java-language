package br.com.rafael.graphical_interfaces.menus;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Frame extends JFrame implements ActionListener {
    private final JMenuBar menuBar;
    private final JTextField textField;
    private final JMenuItem help, specialCustomer, commonCustomer, supplier, exit;

    {
        this.menuBar = new JMenuBar();
        this.textField = new JTextField(30);
        this.textField.setEditable(false);
        JMenu menuFile = new JMenu("File");
        JMenu menuCustomer = new JMenu("Customer");
        this.help = new JMenuItem("Help");
        this.specialCustomer = new JMenuItem("Special Customer");
        this.commonCustomer = new JMenuItem("Common Customer");
        this.supplier = new JMenuItem("Supplier");
        this.exit = new JMenuItem("Exit");
        menuCustomer.add(this.commonCustomer);
        menuCustomer.add(this.specialCustomer);
        menuFile.add(menuCustomer);
        menuFile.add(this.supplier);
        menuFile.add(this.exit);
        this.menuBar.add(menuFile);
        this.menuBar.add(this.help);
        this.help.addActionListener(this);
        this.specialCustomer.addActionListener(this);
        this.commonCustomer.addActionListener(this);
        this.supplier.addActionListener(this);
        this.exit.addActionListener(this);
    }

    public Frame() {
        this.setBounds(550, 330, 480, 100);
        this.getContentPane().setLayout(new FlowLayout(FlowLayout.CENTER));
        this.setTitle("Using Menus");
        this.getContentPane().add(this.textField);
        this.setJMenuBar(this.menuBar);
        this.setUndecorated(true);
        this.getRootPane().setWindowDecorationStyle(JRootPane.FRAME);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setResizable(false);
    }

    @Override
    public void actionPerformed(ActionEvent actionEvent) {
        Object eventSource = actionEvent.getSource();
        StringBuilder strBuilder = new StringBuilder();
        if (eventSource == this.help)
            strBuilder.append("Help was chosen");
        else if (eventSource == this.specialCustomer)
            strBuilder.append("Special Customer was chosen");
        else if (eventSource == this.commonCustomer)
            strBuilder.append("Common Customer was chosen");
        else if (eventSource == this.supplier)
            strBuilder.append("Supplier was chosen");
        else if (eventSource == this.exit)
            System.exit(0);
        this.textField.setText(strBuilder.toString());
    }
}
