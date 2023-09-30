package GFG_6_SORTING;

import java.util.Arrays;
// import java.util.HashMap;
import java.util.*;

public class sheet_1 {
    static void bubble(int[] arr) {
        // int temp = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    // selection sort, FIND OUT THE MINIMUM and out it at the start
    static void selectionSort(int arr[], int n) {
        for (int i = 0; i < n; i++) {
            int min_ind = i;

            for (int j = i + 1; j < n; j++) {
                if (arr[j] < arr[min_ind]) {
                    min_ind = j;
                }
            }

            int temp = arr[i];
            arr[i] = arr[min_ind];
            arr[min_ind] = temp;
        }
    }

    // merge sort
    static void mergeSort(int[] a, int[] b) {

        int m = a.length;
        int n = b.length;

        int[] c = new int[m + n];
        for (int i = 0; i < m; i++)
            c[i] = a[i];
        for (int j = 0; j < n; j++)
            c[j + m] = b[j];

        Arrays.sort(c);

        for (int i = 0; i < m + n; i++)
            System.out.print(c[i] + " ");
    }

    // intersection of two arrays
    static void intersection(int[] arr1, int[] arr2){
        for (int i = 0; i < arr1.length; i++) {
        for (int j = 0; j < arr2.length; j++) {
            if (arr1[i] == arr2[j]) {
                System.out.print(arr1[i] + " ");
                // break; // Exit the inner loop when a match is found
            }
        }
    }
        // System.out.println(inter);
    }

    // union of two sorted arrays
    static void union(int[] arr1, int[]arr2){
        for(int i = 1; i<arr1.length; i++){
            if(arr1[i] != arr1[i-1]){
                System.out.print(arr1[i]+" ");
                // continue;
            }
            else{
                // System.out.print(arr1[i] +" ");
            }
        }
    }

    // count inversions
    static int inversion(int[] arr){
        int count = 0;
        for(int i = 0; i<arr.length; i++){
            for(int j = i+1; j<arr.length; j++){
                if(arr[i]>arr[j]){
                    count++;
                }
            }
        }
        return count;
    }
    // partition the array
    static void partition(int[] arr, int p){
        int[] temp = new int[arr.length];
        int index = 0;
        for(int i = 0; i<arr.length; i++){
            if(arr[i] <= arr[p]){
                temp[index] = arr[i];
                index++;
            }
        }
        for(int j = 0; j<arr.length; j++){
            if(arr[j] >arr[p]){
                temp[index] = arr[j];
                index++;
            }
        }
        for(int n = 0; n<temp.length; n++){
            arr[n] = temp[n];
            // System.out.print(n+" ");
        }
        for(int n : arr){
            // arr[n] = temp[n];
            System.out.print(n+" ");
        }

        // for(int i = 0; i<)
    }
    public static void main(String[] args) {
        // bubble sort
        // int[] arr = { 10, 8, 20, 5 };
        // bubble(arr);

        // merge sort
        // int a[] = new int[] { 10, 15, 20, 40 };
        // int b[] = new int[] { 5, 6, 6, 10, 15 };
        // mergeSort(a, b);

        // int[] arr1 = {1,2,3,4,5};
        // int[] arr2 = {1,3};
        // intersection(arr1, arr2);

        // union of two sorted arrays
        // int[] arr1 = {1,1,2,3,4,4,5};
        // union(arr1, arr2);

        // count inversion
        // int[] arr = {6,5,4,3,2};
        // System.out.println(inversion(arr));

        // partition (naive approach)
        int[] arr = {5,13,6,9,12, 11, 8};
        partition(arr, 6);
    }
}
