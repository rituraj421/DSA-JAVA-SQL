package GFG_1_Bit;

public class gfg_2_countSetBits {

    static int set(int N) {
        int count = 0;
        while (N != 0) {
            N = N & (N - 1);
            count++;
        }
        return count;
    }

    public static void main(String[] args) {
        System.out.println(set(6));
    }
}
