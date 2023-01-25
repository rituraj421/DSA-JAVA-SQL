package BASICS;

public class tryCatch {
    public static void main(String[] args) {
        int a = 600;
        int b = 10; // if we replace b with zero it will throw arithmatic exception
        try {

            int c = a / b;
            System.out.println("The result is " + c);
        } catch (Exception e) {
            System.out.println("We failed to divide. Reason: " + e + " cannot divide");
        }

        // nested try-catch
        int[] marks = new int[3];
        marks[0] = 7;
        marks[1] = 56;
        marks[2] = 6;

        try {
            System.out.println("Welcome to tryCatch");
            try {
                System.out.println(marks[9]);
            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("Sorry this index does not match");
                System.out.println("Exception level 2");
            }
        } catch (Exception e) {
            System.out.println("Exception in level 1");
        }
    }
}