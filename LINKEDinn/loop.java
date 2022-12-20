package LINKEDinn;

import java.util.Scanner;
public class loop {
    public static void main(String[] args){
        System.out.println("To check whether a number is even or odd");

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number to be checked : ");
        int num = sc.nextInt();

        if(num %2 == 0){
            System.out.println("It's an even number");
        }else{
            System.out.println("It's not even number");
        }

    }
}
