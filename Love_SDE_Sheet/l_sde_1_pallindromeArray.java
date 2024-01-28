package Love_SDE_Sheet;

public class l_sde_1_pallindromeArray {
    static int pallindromeArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            int num = arr[i];
            int rev = 0;

            int duplicate = num;
            while (num != 0) {
                int temp = duplicate % 10;
                rev = rev * 10 + temp;
                num = num / 10;
            }
            if (rev != duplicate) {
                return 0;
            }
        }
        return 1;
    }

    public static void main(String[] args) {
        // Given a Integer array A[] of n elements. Your task is to complete the
        // function PalinArray. Which will return 1 if all the elements of the Array are
        // palindrome otherwise it will return 0.
        int[] arr = { 111, 222, 333, 444, 555 };
        System.out.println(pallindromeArray(arr));
    }
}
