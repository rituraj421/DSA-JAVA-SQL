package CRASH;

import java.util.Scanner;
public class Lecture7MethodsHW {
    //problem 1
    public static void checkPrime(int x){
        for(int i = 2; i<x; i++){
            if(x%i != 0){
                System.out.println("It's a prime");
                return;
            }
            else{
                if(x%i == 0){
                    System.out.println("It's not a prime");
                    return;
                }
            }
        }
    }
    //problem 2
    public static void checkEven(int y){
        int i = 2;
            if(y%i == 0){
                System.out.println("It's an even");
                return;
            }
            else{
                System.out.println("It's not an even");
                return;
            }
        }
        //problem 3
        /*
    public static void printTable(int z){ // i wanted to print table but it's printing square of given number
        int table = z;
        for(int i = 1; i <= z; ++i){
            table = z*i;
        }
        System.out.println(table);
        return;
    }
    */
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter x");
            int x = sc.nextInt();
            checkPrime(x);

            //problem 2
            System.out.println("Enter y");
            int y = sc.nextInt();
            checkEven(y);

            //problem 3
            /*
            System.out.println("Enter z");
            int z = sc.nextInt();
            printTable(z);
            }
            */

            //problem 3
            System.out.println("Enter z");
            int z = sc.nextInt();
            for(int i = 1; i<=10; i++){
                System.out.println(z*i);
            }
        }
    }
}
    

