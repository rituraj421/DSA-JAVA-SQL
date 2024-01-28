package GFG_7_MATRIX;

import java.util.Scanner;


public class sheet_1 {
    static void basic(int[][] arr) {
        int i = 0;
        System.out.println(arr.length + " it is the length of r/ows");
        System.out.println(arr[i].length + " it is the number of elements in row");
        for (i = 0; i < arr.length; i++) { // arr.length, to find how many rows this array has
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println(); // to print the rows in new line
        }
    }

    // snake
    static void snake(int[][] mat) {
        int R = 4, C = 4;
        for (int i = 0; i < R; i++) {
            if (i % 2 == 0) {
                for (int j = 0; j < C; j++)
                    System.out.print(mat[i][j] + " ");
            } else {
                for (int j = C - 1; j >= 0; j--)
                    System.out.print(mat[i][j] + " ");
            }

        }
    }

    // boundary
    static void boundry(int[][] bound) {
        int R = 3, C = 3;
        if (R == 1) {
            for (int i = 0; i < C; i++)
                System.out.print(bound[0][i] + " ");
        } else if (C == 1) {
            for (int i = 0; i < R; i++)
                System.out.print(bound[i][0] + " ");
        } else {

            for (int i = 0; i < C; i++) {
                System.out.print(bound[0][i] + " ");
            }
            for (int i = 1; i < R; i++) {
                System.out.print(bound[i][C - 1] + " ");
            }
            for (int i = C - 2; i >= 0; i--) {
                System.out.print(bound[R - 1][i] + " ");
            }
            for (int i = R - 2; i >= 1; i--) {
                System.out.print(bound[i][0] + " ");
            }
        }
    }

    // transpose
    static void transpose(int[][] ori) {
        int n = 3;
        int[][] trans = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                trans[i][j] = ori[j][i];
            }
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(trans[i][j] + " ");
            }
            System.out.println();
        }
    }

    // search rowise and columnwise
    static void searchRC(int[][] arr, int x) {
        int R = 3, C = 3;
        for (int i = 0; i < R; i++) {
            for (int j = 0; j < C; j++) {
                if (arr[i][j] == x) {
                    System.out.println("The element " + x + " is foound at " + i + ", " + j);
                    return;
                }
            }
        }
        System.out.println("Element not found");
    }

    public static void main(String[] args) {
        // array user inut in java
        Scanner sc = new Scanner(System.in);
        /*
         * System.out.println("Size of array");
         * int size = sc.nextInt();
         * 
         * int[] ar = new int[size];
         * for (int i = 0; i < size; i++) {
         * System.out.println("Element " + (i + 1) + ": ");
         * ar[i] = sc.nextInt();
         * }
         * 
         * System.out.println("Below is the array");
         * for (int i = 0; i < ar.length; i++) {
         * System.out.print(ar[i] + " ");
         * }
         * int[][] arr = { { 1, 2, 3 },
         * { 4, 5, 6 }
         * };
         */

        // user input for 2D array
        /*
         * System.out.println("ENter rows ");
         * int row = sc.nextInt();
         * System.out.println("Enter column ");
         * int col = sc.nextInt();
         * int[][] ar2 = new int[row][col];
         * for (int i = 0; i < row; i++) {
         * for (int j = 0; j < col; j++) {
         * System.out.println("enter element " + (i + 1) + " " + (j + 1));
         * ar2[i][j] = sc.nextInt();
         * }
         * }
         * 
         * for(int i = 0; i<row; i++){
         * for(int j = 0; j<col; j++){
         * System.out.print(ar2[i][j] +" ");
         * }
         * System.out.println();
         * }
         */

        // basic(arr);

        // snake
        int mat[][] = { { 1, 2, 3, 4 },
                { 5, 6, 7, 8 },
                { 9, 10, 11, 12 },
                { 13, 14, 15, 16 } };
        // snake(mat);

        int[][] bound = { { 1, 2, 3 },
                { 4, 5, 6 },
                { 7, 8, 9 }
        };
        // boundry(bound);

        // transpose
        int[][] ori = { { 1, 2, 3 },
                { 4, 5, 6 },
                { 7, 8, 9 }
        };

        // transpose(ori);

        int[][] arr = { { 1, 2, 3 },
                { 4, 5, 6 },
                { 7, 8, 9 }
        };
        searchRC(arr, 6);
        sc.close();
    }
}
