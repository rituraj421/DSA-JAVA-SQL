package BASICS;
import java.util.Scanner;

public class userInput {
    public static void main(String[] args) {
        System.out.println("it works");
        Scanner Sc = new Scanner(System.in);
        System.out.println("Enter number 1");
        int a = Sc.nextInt();
        System.out.println("Enter number 2");
        int b = Sc.nextInt();
        int sum = a + b;
        System.out.println("The sum of these numbers is  ");
        System.out.println(sum);

        Sc.close();
    }
}
