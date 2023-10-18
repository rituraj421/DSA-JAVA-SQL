package GFG.GFG_00_Practice;

public class gfg_2_EquilibriumNumber {
    static int equilibrium(int[] arr) {
        int sum = 0;
        int leftSum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        for (int i = 0; i < arr.length; i++) {
            if (leftSum == (sum - leftSum - arr[i])) {
                return i + 1;
            }
            leftSum += arr[i];
        }
        return -1;
    }

    public static void main(String[] args) {
        // here we need to find if there is a equilibrium point or not
        int[] arr = { 1, 3, 5, 2, 2 };
        System.out.println(equilibrium(arr));
    }
}
