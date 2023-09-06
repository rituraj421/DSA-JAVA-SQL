package PRACTICE;

public class sheet_1_100_Most {
    // Q1 (swap two numbers using third variable)
    static void swap(int x, int y) {
        System.out.println("Before swapping \nx = " + x + "\ny = " + y);
        int temp = x;
        x = y;
        y = temp;
        System.out.println("After swapping \nx = " + x + "\ny = " + y);
    }

    // swap two numbers without using third variable
    static void swapVar(int x, int y) {
        System.out.println("Before swapping \nx = " + x + " \ny = " + y);
        x = x+y;
        y = x-y;
        x = x-y;
        System.out.println("After swapping \nx = " + x + " \ny = " + y);
    }

    public static void main(String[] args) {
        // swap(4, 5);
        swapVar(4, 5);
    }
}
