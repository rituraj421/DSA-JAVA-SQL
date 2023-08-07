package PRACTICE.TCS;

public class tcs_16_twist3 {
    static void twist3(int n) {
        int a = 0;
        int c = 0;
        for (int i = 1; i < 15; i++) {
            if (i % 2 != 0) {
                System.out.print(a + " ");
                a += 2;
            }
            if (i % 2 == 0) {
                System.out.print(c + " ");
                c += 1;
            }
        }
    }

    public static void main(String[] args) {
        // 0, 0, 2, 1, 4, 2, 6, 3, 8, 4, 10, 5, 12, 6, 14, 7, 16, 8
        twist3(15);
    }
}
