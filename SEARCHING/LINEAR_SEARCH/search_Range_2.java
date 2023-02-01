package SEARCHING.LINEAR_SEARCH;

public class search_Range_2 {

    static int rangeSearch(int[] arr, int target, int start, int end) {
        if (arr.length == 0) {
            return -1;
        }

        for (int index = start; index <= end; index++) {
            int element = arr[index];
            if (element == target) {
                return index;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5, 6 };
        int target = 6;
        System.out.println(rangeSearch(arr, target, 1, 4));

    }
}
