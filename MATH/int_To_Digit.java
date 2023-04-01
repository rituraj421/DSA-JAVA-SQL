package MATH;

public class int_To_Digit {
    public static void main(String[] args) {

        // num to its digits
        int n = 1234;
        while (n != 0) {
            System.out.println(n % 10);
            n = n / 10;
        }
    }
}
