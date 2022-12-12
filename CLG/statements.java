package CLG;

import java.util.Scanner;
public class statements {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter a");
            int a = sc.nextInt();
            System.out.println("Enter b");
            int b = sc.nextInt();
            
            // int a = 10, b = 11;
            if (a > b) {
                System.out.println("Correct");
            } 
            else {
                System.out.println("Wrong");
            }
        }
        int number = 10;
        if (number < 0) {
            System.out.println("Its negative");
        } 
        else {
            System.out.println("Its positive");
        }
        int x = 0;
        if (x > 0) {
            System.out.println("Its a positive number");
        } 
        else if(x == 0){
            System.out.println("its zero");
        }
        else {
            System.out.println("Its negative");
        }
    }

}
