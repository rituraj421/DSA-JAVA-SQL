package BASICS;

public class methodOverloadingInJava {

    // TWO OR MORE METHODS CAN HAVE SAME NAME BUT CAN PERFORM DIFFERENT TASKS we
    // just need to change the parameters
    static void tellJoke() {
        System.out.println("It's a joke");
    }

    static void change(int[] arr) {
        arr[0] = 98;
    }

    static void f00() {
        System.out.println("Good morning bhai!!");
    }

    static void f00(int a) {
        System.out.println("Good morning " + a + " bro");
    }

    static void f00(int a, int b) {
        System.out.println("Hii " + a + " Bye " + b);
    }

    public static void main(String[] args) {
        tellJoke();

        int[] marks = { 33, 24, 56, 58 };
        int[] mark = { 21, 34, 44 };
        change(marks);
        change(mark);
        System.out.println(marks[0]);
        System.out.println(mark[0]);

        f00();
        f00(40);
        f00(40, 50);
    }
}