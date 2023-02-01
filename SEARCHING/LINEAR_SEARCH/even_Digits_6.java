package SEARCHING.LINEAR_SEARCH;

public class even_Digits_6 {
    public static void main(String[] args) {
        int count = 0;
        int[] nums = { 1, 22, 43, 5 };
        String[] s = new String[nums.length];
        for (int i = 0; i < nums.length; i++) {
            s[i] = Integer.toString(nums[i]);
        }
        for (int j = 0; j < s.length; j++) {
            if (s[j].length() % 2 == 0) {
                count++;
            }
        }
        System.out.println("there are total " + count + " numbers with even length");
    }
}
