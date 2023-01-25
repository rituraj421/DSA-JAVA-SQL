package BASICS;

// import java.util.Scanner;

class myException extends Exception {
    public String toString() {
        return "I am toString()";
    }

    public String getMessage() {
        return "I am get message()";
    }
}

public class exception {
    public static void main(String[] args) {
        int a = 5;
        // Scanner sc = new Scanner(System.in);
        // a = sc.nextInt();
        if (a < 99) {
            try {

                throw new myException();
            } catch (Exception e) {
                System.out.println(e.getMessage());
                System.out.println(e.toString());
                System.out.println(e);
                e.printStackTrace();
            }
        }

    }
}