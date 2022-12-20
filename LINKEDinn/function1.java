package LINKEDinn;

public class function1 {

    public static double sallaryCalc(double hoursWeek, double amountHour) {
        if (hoursWeek < 0) {
            // System.out.println("incorrect value");
            if (amountHour <= 0) {
                // System.out.println("Incorrect");
                return -1;
            }
        }
        double payCheck = amountHour * hoursWeek;
        return payCheck * 1;
        // System.out.println();
    }

    public static void main(String[] args) {
        // double result = Math.pow(2,5);
        double salary = sallaryCalc(-40, -100);
        System.out.println(salary);
    }
}
