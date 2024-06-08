package PRACTICE.CORE;

import java.util.Scanner;

public class day_1 {
    public static void main(String[] a) {
        System.out.println("hey");

        try (Scanner sc = new Scanner(System.in)) {
         System.out.println("Enter the array size");
         int size = sc.nextInt();

        //  create int array
        int[] arr = new int[size];

         for(int i = 0; i<size; i++){
            arr[i] = sc.nextInt();
         }

         for(int i = 0; i<arr.length; i++){
            System.out.print(arr[i] + " ");
         }
      }
    }
}
