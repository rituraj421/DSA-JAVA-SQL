package PRACTICE.TCS;

public class tcs_20_fib {
    static int fib(int n){
        if(n<2){
            return n;
        }
        return fib(n-1)+fib(n-2);
    }
    public static void main(String[] args) {
        // print fib series
        System.out.println(fib(10));
    }
}
