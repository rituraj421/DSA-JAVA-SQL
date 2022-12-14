package CLG;
import java.util.Scanner;
public class function {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter Radius");
            double r = sc.nextDouble();
            // DESIGN A CLASS TO OVERLOAD A FUNCTION AS:
            // 1)DOUBLE VOLUME WITH RADIUAS R AS AN ARGUMENT, RETURNS THE VOLUME OF SPHERE
            // V = 4/3*22/7*R^3
            System.out.println(volume(r));
        }
    }

    // OverloadFunction
    static double volume(double R) {
        double r =  Math.pow(R,3);
        double volume = (4 / 3) * (22 / 7) * r;

        return (volume);

    }

}