package MATH;

public class factors_Of_A_Number {

    static void factor(int n){
        for(int i = 1; i<=n; i++){
            if(n % i == 0){
                System.out.print(i + " ");
            }
        }
    }
    public static void main(String[] args) {
        factor(20);
    }
}
