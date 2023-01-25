package BASICS;

public class finallly {
    public static void main(String[] args) {
        try {
            int a = 5;
            int b = 0;
            int c = a / b;
            System.out.println(c);

        } catch (Exception e) {
            System.out.println(e);

        } finally {
            System.out.println("Here is the end ");
        }
    }
}