package leetcode.MATH.EASY;

public class count_Of_Matches_In_Tournament_1688 {
    static int numberOfMatches(int n) {
        int tournaments = 0;
        while (n > 1) {
            if (n % 2 == 0) {
                tournaments += n / 2;
                n = n / 2;
            } else if (n % 2 == 1) {
                tournaments += (n - 1) / 2;
                n = (n - 1) / 2 + 1;
            }
        }
        return tournaments;
    }

    public static void main(String[] args) {
        System.out.println(numberOfMatches(13));
    }
}
