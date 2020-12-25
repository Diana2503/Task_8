package ru.vsu.cs.gui.frame;

import ru.vsu.cs.gui.controller.ButtonResultListener;

import javax.swing.*;

public class Frame extends JFrame {
    private JPanel mainPanel;
    private JTextField inputNumberOfRow;
    private JTextField ResultOfProgram;
    private JTextField inputArray;
    private JTextField inputNumberOfColumns;
    private JButton buttonChangeThePlaceOfGrowingStrings;

    public Frame() {
        super("Task 8");

        setContentPane(mainPanel);
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        setVisible(true);
        pack();
        setBounds(550, 300, 500, 300);

        buttonChangeThePlaceOfGrowingStrings.addActionListener(new ButtonResultListener(inputNumberOfRow, ResultOfProgram, inputArray, inputNumberOfColumns));
    }
}
