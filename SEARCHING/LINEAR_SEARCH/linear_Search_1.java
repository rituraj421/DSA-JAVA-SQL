package SEARCHING.LINEAR_SEARCH;

public class linear_Search_1 {
    public static void main(String[] args) {

        // search in the array : return the index if the item found else return -1

        int[] arr = { 22, 34, 33, 23 };
        int target = 24;

        if (arr.length == 0) {
            System.out.println(-1);
        }

        for (int i = 0; i < arr.length; i++) {
            int element = arr[i];
            if (element == target) {
                System.out.println("element found at index " +i);
            }
        }
    }
}