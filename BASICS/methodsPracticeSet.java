package BASICS;

import java.util.Scanner;

public class methodsPracticeSet {

    static void multiplication(int a) {
        for (int i = 1; i <= 10; i++) {
            System.out.println(a * i);
        }
    }

    static void pattern(int b) {
        for (int i = 0; i <= b; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println("-");
        }
    }

    static int sum(int c) {
        if (c == 1) {
            return 1;
        } else {
            return c + sum(c - 1);
        }
    }

    static void pattern1(int d) {
        for (int i = d; i >= 0; i--) {
            System.out.println();
            for (int j = 0; j <= i; j++) {
                System.out.print("*");
            }
            // System.out.println(" ");
        }
    }

    static int fib(int e) {
        if (e == 1) {
            return 0;
        } else if (e == 2) {
            return 1;
        } else {
            return fib(e - 1) + fib(e - 2);
        }
    }

    // static int avg(int [] numbers){
    // int sum = 0;
    // for(int num : numbers){
    // sum += num;
    // }
    // return avg(numbers);
    // double average = (double) sum / numbers.length;
    // System.out.println(average);
    // }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // PROBLEM 1
        // WRITE A JAVA PROGRAM TO PRINT A MULTIPLICATION TABLE

        System.out.println("PROBLEM 1, multiplication table");
        System.out.println("Enter a : ");
        int a = sc.nextInt();
        multiplication(a);

        // PROBLEM 2
        // write a program to print the pattern
        System.out.println("PROBLEM 2, write a program to print the pattern");
        System.out.println("Enter b : ");
        int b = sc.nextInt();
        pattern(b);

        // PROBLEM 3
        // write a recursive function to calculate the sum of first n natural numbers

        System.out.println("Problem 3, write a recursive function to calculate the sum of first n natural numbers");
        System.out.println("Enter c : ");
        int c = sc.nextInt();
        System.out.println("The sum of first " + c + " natural number is " + (c + sum(c - 1)));

        // PROBLEM 4
        // write a function to print the pattern1

        System.out.println("PROBLEM 4, write a program to print the pattern1");
        System.out.println("Enter d : ");
        int d = sc.nextInt();
        pattern1(d);

        // PROBLEM 5
        // write a function to print the fib series

        System.out.println("PROBLEM 5, write a program to print the fib series");
        System.out.println("Enter e : ");
        int e = sc.nextInt();
        fib(e);
        System.out.println(fib(e));

        // PROBLEM 6
        // write a function to print average
        // System.out.println("PROBLEM 6, write a program to print the average");
        // System.out.println("Enter f : ");
        // int f = sc.nextInt();
        // System.out.println("The avg of 4 , 5 , 6 , 7, and 8 is: " + avg(4,5, 6,
        // 7,8));

        sc.close();
    }
}