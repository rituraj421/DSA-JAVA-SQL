package PRACTICE.TCS.ARRAY;

public class a_4_findSmallestElement {

    static int smallest(int[] arr) {
        // threre are multiple ways to solve thos problem,
        // 1. using sorting
        // 2. using linear search
        // 3. using min function
        // hrere we will use min function as its time complexity is O(n) which is less than sorting(O(nlogn)
        
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
