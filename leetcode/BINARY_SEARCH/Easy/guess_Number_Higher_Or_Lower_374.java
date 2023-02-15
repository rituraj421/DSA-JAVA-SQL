package leetcode.BINARY_SEARCH.Easy;

public class guess_Number_Higher_Or_Lower_374 {
    static int guessGame(int n) {
        int start = 0;
        int end = n;

        while (start <= end) {
            int mid = start + (end - start) / 2;

            int ans = guessGame(mid);

            if (ans == 0) {
                return mid;
            } else if (ans < 0) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        System.out.println(guessGame(10));
    }
}
