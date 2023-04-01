package leetcode.MATH.EASY;

public class convert_The_Temperature_2469 {
    static double[] convertTemperature(double celsius) {
        double kelvin = celsius + 273.15;
        double fahrenheit = celsius * 1.8 + 32;
        return new double[] { kelvin, fahrenheit };
    }

    public static void main(String[] args) {
        double celsius = 36.50;
        System.out.println(convertTemperature(celsius));
    }
}
