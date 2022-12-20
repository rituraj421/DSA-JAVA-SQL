package mypack;

import java.util.Scanner;

public class forLoop {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("How many numbers do you need to draw? ");
            int k = sc.nextInt();

            System.out.println("What is the highest number You can draw? ");
            int n = sc.nextInt();

            int lotteryOdds = 1;
            for (int i = 1; i <= k; i++)
                lotteryOdds = lotteryOdds * (n - i + 1) / i;

            System.out.println("Your odds are 1 in " + lotteryOdds + ". Good luck!");
        }
    }
}
