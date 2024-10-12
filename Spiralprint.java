//Question - Given an m x n matrix, the task is to print all elements of the matrix in spiral form.

import java.util.*;

public class Main {
    public static void main(String[] args) {
        int[][] arr = { {1,  2,  3,  4},
                        {12, 13, 14, 5},
                        {11, 16, 15, 6},
                        {10, 9,  8,  7} };

        int[][] arr2 = { {1,2,3},
                       {4,5,6} };
        printMatrixInSpiral(arr2);
    }
    public static void printMatrixInSpiral(int[][] a) {
        int top = 0, bottom = a.length - 1, left = 0,
                right = a[0].length - 1;

        // Iterate until all elements are printed
        while (top <= bottom && left <= right) {
            // Print top row from left to right
            for (int i = left; i <= right; ++i) {
                System.out.print(a[top][i] + " ");
            }
            top++;

            // Print right column from top to bottom
            for (int i = top; i <= bottom; ++i) {
                System.out.print(a[i][right] + " ");
            }
            right--;

            // Print bottom row from right to left (if
            // exists)
            if (top <= bottom) {
                for (int i = right; i >= left; --i) {
                    System.out.print(a[bottom][i] + " ");
                }
                bottom--;
            }

            // Print left column from bottom to top (if
            // exists)
            if (left <= right) {
                for (int i = bottom; i >= top; --i) {
                    System.out.print(a[i][left] + " ");
                }
                left++;
            }
        }
    }
}