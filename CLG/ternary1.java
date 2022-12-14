package CLG;

public class ternary1 {
    public static void main(String[] args) {

        // FOR COMPARING 2 NUMBERS
        int a = 10, b = 2, Min;
        Min = (a < b) ? a : b;
        System.out.println("The minimum is " + Min);
        System.out.println(Min = (a < b) ? a : b);

        // FOR COMPARING 3 NUMBERS
        int x = 10, y = 20, z = 30, Max;
        Max = (x > y) ? (x > z ? x : z) : (y > z ? y : z);
        System.out.println("The greatest number is " + Max);
    }
}
