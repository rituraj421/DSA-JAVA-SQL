package GFG_1_Bit;

public class factorial1_3 {
    static int fact(int n){
        if(n == 1 || n == 0){
            return 1;
        }
        int factorial = 1;
        for(int i = n; i>=1; i--){
            factorial = factorial *i;
        }
        return factorial;
    }
    public static void main(String[] args) {
        System.out.println(fact(5));
    }
}
