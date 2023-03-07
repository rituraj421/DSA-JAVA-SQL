package RECURSION;

public class sumDigits {
    public static void main(String[] args) {

        System.out.println(summ(143));
    }

    static int summ(int n) {

        if (n == 0) {
            return 0;
        }
        return (n % 10) + summ(n / 10);
    }
}
