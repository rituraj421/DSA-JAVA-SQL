package SEARCHING.BINARY_SEARCH;

public class binary_1 {

    static int binarySearch(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;

        while (start < end) {
            int mid = start + (end - start) / 2; // same as (start+end )/2

            if (target < arr[mid]) {
                end = mid - 1;
            } else if (target > arr[mid]) {
                start = mid + 1;
            } else {
                return mid;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
        int ans = binarySearch(arr, 9);
        int target = 9;
        System.out.println("The target " + target + " is found at index " + ans);

    }
}
