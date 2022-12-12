package CLG;

import java.util.Scanner;

public class switchString {
    public static void main(String[] args) {

        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter number :");
            String b = sc.nextLine();

            switch (b) {
                case "abc":
                    System.out.println("Its monday");
                    break;

                default:
                    System.out.println("Its wrong");
                    break;
            }
        }

    }

}