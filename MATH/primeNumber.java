package MATH;

public class primeNumber {
    static boolean prime(int n) {
        for (int i = 2; i < n; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        int n = 10;
        for (int i = 2; i <= n; i++) {
            System.out.println(i + " " + prime(i));
        }
    }
}
