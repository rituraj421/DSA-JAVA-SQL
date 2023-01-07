package BASICS;

public class arrayPracticeSet {
    public static void main(String[] args) {
        // problem 1
        float[] marks = { 42.9f, 44.00f, 11.1f, 13.02f, 19.10f };
        float sum = 0;
        for (float element : marks) {
            sum = sum + element;
        }
        System.out.println("The value of sum is " + sum);

        // write program to find if a number is present or not

        int[] mark = { 33, 34, 54, 65, 32 };
        float num = 93;
        boolean isInArray = false;
        for (int element : mark) {
            if (num == element) {
                isInArray = true;
                break;
            }
        }
        if (isInArray) {
            System.out.println("The value " + num + " is present in array");
        } else {
            System.out.println("The value " + num + " is not present in array");
        }

        // problem 3
        // calculate the array marks from an array containing marks of all students in
        // physics using for each loop

        float[] markk = { 33.0f, 34.0f, 35.0f, 36.0f, 36, 38.0f };
        float summ = 0;
        for (float element : markk) {
            summ = summ + element;
        }
        System.out.println("The value of average marks is " + sum / markk.length);

        // problem 4

        int[][] mat1 = {
                { 1, 2, 3 },
                { 4, 5, 6 }
        };

        int[][] mat2 = {
                { 13, 21, 3 },
                { 45, 5, 60 }
        };

        int[][] result = {
                { 0, 0, 0 },
                { 0, 0, 0 }
        };

        for (int i = 0; i < mat1.length; i++) {
            for (int j = 0; j < mat1[i].length; j++) {
                // System.out.format(" Setting value for i=%d and j=%d\n", i, j);
                result[i][j] = mat1[i][j] + mat2[i][j];
                System.out.print(result[i][j] + " ");
            }
            System.out.println("");
        }
        // problem 5
        // write a java programm to reverse an array

        int[] arr = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
        int l = arr.length;
        int n = Math.floorDiv(l, 2);
        int temp;
        for (int k = 0; k < n; k++) {
            // ..swap a[k] and a[l-1-k]
            temp = arr[k];
            arr[k] = arr[l - k - 1];
            arr[l - k - 1] = temp;
        }
        for (int element : arr) {
            System.out.println(element);
        }
        // problem 6
        // Write a java program to find tha maximum element in an array

        int[] array = { 1, 2, 3, 4, 5, 6 };
        // using for each loop
        int max = 0;
        for (int element : array) {
            if (element > max) {
                max = element;
            }
        }
        System.out.println("The maximum is " + max);

        // USING FOR LOOP

        // int max = array[0];
        // for(int i = 0; i<array.length; i++){
        // if(array[i] > max){
        // max = array[i];
        // }
        // }
        // System.out.println("The max value is " + max);

        // probelm 7
        // find the minimum array

        int[] arrr = { 1, 2, 3, 4, 5, 6 };
        int min = arrr[0];

        for (int i = 0; i < arrr.length; i++) {
            if (arrr[i] < min) {
                min = arrr[i];
            }
        }
        System.out.println("The minimum value is " + min);

        // Problem 8
        // write a java program to find whetherr a array is sorted or not

        boolean isSorted = true;
        int [] ar = { 1,4,2,3, 0, 1};
        for(int i = 0; i< ar.length; i++){
            if(ar[i]>ar[i+1]){
                isSorted = false;
                break;
            }
        }
        System.out.println(isSorted);
    }
}