package BASICS;

import java.util.Scanner;

public class practiceSet4 {
    public static void main(String[] args) {
        // question 1
        int a = 10;
        if (a == 11) {
            System.out.println("I am 11");
        } else {
            System.out.println("I am 10");
        }
        /*
         * //question1
         * byte m1, m2, m3;
         * Scanner sc = new Scanner(System.in);
         * System.out.println("Enter Your Marks in physics");
         * m1 = sc.nextByte();
         * System.out.println("Enter Your Marks in chemistry");
         * m2 = sc.nextByte();
         * System.out.println("Enter Your Marks in maths");
         * m3 = sc.nextByte();
         * float avg = (m1+m2+m3)/3.0f;
         * System.out.println("your overall percentage is: "+avg);
         * if(avg>=40 && m1>=33 && m2>=33 && m3>=33){
         * System.out.println("congrats you are passed");
         * }
         * else{
         * System.out.println("please try again");
         * }
         * 
         * 
         */
        /*
         * // question 3
         * Scanner sc = new Scanner(System.in);
         * System.out.println("Enter Your income");
         * float tax = 0;
         * float income = sc.nextFloat();
         * //float income = 3.3f;
         * if(income<2.5){
         * tax = tax + 0;
         * }
         * else if(income>2.5 && income<5){
         * tax = tax + 0.05f * (income - 2.5f);
         * }
         * System.out.println("the total tax paid by the employee is: " + tax);
         * 
         */
        // question4
        /*
         * Scanner sc = new Scanner(System.in);
         * int day = sc.nextInt();
         * 
         * switch (day){
         * case 1 -> System.out.println("monday");
         * case 2 -> System.out.println("tuesday");
         * case 3 -> System.out.println("wednesday");
         * case 4 -> System.out.println("thursday");
         * case 5 -> System.out.println("friday");
         * case 6 -> System.out.println("saturday");
         * case 7 -> System.out.println("sunday");
         * }
         * 
         */
        // question6
        int c = 365;
        if (c == 366) {
            System.out.println("Its a leap year");
        } else {
            System.out.println("It's not a leap year");
        }
        Scanner sc = new Scanner(System.in);
        System.out.println("enter number");
        int y1 = sc.nextInt();
        if (y1 == 366) {
            System.out.println("its a leap year");

        } else {
            System.out.println("its not a leap year");
        }
        sc.close();

    }
}
