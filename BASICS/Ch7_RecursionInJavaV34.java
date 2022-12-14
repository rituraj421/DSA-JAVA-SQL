package BASICS;

public class Ch7_RecursionInJavaV34 {
    static int factorial(int n){
        if(n==1 || n==0){
            return 1;
        }
        else{
            return n* factorial(n-1);
        }
    }
    public static void main(String[] args) {
        int n = 5;
        System.out.println("The value of factorial n is:" + factorial(n));

    }
}

