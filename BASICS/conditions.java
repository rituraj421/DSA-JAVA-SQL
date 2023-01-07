package BASICS;

import java.util.Scanner;
public class conditions {
    public static void main(String[] args){

        Scanner sc = new Scanner (System.in);

        System.out.println("Enter your age : ");
        int age = sc.nextInt();
        
        if(age>18){
            System.out.println("You can drive");
        }
        else{
            System.out.println("You cannot drive");
        }

        //else if else
        if (age > 58){
            System.out.println("You should retire!!");
        }
        else if(age >46){
            System.out.println("You can Still Work!");
        }
        else if(age>36){
            System.out.println("that's what we want");
        }
        else{
            System.out.println("You are not fit for us");
        }

        sc.close();
    }
}