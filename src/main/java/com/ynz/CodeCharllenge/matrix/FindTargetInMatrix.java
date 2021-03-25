package com.ynz.CodeCharllenge.matrix;

import java.util.Arrays;

/**
 * This problem was asked by Microsoft.
 * <p>
 * Given a 2D matrix of characters and a target word, write a function that returns whether the word can be found
 * in the matrix by going left-to-right, or up-to-down.
 * <p>
 * For example, given the following matrix:
 * <p>
 * [['F', 'A', 'C', 'I'],
 * ['O', 'B', 'Q', 'P'],
 * ['A', 'N', 'O', 'B'],
 * ['M', 'A', 'S', 'S']]
 * and the target word 'FOAM', you should return true, since it's the leftmost column. Similarly, given
 * the target word 'MASS', you should return true, since it's the last row.
 */
public class FindTargetInMatrix {

    public static void main(String[] args) {
        System.out.println("Given matrix: ");
        print2DMatrix(getMatrix());

        lookupAndPrintOut(getMatrix(), "FOAM");
        lookupAndPrintOut(getMatrix(), "MASS");
        try {
            lookupAndPrintOut(getMatrix(), "MASSS");
        } catch (IllegalArgumentException e) {
            System.out.println(e);
        }

    }

    private static void lookupAndPrintOut(char[][] matrix, String target) {
        if (target == null || target.isEmpty())
            throw new IllegalArgumentException("Null or empty target is not allowed!");

        if (target.length() > matrix.length || target.length() > matrix[0].length)
            throw new IllegalArgumentException("Target size is too big");

        System.out.printf("is there %s in the matrix? %b \n", target, lookup(getMatrix(), target));
    }

    private static boolean lookup(char[][] matrix, String target) {
        boolean result;
        if (traverseRows(matrix, target)) result = true;
        else result = traverseCols(matrix, target);
        return result;
    }

    private static boolean traverseRows(char[][] matrix, String target) {
        boolean matched = false;

        for (char[] row : matrix) {
            StringBuilder sb = new StringBuilder();

            for (char c : row) {
                sb.append(c);
            }

            String rowContent = sb.toString();

            if (rowContent.contains(target)) {
                matched = true;
                break;
            }
        }

        return matched;
    }

    private static boolean traverseCols(char[][] matrix, String target) {
        boolean matched = false;

        int rows = matrix.length;
        int cols = matrix[0].length;

        for (int c = 0; c < cols; c++) {
            StringBuilder sb = new StringBuilder();

            for (int r = 0; r < rows; r++) sb.append(matrix[r][c]);

            String colContent = sb.toString();

            if (colContent.contains(target)) {
                matched = true;
                break;
            }
        }

        return matched;
    }

    private static char[][] getMatrix() {
        char[][] matrix = new char[][]{
                {'F', 'A', 'C', 'I'},
                {'O', 'B', 'Q', 'P'},
                {'A', 'N', 'O', 'B'},
                {'M', 'A', 'S', 'S'}
        };

        return matrix;
    }

    private static void print2DMatrix(char[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            System.out.println(Arrays.toString(matrix[i]));
        }
    }

}
