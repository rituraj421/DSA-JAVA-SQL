import java.math.BigInteger;

public class App {

    // factorial practice
    static int fact(int n) {
        int fac = 1;
        int count = 0;
        if (n == 0 || n == 1) {
            return 1;
        }
        else{
            fac = n * fact(n - 1);
        }
        while(fac != 0){
            fac = fac/10;
            count++;
        }
        return count;
    }

    static int count(int f){
        int count = 0;
        while(f != 0){
            f = f/10;
            count++;
        }
        return count;
    }
    // write a java method to print multiplication table
    // static int table(int n){
    //     for(int i = 1; i<=n; i++){

    //     }

    // }

    // static int abs(int a){
    //     if(a < 0){
    //         return a*-1;
    //     }
    //     else{
    //         return a;
    //     }
    // }

    // celcius to f
    // static int cel(int n){
    //     return (n * 9/5) + 32;

    // }

     static int factorialDigits(int n) {
        BigInteger factorial = BigInteger.ONE;
        for (int i = 2; i <= n; i++) {
            factorial = factorial.multiply(BigInteger.valueOf(i));
        }
        
        String factorialString = factorial.toString();
        return factorialString.length();
    }

    static boolean power(int n){
        for(int i = 1; i<= n; i++){
            if( i*i == n){
                return true;
            }
        }
        return false;
    }
    
    static int oddOccurence(int[] n){
        int res = n[0];
        for(int i = 1; i<n.length; i++){
            res ^= n[i];
        }
        return res;
    }

    static int xor(int a){
        return a&(a-1);
    }
    public static void main(String[] args) throws Exception {
        // System.out.println("Hello, World!");
        // System.out.println(fact(5));
        // System.out.println(abs(-32));
        // System.out.println(cel(34));
        // System.out.println(count(120));
        // System.out.println(factorialDigits(5));
        // System.out.println(power(6));
        // int[] n = {9,12,2,11,2,2,10,9,12,10,9,11,2};
        // System.out.println(oddOccurence(n));
        System.out.println(xor(5));
    }
}
