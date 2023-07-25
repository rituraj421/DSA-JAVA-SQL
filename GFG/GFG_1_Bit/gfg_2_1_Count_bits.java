package GFG_1_Bit;

public class gfg_2_1_Count_bits {
    static int count(int n) {
        int count = 0;
        while (n > 0) {
            if (n % 2 == 1) {
                count++;
                n = n / 2;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        // count number of set bits for a given number
        System.out.println(count(5));
    }
}
