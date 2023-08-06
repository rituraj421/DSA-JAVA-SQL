package PRACTICE.TCS;

public class tcs_14_twist2 {
    static void twist2(int n) {
        int a = 2, b = 3;
        int c = 1;
        for (int i = 1; i <= 15; i++) {
            if (i % 2 != 0) {
                c = a * 2;
                a = c;
                System.out.print(c + " ");
            }
            if (i % 2 == 0) {
                c = b * 3;
                b = c;
                System.out.print(b + " ");
            }
        }
    }

    public static void main(String[] args) {
        twist2(15);
    }
}
