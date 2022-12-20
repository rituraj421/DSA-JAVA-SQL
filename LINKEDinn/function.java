package LINKEDinn;

public class function {

    //function to calculate the meal price 
    //remove double and add void and then try 
    public static double calculateMealPrice(double listedMealPrice,
    double tipRate,
    double taxRate
    )
    {
        double tip = tipRate * listedMealPrice;
        double tax = taxRate * listedMealPrice;
        double result = listedMealPrice + tip + tax;
        System.out.println("Your toasl meal price is $" + result);
        return result;
    }
    public static void main(String[] args) {
        calculateMealPrice(15, .2, 0.18);
        calculateMealPrice(155, .2, 0.18);

        // double totalMeal = calculateMealPrice(155, .2, 0.18);
        // double individualMeal = totalMeal/5;
        // System.out.println(individualMeal);
    }
}
