package BASICS;

import java.util.Scanner;
public class logicalRelational {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a ");
        boolean a = sc.nextBoolean();
        System.out.println("Enter b ");
        boolean b = sc.nextBoolean();

        // boolean a = true;
        // boolean b = false;

        if(a && b){  //returns true if both are true , else returns false
            System.out.println("true");
        }
        else{
            System.out.println("false");
        }

        if(a || b){ // returns true if any one of them is true 
            System.out.println("true");
        }
        else{
            System.out.println("false");
        }

        if(a != b){ //returns if a(not) = b
            System.out.println("true");
        }
        else{
            System.out.println("false");
        }
        
        sc.close();
    }
}