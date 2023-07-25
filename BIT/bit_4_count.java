package BIT;

public class bit_4_count {

    static int count(int n, int base) {
        int count = 0;
        while (n > 0) {
            n = n >> 1;
            count++;
        }
        return count;
    }

    public static void main(String[] args) {
        // here we need to count the number of digits in a given number t0 the given
        // base
        System.out.println(count(4, 2));
    }
}
