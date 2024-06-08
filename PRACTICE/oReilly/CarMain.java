package PRACTICE.oReilly;

public class CarMain {
    public static void main(String[] args) {
        car myCar = new car(25, "1BC32E", true);
        System.out.println(myCar.avgMPG);
        myCar.showDetails();

        //for the class string
        string myString = new string();
        System.out.println(myString);

        // working with strings
        String str = "Hello";
        String str1 = str.replace('H', 'o');
        System.out.println(str1);

        // dog class
        ch1 myDog = new ch1();
        myDog.bark();
    }
}
