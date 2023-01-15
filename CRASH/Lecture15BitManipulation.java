package CRASH;

import java.util.Scanner;
public class Lecture15BitManipulation {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter n");
            // int n = sc.nextInt();
            System.out.println("Enter x");
            int x = sc.nextInt();//problem 2
            /*
            int pos = 2;
            int bitMask = 1<<pos;
            if((bitMask & n) == 0){
                System.out.println("bit was zero");
            }else{
                System.out.println("bit was one");
            }
            */
            //problem2
            int pos = 1;
            int bitMask = 1<<pos;
            int newNumber = bitMask | x;
            System.out.println(newNumber);
        }
    }
}
