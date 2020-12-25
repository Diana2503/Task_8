package ru.vsu.cs.console;

import ru.vsu.cs.common.ArrayHandler;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.util.Scanner;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) throws Exception {
        int[][] matrix = readFile(args);
        writeFile(matrix, args);
        printMatrix(matrix);
    }

    public static int[][] readFile(String[] args) {
        Scanner scanner = new Scanner(System.in);
        File inputFile = new File(args[0]);
        try {
            scanner = new Scanner(inputFile);
        } catch (FileNotFoundException fileNotFoundException) {
            System.out.println("File not found!");
        }
        return ArrayHandler.buildGrowing(readMatrix(scanner));
    }

    public static void writeFile(int[][] matrix, String[] args) throws Exception {
        FileWriter fileWriter = new FileWriter(args[1]);
        for (int i = 0; i < matrix.length; i++) {
            fileWriter.write(Arrays.deepToString(matrix));
        }
        fileWriter.close();
    }

    private static int[][] readMatrix(Scanner scanner) {
        int row = scanner.nextInt();
        int column = scanner.nextInt();
        int[][] matrix = new int[row][column];
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = scanner.nextInt();
            }
        }
        return matrix;
    }

    public static void printMatrix(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}

