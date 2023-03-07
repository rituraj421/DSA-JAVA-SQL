package RECURSION;

public class product {
    public static void main(String[] args) {
        System.out.println(fact(10));

        System.out.println(digiPro(123));
    }

    static int fact(int n) {
        if (n <= 1) {
            return 1;
        }
        return n * fact(n - 1);
    }

    static int digiPro(int m) {
        if (m % 10 == m) {
            return m;
        }
        return (m % 10) * digiPro(m / 10);
    }
}