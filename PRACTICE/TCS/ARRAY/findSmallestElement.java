package PRACTICE.TCS.ARRAY;

public class findSmallestElement {

    static int smallest(int[] arr) {
        // threre are multiple ways to solve thos problem,
        // 1. using sorting
        // 2. using linear search
        // 3. using min function
        int min = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        return min;
    }

    public static void main(String[] args) {
        int[] arr = { 1, 8, 30, -5, 20, 7 };
        System.out.println(smallest(arr));
    }
}
