package GFG;

public class sieve_Of_Erathoshenes1_9 {
    static boolean prime1(int x) {
        for (int i = 2; i * i <= x; i++) {
            if (x % i == 0) {
                return false;
            }
        }
        return true;
    }

    static void sieve(int n) {
        for (int i = 2; i <= n; i++) {
            if (prime1(i)) {
                System.out.println("The prime numbers till " + n + " are " + i);
                ;
            }
        }
    }

    public static void main(String[] args) {
        sieve(23);
    }
}
