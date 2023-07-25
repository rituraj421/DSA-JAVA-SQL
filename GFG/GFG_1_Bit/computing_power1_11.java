package GFG_1_Bit;

public class computing_power1_11 {
    static int compute(int a, int b){
        int res = 1;
        for(int i = 1; i<=b; i++){
            res = res*a;
        }
        return res;
    }
    public static void main(String[] args) {
        System.out.println(compute(2, 3));
    }
}
