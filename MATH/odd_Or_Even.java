package MATH;

public class odd_Or_Even {
    public static void main(String[] args) {
        int n = 67;
        if ((n & 1) == 1) {
            System.out.println("It's odd");
        } else {
            System.out.println("It's even");
        }
    }
}