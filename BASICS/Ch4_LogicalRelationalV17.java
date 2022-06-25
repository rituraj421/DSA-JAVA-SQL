package com.company;

public class Ch4_LogicalRelationalV17 {
    // logical AND ,
    public static void main(String[] args) {
        boolean a = false;
        boolean b = true;
        if (a && b){
            System.out.println("Y");
        }
        else{
            System.out.println("N");
        }

        boolean c = true;
        boolean d = false;
        if (c || d){
            System.out.println("Y");
        }
        else{
            System.out.println("N");
        }

        System.out.println("NOT (a) is");
        System.out.println(!a);
    }
}
