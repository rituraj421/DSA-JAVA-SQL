package BIT;

public class bit_3_ithBit {
    static int bit(int n, int i){
        int shift = n>>i-1;
        return shift&1;
    }
    public static void main(String[] args) {
        System.out.println(bit(5, 1));
    }
}
