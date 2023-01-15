package CRASH;

import java.util.Scanner;

public class Lecture8Exercise1 {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            // problem 1
            /*
             * System.out.println("Enter a");
             * float a = sc.nextFloat();
             * System.out.println("Enter b");
             * float b = sc.nextFloat();
             * System.out.println("Enter c");
             * float c = sc.nextFloat();
             * 
             * float average = (a + b+ c) / 3;
             * System.out.println(average);
             */
            // problem 2
            /*
             * System.out.println("Enter n");
             * int n = sc.nextInt();
             * int sum = 0;
             * for(int i = 1; i<=n; i++)
             * {
             * if((i%2 != 0))
             * {
             * sum = sum+i;
             * }
             * System.out.println(sum);
             * }
             */
            /*
             * //problem 3
             * System.out.println("Enter a");
             * int a = sc.nextInt();
             * System.out.println("Enter b");
             * int b = sc.nextInt();
             * System.out.print("The greater number is :- " );
             * if(a>b){
             * System.out.println(a);
             * }
             * else{
             * if(b>a){
             * System.out.println(b);
             * }
             * }
             */
            // problem 4
            /*
             * System.out.println("Enter radius");
             * float radius = sc.nextFloat();
             * float circumference = (float) (2*3.14*radius);
             * System.out.println(circumference);
             */
            // problem 5
            System.out.println("Enter your age");
            int age = sc.nextInt();
            if (age > 18) {
                System.out.println("You can vote!!");
            } else {
                System.out.println("You can't vote!!");
            }
            // problem 6

            // problem 7
            int positive = 0, negative = 0, zeros = 0;
            System.out.println("press 1 to continue & 0 to stop");
            // Scanner sc = new Scanner(System.in);
            int input = sc.nextInt();
            while (input == 1) {
                System.out.println("Enter your number : ");
                int number = sc.nextInt();
                if (number > 0) {
                    positive++;
                } else if (number < 0) {
                    negative++;
                } else {
                    zeros++;
                }
                System.out.println("Press 1 to continue & 0 to stop");
                input = sc.nextInt();
            }

            System.out.println("Positives : " + positive);
            System.out.println("Negatives : " + negative);
            System.out.println("Zeros : " + zeros);
        }
    }
}
