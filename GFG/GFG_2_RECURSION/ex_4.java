package GFG_2_RECURSION;

public class ex_4 {

    static int digits(int n) {
        if (n == 0) {
            return 0;
        }
        return digits(n / 10) + n % 10;
    }

    static int fun(int x, int y){
        if(x == 0){
            return y;
        }
        return fun(x-1, x+y);
    }
    public static void main(String[] args) {
        // our problem is to fimnd the dum of digits using recursion
        // System.out.println(digits(245));
        System.out.println(fun(4, 3));
    }
}
