package PRACTICE.TCS;

import java.util.Scanner;

public class tcs_4_full {
    static int full(int[][] arr, int row, int col) {
        int count = 0;
        int index = 0;
        int max = 0;

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                if (arr[i][j] == 1) {
                    count++;
                }
                if (count > max) {
                    max = count;
                    index = i + 1;
                }
            }
        }
        return index;
    }

    public static void main(String[] args) {
        // int[][] arr = {
        // { 0, 1, 0 },
        // { 0, 0, 1 },
        // { 1, 1, 1 }
        // };
        // int row = 3;
        // int col = 3;
        // int[][] arr = new int[row][col];
        // arr[0][0] = (1);
        // arr[0][1] = (1);
        // arr[0][2] = (1);
        // arr[1][0] = (0);
        // arr[1][1] = (1);
        // arr[1][2] = (1);
        // arr[2][0] = (1);
        // arr[2][1] = (1);
        // arr[2][2] = (0);

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter row size");
        int row = sc.nextInt();
        System.out.println("Enter col size");
        int col = sc.nextInt();

        int[][] arr = new int[row][col];
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                arr[row][col] = sc.nextInt();
            }
        }
        System.out.println(full(arr, row, col));
        sc.close();
    }
}
