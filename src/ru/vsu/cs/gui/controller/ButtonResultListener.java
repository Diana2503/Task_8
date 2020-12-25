package ru.vsu.cs.gui.controller;

import ru.vsu.cs.common.ArrayHandler;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Arrays;

public class ButtonResultListener implements ActionListener {
    JTextField inputNumberOfRow;
    JTextField resultOfProgram;
    JTextField inputArray;
    JTextField inputNumberOfColumns;

    public ButtonResultListener(JTextField inputNumberOfRow, JTextField resultOfProgram, JTextField inputArray, JTextField inputNumberOfColumns) {
        this.inputNumberOfRow = inputNumberOfRow;
        this.inputNumberOfColumns = inputNumberOfColumns;
        this.inputArray = inputArray;
        this.resultOfProgram = resultOfProgram;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        int[][] finalMatrix = ArrayHandler.buildGrowing(ArrayHandler.buildingAnIncompleteMatrix(inputNumberOfRow, inputNumberOfColumns, inputArray));
        resultOfProgram.setText(Arrays.deepToString(finalMatrix));
    }
}
