package BASICS;

public class varArg {

    // static int sum(int a, int b){
    //     return a+b;
    // }

    static int sum(int ...arr){
        int result = 0;
        for(int a: arr){
            result += a;
        }
        return result;
    }
    public static void main(String[] args) {
        System.out.println("The sum of 4 , 5 , 6 , 7, and 8 is: " + sum(4,5, 6, 7,8));
    }
}