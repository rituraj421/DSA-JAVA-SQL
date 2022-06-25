package com.company;

public class Ch5_PracticeSetV25 {
    public static void main(String[] args) {
// problem 1
       int n  = 4;
        for(int i = n; i > 0; i-- ){
            for(int j = 0; j<i; j++){
                System.out.print("*");
            }
            System.out.print("\n");
        }
        // problem 2
        int sum = 0;
        int b = 5;
        for(int a = 0; a < b; a++){
            sum =sum + (2*a);
        }
        System.out.println("sum of first even natural numbers is: ");
        System.out.println("sum");

    }
}
