package FORK_JAVA;

public class f_2 {
    public static void main(String[] args) {
        // playing with the "+" operator
        System.out.println(2 + 3);
        System.out.println(2 + 3 + " " + "rituraj");
        System.out.println("rituraj" + " " + 2 + 3);
        System.out.println(2 + 3 + "rituraj" + 2 + 3);
        System.out.println(2 + 3 + "rituraj" + (2 + 3));

        int n = 99;
        boolean isPrime = true;
        for (int i = 4; i < n; i++) {
            if (n % i == 0) {
                isPrime = false;
                break;
            }
        }
        if (isPrime) {
            System.out.println("Its a prime");
        } else {
            System.out.println("its not a prime");
        }
        //
        if (n == 1 || n == 4) {
            System.out.println("No");
        } else if (n == 2 || n == 3) {
            System.out.println("Yes");
        } else {

            boolean isprime = true;

            for (int i = 2; i < n; i++) {
                if (n % i == 0) {
                    isprime = false;
                    break;
                }
            }
            if (isprime) {
                System.out.println("Yes");
            } else {
                System.out.println("No");
            }
        }

        // int t;
        // System.out.println(t);

        // for(int i = 0; 0; i++){
        // System.out.println("Hello");
        // }
    }
}
