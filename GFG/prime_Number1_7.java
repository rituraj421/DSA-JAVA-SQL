package GFG;

public class prime_Number1_7 {
    static boolean prime(int a) {
        for (int i = 2; i <= a / 2; i++) {
            if (a % i == 0) {
                return false;
            }
        }
        return true;
    }

    // more optimised solution
    static boolean prime1(int n) {
        for (int i = 2; i * i <= n; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    static void factor(int c) {
        for (int i = 2; i < c / 2; i++) {
            if (prime(i)) {
                int x = i;
                while (c % x == 0) {
                    System.out.print("The prime factors are " + i + ' ');
                    System.out.println();
                    x = x * i;
                }
            }
        }
    }

    // static boolean prime2(int b) {
    //     if(b % 2 == 0 || b % 3 == 0 || b % 5 == 0){
    //         return false;
    //     }
    //     return true;
    // }

    public static void main(String[] args) {
        System.out.println(prime(9));
        System.out.println(prime1(9));
        factor(12);
        // System.out.println(prime2(391));
    }
}
