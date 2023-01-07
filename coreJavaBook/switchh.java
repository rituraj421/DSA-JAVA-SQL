package coreJavaBook;

import java.util.Scanner;
public class switchh {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Select an option(1,2,3,4)");
        int choice = sc.nextInt();

        switch(choice){
            case 1:
            System.out.println("this is case 1");
            break;

            case 2:
            System.out.println("this is case 2");
            break;

            case 3:
            System.out.println("This is case 3");
            break;

            case 4:
            System.out.println("This is case 4");
            break;

            default:
            System.out.println("Bad inpiut");
            break;
        }
        sc.close();
    }
}
