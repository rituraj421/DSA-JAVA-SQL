package BASICS;

import java.util.Scanner;
public class recursion {
    static int fact(int n){
        if( n==0 || n==1){
            return 1;
        }
        else{
            return n*fact(n-1);
            
        }
    }
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number : ");
        int num = sc.nextInt();
        
        long factorial = 1;
        for (int i = 1; i<= num; i++){
            factorial = factorial*i;

        }
        System.out.println("The factorial of " + num + " is " + factorial);

        System.out.println("Enter new n :");
        int n = sc.nextInt();
        System.out.println("The factorial of " + n + " is " + n*fact(n-1)); // or else fact(n)
        sc.close();
    }
}

