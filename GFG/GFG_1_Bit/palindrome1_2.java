package GFG_1_Bit;

public class palindrome1_2 {

    static boolean palindrom(int n){
        int rev = 0;
        int temp = n;
        while(temp != 0){
            int ld = temp%10;
            rev = rev*10 + ld;
            temp = temp/10;
        }
        return rev == n;
    }
    public static void main(String[] args) {
        System.out.println(palindrom(121));
    }
}
