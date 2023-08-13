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
        n = arr.length - 1;
        for (int i = 1; i < arr.length; i++) {
            arr[i - 1] = arr[i];
        }
        arr[arr.length - 1] = temp;
        // for (int num : arr) {
        // System.out.print(num + " ");
        // }
    }

    // left rotate an array by D elements
    static void lRotateD(int[] arr, int D) {
        int n = arr.length - 1;
        for (int i = 0; i < D; i++) {
            lRotate(arr, n);
        }
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }

    // more efficient way , first reverse the arrat ans than rotate it
    // step 1
    static void swap(int[] arr, int n) {
        int start = 0;
        int end = arr.length - 1;
        n = arr.length - 1;
        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }

    // step 2
    static void lRotateD1(int[] arr, int n, int D) {
        swap(arr, n);
    }

    // leaders in an array , a number in an array is leader if it does not have any
    // number greater than that on right of it
    static void leader(int[] arr) {
        ArrayList<Integer> leader = new ArrayList<>();
        int start = 0;
        int end = arr.length - 1;
        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
        int max = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
                leader.add(max);
            }
        }
        for (int i = leader.size() - 1; i >= 0; i--) {
            System.out.print(leader.get(i) + " ");
        }
    }

    // max difference
    static int maxDiff(int[] arr) {
        int res = arr[1] - arr[0];
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                res = Math.max(res, arr[j] - arr[i]);
            }
        }
        return res;
    }

    // frequencies of a number, not done yet
    static void frequency(int[] arr) {
        int count = 0;
        for (int i = 1; i < arr.length; i++) {
            if (arr[i - 1] == arr[i]) {
                count++;
                System.out.println(count);
            } else if (arr[i - 1] != arr[i]) {
                // System.out.println(count);
            }
        }
    }

    static int maxProfit(int[] arr, int start, int end) {
        int profit = 0;
        if (start >= end) {
            return 0;
        }
        for (int i = start; i < end; i++) {
            for (int j = i + 1; j <= end; j++) {
                if (arr[j] > arr[i]) {
                    int currProfit = arr[j] - arr[i] + maxProfit(arr, start, i - 1) + maxProfit(arr, j + 1, end);
                    profit = Math.max(profit, currProfit);
                }
            }
        }
        return profit;

    }

    // more efficient approach
    static int maxProfit(int[] arr) {
        int profit = 0;
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > arr[i - 1]) {
                profit += (arr[i] - arr[i - 1]);
            }
        }
        return profit;
    }

    // max consecutive 1's
    static int con1(int[] arr) {

        int ans = 0;
        for (int i = 0; i < arr.length; i++) {
            int count = 0;
            for (int j = i; j < arr.length; j++) {
                System.out.println(arr[i] + " " + arr[j]);
                if (arr[j] == 1) {
                    count++;
                } else {
                    break;
                }
                ans = Math.max(ans, count);
            }

        }
        return ans;
    }

    // max sub array
    static int subArray(int[] arr) {
        int ans = arr[0];
        for (int i = 0; i < arr.length; i++) {
            int curr = 0;
            for (int j = i; j < arr.length; j++) {
                curr += arr[j];
                ans = Math.max(ans, curr);
            }
        }
        return ans;
    }

    // Max alternating sub Array
    static int altSub(int[] arr) {
        int res = 1;
        int count = 1;
        for (int i = 1; i < arr.length; i++) {
            if ((arr[i] % 2 == 0 && arr[i - 1] % 2 != 0) || (arr[i] % 2 != 0 && arr[i - 1] % 2 == 0)) {
                
                count++;
                res = Math.max(count, res);
            } else {
                count = 1;
            }
        }
        return res;
    }

    // majority element
    static int major(int[] arr){
        int index = arr[0];
        int count = 1;
        int n = arr.length;
        Arrays.sort(arr);
        for(int i = 1; i<arr.length; i++){
            if(arr[i-1] == arr[i]){
                count++;
                index = i;
            }
        }
        if(count>n/2){
            return index;
        }
        else{
            return -1;
        }
    }

    // Question 27, given a  with sum
    static boolean subArray(int [] arr, int sum){
        for(int i = 0; i<arr.length; i++){
            for(int j = i+1; j<arr.length; j++){
                System.out.println(i +" " + j);
                if(arr[i] + arr[j] == sum){
                    return true;
                }
            }
        }
        return false;
    }
    // more efficient approach
    static boolean subArray1(int[] arr, int sum){
        int start = 0;
        int curr = 0;
        for(int i = 0; i<arr.length; i++){
            curr+=arr[i];
            while(sum<curr){
                curr-=arr[start];
                start++;
            }
            if(curr == sum){
                return true;
            }
        }
        return false;
    }

    // question 29,prefix sum
    static int getSum(int s, int e){
        int sum = 0;
        for(int i = s; i<=e; i++){
            // sum+=arr[i]; 
        }
        return sum;
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

        System.out.println("GFG question 12");
        int[] arr = { 1, 2, 3, 4, 5 };
        lRotateD(arr, 2);
        // lRotate(arr, 0);

        // System.out.println("GFG question 13");
        // int[] arr = { 1, 2, 3, 4, 5 };
        // lRotateD(arr, 2);

        // System.out.println("GFG question 14");
        // int[] arr = { 7,10,6,3,4,5,2 };
        // int[] arr = { 10,20, 30 };
        // int[] arr = { 30, 20, 10 };
        // leader(arr);

        // System.out.println("GFG question 15;");
        // int[] arr = {2,10,10,6,4,8,1};
        // System.out.println(maxDiff(arr));

        // System.out.println("GFG question 15;");
        // int[] arr = {10,10,10,10,25,30,30};
        // frequency(arr);

        // System.out.println();
        // int[] arr = { 1, 5, 3, 8, 12 };
        // System.out.println(maxProfit(arr, 0, arr.length - 1));

        // System.out.println(maxProfit(arr));

        // int[] arr = {0,1,1,0,1,1};
        // System.out.println(con1(arr));

        // System.out.println("GFG 18");
        // int[] arr = {1,-2, 3, -1, 2};
        // System.out.println(subArray(arr));

        // System.out.println("GFG 22");
        // int[] arr = { 10, 12, 14, 7, 8 };
        // System.out.println(altSub(arr));

        // System.out.println("GFG 23");
        // int[] arr = {20,30,40,50,50,50,50,};
        // System.out.println(major(arr));

        // Question 27, subArray
        // int[] arr = {1,4,20,3,1,10};
        // int sum = 30;
        // System.out.println(subArray1(arr, sum));
    }
}
