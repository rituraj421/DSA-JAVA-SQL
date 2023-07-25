package GFG_1_Bit;

public class countDigits1_1 {

    static int countDigi(int n){
        int count = 0;
        while(n>0){
            n = n/10;
            count++;
        }
        return count;
    }
    public static void main(String[] args) {
        // count the digits
        System.out.println(countDigi(23456));
    }
}
