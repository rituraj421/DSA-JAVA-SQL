package PRACTICE.TCS;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;

import BASICS.hashSet;

public class tcs_1_Sheet1 {
    static boolean perfect(int num) {
        if (num == 1) {
            return true;
        }
        for (int i = 0; i < num; i++) {
            if (i * i == num) {
                return true;
            }
        }
        return false;
    }

    // step 1
    static int digit(int n) {
        int temp = 0;
        while (n != 0) {
            temp += n % 10;
            n = n / 10;
        }
        return temp;
    }

    // step 2
    static int digit1(int n) {
        while (n > 9) {
            n = digit(n);
        }
        return n;
    }

    // Given an integer as input and replace all the ‘0’ with ‘5’ in the integer.
    static void replace5(int n) {
        ArrayList<Integer> list = new ArrayList<>();
        while (n != 0) {
            list.add(n % 10);
            n = n / 10;
        }
        System.out.println(list);
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) == 0) {
                list.set(i, 5);
            }
        }
        System.out.println(list);
    }

    // A number is a perfect number if is equal to sum of its proper divisors, that
    // is, sum of its positive divisors excluding the number itself. Write a
    // function to check if a given number is perfect or not.

    static boolean perfectNum(int n) {
        ArrayList<Integer> arr1 = new ArrayList<>();
        int sum = 0;
        for (int i = 1; i < n; i++) {
            if (n % i == 0) {
                arr1.add(i);
            }
        }
        System.out.println(arr1);
        for (int i = 0; i < arr1.size(); i++) {
            sum += arr1.get(i);
        }
        System.out.println(sum);
        if (n % sum == 0) {
            return true;
        }
        return false;
    }

    // Given a number x, determine whether the given number is Armstrong’s number or
    // not.
    // A positive integer of n digits is called an Armstrong number of order n
    // (order is the number of digits) if
    // abcd... = pow(a,n) + pow(b,n) + pow(c,n) + pow(d,n) + ....
    static boolean ArmstrongNum(int n) {
        ArrayList<Integer> arr = new ArrayList<>();
        int temp = 0;
        int temp1 = n;
        int sum = 0;
        while (n != 0) {
            temp = n % 10;
            arr.add(temp);
            n = n / 10;
        }
        int a = arr.size();
        System.out.println(arr);
        for (int i : arr) {
            sum += Math.pow(i, a);
        }
        System.out.println(sum);
        return (sum == temp1);
    }

    // sum of n natural numbers
    static int sumNum(int n) {
        int sum = 0;
        for (int i = 0; i <= n; i++) {
            sum += i;
        }
        return sum;
    }

    // Given N, the number of persons. The task is to arrange N person around a
    // circular table.
    static int table(int n) {
        int a = n;
        int fact = 1;
        if (a == 0 || a == 1) {
            return a;
        }
        fact = a * table(a - 1);
        return fact;
    }

    // Happy number, not done
    static boolean happy(int n) {
        int temp = 0;

        while (n != 0) {
            temp += (n % 10) * (n % 10);
            n = n / 10;
        }
        if (temp != 1) {
            happy(temp);
        }
        System.out.println(temp);
        if (temp == 1) {
            return true;
        } else {
            return false;
        }
    }

    // return sum of given array
    static void sum(int[] arr) {
        // Given an array of integers, find the sum of its elements.
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        System.out.println(sum);
    }

    // return frequency of a number
    static boolean sort(int[] arr){
        for(int i = 1; i<arr.length; i++){
            if(arr[i-1]>arr[i]){
                return false;
            }
        }
        return true;
    }

    static void zero(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 0) {
                for (int j = i + 1; j < arr.length; j++) {
                    if (arr[j] != 0) {
                        int temp = arr[i];
                        arr[i] = arr[j];
                        arr[j] = temp;
                    }
                }
            }
        }
        for (int num : arr) {
            System.out.print(num + " ");
        }
    } 

    // code for zeros , more efficient
    static void zeroo(int[] arr) {
    int nonZeroIndex = 0;

    // Move all non-zero elements to the front of the array
    for (int i = 0; i < arr.length; i++) {
        if (arr[i] != 0) {
            arr[nonZeroIndex++] = arr[i];
        }
    }

    // Fill the remaining elements with zeros
    while (nonZeroIndex < arr.length) {
        arr[nonZeroIndex++] = 0;
    }

    for (int num : arr) {
        System.out.print(num + " ");
    }
}

    static void add(int[] arr, int x){
        arr[arr.length-1] += x;
        for(int n:arr){
            System.out.print(n+" ");
        }
    }
    static void duplicates(int[] arr){
        ArrayList<Integer> list = new ArrayList<>();
        Arrays.sort(arr);
        for(int i = 1; i<arr.length; i++){
            if(arr[i] == arr[i-1]){
                list.add(arr[i]);
            }
        }
        System.out.println(list);
    }

    // right rotation
    static void rightRotate(int[] arr) {
        int temp = arr[arr.length - 1];
        for (int i = arr.length - 2; i >= 0; i--) {
            arr[i + 1] = arr[i];
        }
        arr[0] = temp;
    }

    static void rightRotateD(int[] arr, int d) {
        for (int i = 0; i < d; i++) {
            rightRotate(arr);
        }
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }

    // single number
    static int single(int[] arr){
        int ans = 0;
        for(int i = 0; i<arr.length; i++){
            ans^=arr[i];
        }
        return ans;
    }

    // mean and median of unsorted array
    static void arithmatic(int [] arr){
        ArrayList<Float> list = new ArrayList<>();
        float sum = 0;
        int n = arr.length-1;

        Arrays.sort(arr);
        for(int num: arr){
            sum+=num;
        }
        float mean = sum/arr.length;
        list.add(mean);

        if(arr.length%2 == 0){
        Float median = (float)(arr[arr.length-1]+1)/2;
        list.add(median);
        }
        else{
            Float median = (float)(arr[n/2]);
            list.add(median);
        }

        System.out.println(list);

    }

    static void distinct(int[] arr){
        Arrays.sort(arr);
        HashSet<Integer> hs = new HashSet<>();
        for(int i = arr.length-1; i>=0; i--){
            hs.add(arr[i]);
            if(hs.size()== 3){
                System.out.println(arr[i]);
            }
        }
        System.out.println(hs);
        for(int num: arr){
            System.out.print(num+" ");
        }
        System.out.println(arr[arr.length-1]);

    }
    // more efficient way and easy to understand*****
    static void distinct1(int[] arr){
        Arrays.sort(arr);
        int count = 0;
        int ans = 0;
        for(int i = arr.length-1; i>=0; i--){
            if(arr[i] != arr[i-1]){
                count++;
            }
            if(count == 3){
                ans = arr[i];
                System.out.println(ans);
            }
        }
        System.out.println(arr[arr.length-1]);
    }

    public static void main(String[] args) {
        // int num = 100000001;
        // System.out.println(perfect(num));
        // System.out.println(Math.pow(2, 31)/2);
        // System.out.println(digit1(38));
        // replace5(1020302);

        // question 12
        // System.out.println(perfectNum(6));

        // question 13
        // ArmstrongNum(153);
        // System.out.println(ArmstrongNum(153));

        // Question 14
        // System.out.println(sumNum(3));

        // Question 15
        // int n = 4;
        // System.out.println(table(n-1));

        // int[] arr = {-100,-98,-1,2,3,4};
        // Arrays.sort(arr);
        // for(int i : arr){
        // System.out.print(i+" ");
        // }
        // System.out.println(arr);

        // happy(19);
        // System.out.println(happy(19));

        // int[] arr = { 1, 2, 3 };
        // sum(arr);

        // int[] arr = {10, 20, 20, 10, 10, 20, 5, 20};
        // System.out.println(sort(arr));

        //  int[] arr = {10, 0, 0, 0, 10, 20, 5, 20};
        //  zeroo(arr);

        // int[] arr = new int[4];
        // arr[0] = (1);
        // arr[1] = (3);
        // arr[2] = (0);
        // add(arr, 10);

        // int []arr = {1, 2, 3, 6, 3, 6, 1};
        // duplicates(arr);

        // int[] arr = {1, 3, 5, 7, 9};
        // rightRotate(arr, 0);
        // rightRotateD(arr, 2);

        // int[] arr = {2,2,1};
        // System.out.println(single(arr));
        // int[] arr = {1, 3, 4, 2, 6, 5, 8, 7};
        // int[] arr = {4, 4, 4, 4, 4};
        // arithmatic(arr);

        int[] arr = {2,2,3,3,1,1,5};
        distinct(arr);
        distinct1(arr);
    }
}
