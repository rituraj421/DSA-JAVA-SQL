package CRASH;

import java.util.Scanner;

public class Lecture2PracticeSC {
    public static void main(String[] args) {
        try (//question 1
        Scanner sc = new Scanner(System.in)) {
            //question 3
            System.out.print("Enter your name\n");
            String c = sc.nextLine();
            System.out.println("Enter your hobby");
            String d = sc.nextLine();
            System.out.println("Enter yout fathers name");
            String e = sc.nextLine();
            System.out.println("Hey, my name is "+c+". my hobby is "+d+".  and my fathers name is "+e+". ");
        }

        //question2 
        /*
        float a = sc.nextFloat();
        float b = sc.nextFloat();
        float division = a/b;
        System.out.println(division);
        */
        


    }
    
}
