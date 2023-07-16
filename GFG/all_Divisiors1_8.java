package GFG;

public class all_Divisiors1_8 {
    static void divisior(int n) {
        for (int i = 1; i <= n; i++) { // or we can go till i*i as well as n/2
            if (n % i == 0) {
                System.out.println(" The divisior of " + n + " is " + i);
            }
        }
    }

    public static void main(String[] args) {
        // find all the divisiors of a number
        divisior(15);
    }
}
