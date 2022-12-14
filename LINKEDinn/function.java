package LINKEDinn;

public class function {

    //function to calculate the meal price 
    public static void calculateMealPrice(double listedMealPrice,
    double tipRate,
    double taxRate
    )
    {
        double tip = tipRate * listedMealPrice;
        double tax = taxRate * listedMealPrice;
        double result = listedMealPrice + tip + tax;
        System.out.println("Your toasl meal price is " + result);
    }
    public static void main(String[] args) {
        calculateMealPrice(15, .2, 0.18);
    }
}
