package ru.vsu.cs.common;

import ru.vsu.cs.gui.utils.ArrayUtils;

import javax.swing.*;

public class ArrayHandler {

    public static int[][] buildingAnIncompleteMatrix(JTextField inputNumberOfRow, JTextField inputNumberOfColumns, JTextField inputArray) {
        int[] numberOfRow = ArrayUtils.toIntArray(inputNumberOfRow.getText());
        int[] numberOfColumns = ArrayUtils.toIntArray(inputNumberOfColumns.getText());
        int[] inputMatrix = ArrayUtils.toIntArray(inputArray.getText());
        int[][] matrix = new int[numberOfRow[0]][numberOfColumns[0]];
        int n = 0;
        for (int i = 0; i < numberOfRow[0]; i++) {
            for (int j = 0; j < numberOfColumns[0]; j++) {
                if (n < inputMatrix.length) {
                    matrix[i][j] = inputMatrix[n];
                    n++;
                } else {
                    matrix[i][j] = 0;
                }
            }
        }
        return matrix;
    }

    public static int[][] buildGrowing(int[][] matrix) {
        int positionOfGrowingString = 0;
        for (int i = 0; i < matrix.length; i++) {
            if (isSequenceAscending(matrix[i])) {
                int[] growingString = matrix[i];
                changeThePlaceOfRows(matrix, i, positionOfGrowingString);
                matrix[positionOfGrowingString] = growingString;
                positionOfGrowingString++;
            }
        }
        return matrix;
    }

    public static void changeThePlaceOfRows(int[][] matrix, int i, int positionOfGrowingString) {
        for (int k = i; k > positionOfGrowingString; k--)
            matrix[k] = matrix[k - 1];
    }

    public static boolean isSequenceAscending(int[] sequence) {
        for (int i = 0; i < sequence.length - 1; i++) {
            if (sequence[i] > sequence[i + 1]) {
                return false;
            }
        }
        return true;
    }
}
