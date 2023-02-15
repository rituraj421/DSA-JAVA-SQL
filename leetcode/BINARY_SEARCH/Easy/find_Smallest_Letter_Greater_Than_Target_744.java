package leetcode.BINARY_SEARCH.Easy;

public class find_Smallest_Letter_Greater_Than_Target_744 {

    static char nextGreatestLetter(char[] letters, char target) {
        char ans = letters[0];
        int start = 0;
        int end = letters.length - 1;

        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (target < letters[mid]) {
                ans = letters[mid];
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        char[] letters = { 'c', 'f', 'j' };
        char ans = nextGreatestLetter(letters, 'c');
        System.out.println(ans);

    }
}
