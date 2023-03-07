package RECURSION;

public class fibonacci {

    static int fibo(int n) {

        if (n < 2) {
            return n;
        }
        return fibo(n - 1) + fibo(n - 2);
    }

    public static void main(String[] args) {
        // int n = 5;
        System.out.println(fibo(5));

        int[] arr = { 1, 2, 3, 4, 55, 66, 78 };
        // int target = 4;
        System.out.println(search(arr, 66, 0, arr.length - 1));

    }

    // binary search using recursion
    static int search(int[] arr, int target, int s, int e) {
        if (s > e) {
            return -1;
        }
        int m = s + (e - s) / 2;
        if (arr[m] == target) {
            return m;
        }
        if (target < arr[m]) {
            return search(arr, target, s, m - 1);

        }
        return search(arr, target, m + 1, e);
    }

}