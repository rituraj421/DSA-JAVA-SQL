package CRASH;

import java.util.Scanner;

public class variablesVERYIMPTL2 {
    public static void main(String[] args) {
        System.out.println("hello ritu!!");
        System.out.print("hello\n ritu\n!!\n");
        // String name = " rituraj";
        int a = 45;
        int b = 36;
        int c = a + b;
        System.out.println(c);
        // double price = 25.25;
        // float d = 35.05f;

        // Quiz
        int d = (a * b) / (a - b);
        System.out.println(d);

        // Scanner sc = new Scanner(System.in);
        // String name = sc.nextLine();
        // nextFloat()
        // nextInt()
        // System.out.println(name);

        try (// Quiz 2
                Scanner sc = new Scanner(System.in)) {
            int f = sc.nextInt();
            int g = sc.nextInt();
            int sum = f + g;
            System.out.println(sum);
        }

    }

}
