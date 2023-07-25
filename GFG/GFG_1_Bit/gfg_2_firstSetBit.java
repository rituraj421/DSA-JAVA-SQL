package GFG_1_Bit;

public class gfg_2_firstSetBit {

    static int setBit(int n){
        int count = 1;
        while((n&1)==0){
            n = n>>1;
            count++;
        }
        return count;
    }

    public static void main(String[] args) {
        // here we need to find the firsrt set bit
        System.out.println(setBit(18));
    }
}
