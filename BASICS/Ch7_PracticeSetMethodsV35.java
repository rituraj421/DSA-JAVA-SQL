package com.company;

public class Ch7_PracticeSetMethodsV35 {
    static void multiplication(int n){
        for(int i = 1; i<=10;i++){
            System.out.format("%d X %d = %d\n", n,i,n*i);
        }
    }
    static void pattern1(int n){
        for(int i = 0; i<n;i++){
            for(int j =0;j<i+1;++j){
                System.out.print(" *");
            }
            System.out.println();
        }
    }
    /*
    static void sum(int n){
        for(int i = 1; i<+n;i++){
            System.out.println("The sum of first n natural number is " + "sum + i");
        }
    }


     */
    public static void main(String[] args) {
        multiplication(7);
        pattern1(6);
       // sum(4);

        //problem 2


    }
}
