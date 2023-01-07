package coreJavaBook;

import java.util.*;
public class input {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        //take first input
        System.out.println("What is Your name? ");
        String name = sc.nextLine();

        //take second input
        System.out.println("How old Are You? ");
        double age = sc.nextDouble();

        System.out.println("Hello, " + name + ". Next year, you'll be " + (age + 1));

        System.out.printf("Hello, %s. Next year, you'll be %d", name, age);
        sc.close();
    }
}
