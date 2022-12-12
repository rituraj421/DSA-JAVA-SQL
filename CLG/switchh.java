package CLG;

import java.util.Scanner;

public class switchh {
    public static void main(String[] args) {

        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter number :");
            int b = sc.nextInt();

            switch (b) {

                case 3:
                    System.out.println("Its monday");

                    break;

                default:
                    System.out.println("Its wrong");
                    break;
            }
        }

    }

}
