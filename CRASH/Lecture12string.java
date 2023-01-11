package CRASH;

import java.util.Scanner;

public class Lecture12string {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            String name = sc.nextLine();
            System.out.println("Your name is : " + name);
        }
        // concatenation
        String firstName = "ritu ";
        String lastName = " Choudhary";
        String fullName = firstName + "@" + lastName;
        System.out.println(fullName.length());
        // charAt
        for (int i = 0; i < fullName.length(); i++) {
            System.out.println(fullName.charAt(i));
        }
        // System.out.println();
        String sentence = "rituraj";
        String chomu = sentence.substring(3);
        System.out.println(chomu);
    }
}
