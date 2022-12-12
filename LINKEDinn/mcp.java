package LINKEDinn;

import java.util.Scanner;

public class mcp {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            String question = "Which is the largest state in india?";
            String A = "Raj";
            String B = "UP";
            String C = "Mah";

            String correctAns = A;
            System.out.println(question);

            System.out.println("Choose one of the following " + A + "," + B + "," + C);
            String Choice = sc.nextLine();

            if (Choice.equals(correctAns)) {
                System.out.println("You are right");
            } else {
                System.out.println("Incorrect, Correct ans is :" + A);
            }
        }
    }
}
