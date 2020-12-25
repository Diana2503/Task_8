package ru.vsu.cs.tests;

import org.junit.Assert;
import org.junit.Test;
import ru.vsu.cs.common.ArrayHandler;

public class ChangeThePlaceOfGrowingRow {

    @Test
    public void test1() {
        int[][] inputArray = {{2, 1,}, {4, 5}};
        int[][] arrayCreation = ArrayHandler.buildGrowing(inputArray);
        int[][] reworkedArray = {{4, 5}, {2, 1}};
        Assert.assertArrayEquals(reworkedArray, arrayCreation);
    }

    @Test
    public void test2() {
        int[][] inputArray = {{9, 5, 6, 2}, {1, 2, 4, 6}, {8, 4, 9, 0}, {4, 5, 6, 7}};
        int[][] arrayCreation = ArrayHandler.buildGrowing(inputArray);
        int[][] reworkedArray = {{1, 2, 4, 6}, {4, 5, 6, 7}, {9, 5, 6, 2}, {8, 4, 9, 0}};
        Assert.assertArrayEquals(reworkedArray, arrayCreation);
    }

    @Test
    public void test3() {
        int[][] inputArray = {{4, 7, 3}, {1, 2, 2}, {4, 5, 5}};
        int[][] arrayCreation = ArrayHandler.buildGrowing(inputArray);
        int[][] reworkedArray = {{1, 2, 2}, {4, 5, 5}, {4, 7, 3}};
        Assert.assertArrayEquals(reworkedArray, arrayCreation);
    }

    @Test
    public void test4() {
        int[][] inputArray = {{4, 7, 2, 9}, {0, 6, 7, 9}, {1, 3, 4, 5}, {7, 5, 8, 2}, {3, 5, 7, 9}};
        int[][] arrayCreation = ArrayHandler.buildGrowing(inputArray);
        int[][] reworkedArray = {{0, 6, 7, 9}, {1, 3, 4, 5,}, {3, 5, 7, 9}, {4, 7, 2, 9}, {7, 5, 8, 2}};
        Assert.assertArrayEquals(reworkedArray, arrayCreation);
    }

    @Test
    public void test5() {
        int[][] inputArray = {{1, 3, 5, 6}, {2, 8, 4, 9}, {2, 6, 7, 4}, {2, 4, 5, 7}};
        int[][] arrayCreation = ArrayHandler.buildGrowing(inputArray);
        int[][] reworkedArray = {{1, 3, 5, 6}, {2, 4, 5, 7}, {2, 8, 4, 9}, {2, 6, 7, 4}};
        Assert.assertArrayEquals(reworkedArray, arrayCreation);
    }
}
