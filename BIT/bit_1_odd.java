package BIT;

public class bit_1_odd {
    static boolean odd(int n) {
        if ((n & 1) == 1) {
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        // find if the given number is odd or even
        System.out.println(odd(5));
    }
}
