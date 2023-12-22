package PRACTICE.TCS.NUMBER_SERIES;

public class ns_3_leapYear {
    static boolean leap(int N) {
        if (N % 400 == 0 || N % 4 == 0 && N % 100 != 0) {
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        // given a number check if it is leap year or not
        System.out.println(leap(4));
    }
}
