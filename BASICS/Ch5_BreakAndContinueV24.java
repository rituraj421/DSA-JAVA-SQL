package com.company;

public class Ch5_BreakAndContinueV24 {
    public static void main(String[] args) {
        // break and continue using loop
        System.out.println("first n natural numbers");
        for (int i = 0; i <=5; i++){
            System.out.println(i);
            if (i==4){
                System.out.println("ending the loop");
                break;
            }
        }
    }
}
