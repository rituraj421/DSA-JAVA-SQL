package com.company;

public class Ch7_VarArgV33 {
    // static int sum(int a, int b){
       // return a+b;
    //}

    static int add(int ...arr){
        int result = 0;
        for (int a: arr){
            result += a;

        }
        return result;
    }
    public static void main(String[] args) {

        System.out.println("welcome to varargs land");
        //System.out.println("The sum of 4, 3, 6,is:" + sum());
        System.out.println(add(2,3,4));
        System.out.println("The sum of 8, 9, 10 is : " + add(8,9,10));
    }
}
