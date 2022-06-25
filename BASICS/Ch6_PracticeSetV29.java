package com.company;

public class Ch6_PracticeSetV29 {
    public static void main(String[] args) {
        //problem 1
        float [] marks = {42.9f, 44.00f, 11.1f, 13.02f, 19.10f};
        float sum = 0;
        for(float element:marks){
            sum = sum+element;
        }
        System.out.println("The value of sum is"+sum);
    }
}
