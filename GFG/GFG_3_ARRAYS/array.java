package GFG_3_ARRAYS;

import java.util.ArrayList;
import java.util.Arrays;

public class array {
    // find the given element in the array
    static int find(int[] arr, int n) {
        int len = arr.length - 1;
        for (int i = 0; i <= len; i++) {
            if (arr[i] == n) {
                return i;
            }
        }
        return -1;
    }

    // insert an element
    static void insert(int[] arr, int x, int pos, int cap, int n) {
        if (n == cap) {
            return;
        }
        int idx = pos - 1;
        for (int i = n - 1; i >= idx; i--) {
            arr[i + 1] = arr[i];
        }
        arr[idx] = x; // Place the new element at the given position
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }

    // delete an element
    static void delete(int[] arr, int x) {
        int n = arr.length - 1;
        int deleteNum = -1;

        // Find the index of the element to delete
        for (int i = 0; i <= n; i++) {
            if (arr[i] == x) {
                deleteNum = i;
                break;
            }
        }
        // Shift elements to the left to remove the element from the array
        for (int i = deleteNum; i < n; i++) {
            arr[i] = arr[i + 1];
        }
        // Create a new array with the updated size and copy the elements
        int[] updatedArray = Arrays.copyOf(arr, n);

        for (int num : updatedArray) {
            System.out.print(num + " ");
        }
    }

    static void findLarge(int[] arr) {
        int max = 0;
        int index = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
                index = i;
            }
        }
        System.out.println("The largest element in the array is " + max + " found at index " + index);
    }

    static void secondLarge(int[] arr) {
        Arrays.sort(arr);
        int max = 0;
        int index = 0;
        for (int i = 1; i < arr.length - 1; i++) {
            if (arr[i] > max) {
                max = arr[i];
                index = i;
            }
        }
        System.out.println(max + " Index of secLargest is : " + index);
    }

    // check if the array is sorted
    static void isSorted(int[] arr) {
        int ans = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                System.out.println(arr[i] + "," + arr[j]);
                if (arr[i] > arr[j]) {
                    ans = -1;
                }
            }
        }
        System.out.println(ans);
    }

    // check if the array is sorted , more efficient way
    static boolean isSorted1(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < arr[i - 1]) {
                System.out.println(arr[i] + ", " + arr[i - 1]);
                return false;
            }
        }
        return true;
    }

    // reverse an array
    static void reverse(int[] arr) {
        int start = 0;
        int end = arr.length - 1;
        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
        System.out.print("[ ");
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println("]");
    }

    static int kthSmallest(int[] arr, int k) {
        int start = 0;
        int end = arr.length - 1;
        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
        int large = arr[k];
        return large;
    }

    // remove the duplicates
    static void rmDuplicates(int[] arr) {
        // int n = arr.length;
        int[] temp = new int[arr.length];
        temp[0] = arr[0];
        int res = 1;
        // int count = 1;

        for (int i = 1; i < arr.length; i++) {
            if (temp[res - 1] != arr[i]) {
                // count++;
                temp[res] = arr[i];
                res++;
            }
        }
        // optional, if you want to copy the elements of tem arr to original array
        // for (int i = 0; i < res; i++) {
        // arr[i] = temp[i];
        // }
        for (int num : temp) {
            System.out.print(num + " ");
        }
        System.out.println();
        System.out.println(temp.length - res);

    }

    // more effective solution in terms of space, not suggested at all
    static void rmDuplicates1(int[] arr) {
        int res = 1;
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] != arr[res - i]) {
                arr[res] = arr[i];
                res++;
            }
        }
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
        System.out.println(res);
    }

    // move zeroes to end
    static void rmZeroes(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 0) {
            }
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] != 0) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }

    // left rotate or counter clockwise the array
    static void lRotate(int[] arr, int n) {
        int temp = arr[0];
        n = arr.length-1;
        for (int i = 1; i < arr.length; i++) {
            arr[i - 1] = arr[i];
        }
        arr[arr.length - 1] = temp;
        // for (int num : arr) {
        //     System.out.print(num + " ");
        // }
    }

    // left rotate an array by D elements
    static void lRotateD(int[] arr, int D){
        int n =arr.length-1;
        for(int i = 0; i<D; i++){
            lRotate(arr, n);
        }
        for(int num: arr){
            System.out.print(num+" ");
        }
    }
    // more efficient way , first reverse the arrat ans than rotate it 
    // step 1
    static void swap(int [] arr, int n){
        int start = 0;
        int end = arr.length-1;
        n = arr.length-1;
        while(start<end){
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }
    // step 2
    static void lRotateD1(int[]arr, int n, int D){
        swap(arr, n);
    }

    // leaders in an array , a number in an array is leader if it does not have any number greater than that on right of it
    static void leader(int[] arr){
        ArrayList<Integer> leader = new ArrayList<>();
        int start = 0;
        int end = arr.length-1;
        while(start<end){
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
        int max = 0;
        for(int i = 0; i<arr.length; i++){
            if(arr[i]>max){
                max = arr[i];
                leader.add(max);
            }
        }
        for(int i = leader.size()-1; i>=0; i--){
            System.out.print(leader.get(i)+" ");
        }
    }

    // max difference
    static int maxDiff(int[] arr){
        int res = arr[1] - arr[0];
        for(int i = 0; i<arr.length-1; i++){
            for(int j = i+1; j<arr.length; j++){
                res = Math.max(res, arr[j]-arr[i]);
            }
        }
        return res;
    }
    public static void main(String[] args) {

        // System.out.println("Question 1");
        // int [] arr = {1,2,3,4,5,6};
        // System.out.println(find(arr, 04));

        // int[] arr = new int[5];
        // arr[0] = 5;
        // arr[1] = 6;
        // arr[2] = 10;
        // arr[3] = 15;
        // insert(arr, 80, 2, 5, 4);

        // int[] arr = { 1, 2, 3, 4, 5 };
        // delete(arr, 1);

        // int[] arr = { 90, 5, 90, 40, 100 };
        // findLarge(arr);

        // secondLarge(arr);

        // int[] arr = { 8, 11, 15, 16, 17, 18, 19, 20, 21 };
        // isSorted(arr);

        // int[] arr = { 8, 11, 15, 16, 17, 18, 19, 20, 10 };
        // System.out.println(isSorted1(arr));

        // System.out.println("Question 8 , reversing an array");
        // int[] arr = { 8, 11, 15, 16, 17, 18, 19, 20, 10 };
        // reverse(arr);

        // System.out.println("GFG question");
        // int [] arr = {7 ,10, 4, 3, 20, 15};
        // int k = 3;
        // System.out.println(kthSmallest(arr, k));

        // System.out.println("GFG question 10");
        // int[] arr = { 10, 20, 20, 30, 30, 30, 40 };
        // rmDuplicates(arr);
        // rmDuplicates1(arr);

        // System.out.println("GFG question 11");
        // int[] arr = { 0, 0, 0, 10, 0 };
        // rmZeroes(arr);

        // System.out.println("GFG question 12");
        // int[] arr = { 1, 2, 3, 4, 5 };
        // lRotate(arr);

        // System.out.println("GFG question 13");
        // int[] arr = { 1, 2, 3, 4, 5 };
        // lRotateD(arr, 2);

        // System.out.println("GFG question 14");
        // int[] arr = { 7,10,6,3,4,5,2 };
        // int[] arr = { 10,20, 30 };
        // int[] arr = { 30, 20, 10 };
        // leader(arr);

        System.out.println("GFG question 15;");
        int[] arr = {2,10,10,6,4,8,1};
        System.out.println(maxDiff(arr));
    }
}
