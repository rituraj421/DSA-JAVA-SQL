package mypack;

import java.util.Scanner;
public class whilee {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("How muchh money do you need to retire?  ");
        double goal = sc.nextDouble();

        System.out.println("How muchh money will you contribute every year?  :");
        double payment = sc.nextDouble();

        System.out.println("Interest rate in %: ");
        double interestRate = sc.nextDouble();
        // double payment = 300;

        // double interestRate = 0.7;

        double balance = 0;
        int years = 0;
        while (balance < goal)
        { 
        balance += payment;
        double interest = balance * interestRate/7;
        balance += interest;
        years++;
        
            }
            System.out.println("You can retire in " + years + " years.");
    }
}
