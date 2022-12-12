package CLG;

import java.util.Scanner;

public class switchChar {
    public static void main(String[] args) {

        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter number :");
            char b = sc.next().charAt(0);

            switch (b) {
                case 'a':
                    System.out.println("Its monday");
                    break;

                default:
                    System.out.println("Its wrong");
                    break;
            }
        }

    }

}
