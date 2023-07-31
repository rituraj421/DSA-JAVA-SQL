package PRACTICE.TCS;

public class tcs_5_maxGue {
    static int maxGuest(int[] enter, int[] exit, int hr) {
        int max = 0;
        int diff = 0;
        for (int i = 0; i < 5; i++) {
            diff = (diff + enter[i]) - (exit[i]);
            if (diff > max) {
                max = diff;
            }
        }
        return max;
    }

    public static void main(String[] args) {
        int[] enter = { 7, 0, 5, 1, 3 };
        int[] exit = { 1, 2, 1, 3, 4 };
        int hr = 5;
        System.out.println(maxGuest(enter, exit, hr));
    }
}
