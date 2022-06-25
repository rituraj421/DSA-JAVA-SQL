package com.company;
import java.util.Scanner;

public class Ch4_SwitchCaseV18 {
    public static void main(String[] args) {
        int age;
        System.out.println("Enter your age");
        Scanner sc = new Scanner(System.in);
        age = sc.nextInt();

        switch(age){
            case 18:
                System.out.println("You are going to become adult");
                break;
            case 22:
                System.out.println("You are now an employee");
                break;

        }

        /*
        int age = 47;
        if (age>56){
            System.out.println("You Are Experienced!");
        }
        else if(age>46){
            System.out.println("You Are Semi-Experienced!");
        }
        else{
            System.out.println("You Are A Child");
        }

         */
    }


}
