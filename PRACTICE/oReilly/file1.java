package PRACTICE.oReilly;

public class file1 {
    public static void main(String[] args) {
        // data types/conversion
        // float myFloat = 3.14; will throw an error "type mismatch (will not compile)"
        double myDouble = 3.14f; // will work perfectly
        // float myFloat = myDouble; // not acceptable, may cause data lose
        System.out.println(myDouble);
        System.out.println(4%3);

        int a = 10;
        int b = 4;
        float result = a+b;
        System.out.println(result);

        int x = 0;
        double y = 20;
        double ans = y/x;
        System.out.println(ans);

    }
}
