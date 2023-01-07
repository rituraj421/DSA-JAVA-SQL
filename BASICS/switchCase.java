package BASICS;

import java.util.Scanner;
public class switchCase {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your age : ");
        int age = sc.nextInt();

        switch(age){
            case 18:
            System.out.println("You are about to mature");
            break;
            case 30:
            System.out.println("Fully matured");
            break;
            case 45:
            System.out.println("Enoughh");
            break;
            case 60:
            System.out.println("You should retire now");
            default:
            System.out.println("Enjoy man || child!");
        }


        //SOME PRACTICE QUESTIONS 
        //problem 1st
        // identify if the student is pass of fail

        System.out.println("Enter ur marks in Physics");
        double phy = sc.nextDouble();
        System.out.println("Enter ur marks in chemistry");
        double che = sc.nextDouble();
        System.out.println("Enter ur marks in Maths");
        double mat = sc.nextDouble();
        System.out.println("Enter ur marks in JAVA");
        double ja = sc.nextDouble();

        double avg =( phy + che + mat + ja ) / 4;
        if ( avg >=40 && phy>=33 && che>=33 && mat>=33 && ja>=33){
            System.out.println("You are passed");
        }
        else{
            System.out.println("Failed");
        }
        sc.close();
    }
}
