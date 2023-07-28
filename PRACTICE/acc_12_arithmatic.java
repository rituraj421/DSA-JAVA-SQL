package PRACTICE;

public class acc_12_arithmatic {
    static int arith(int a, int b, int c){
        if(c == 1){
            return a+b;
        }
        if(c == 2){
            return a-b;
        }
        if(c == 3){
            return a*b;
        }
        if(c == 4){
            return a/b;
        }
        else{
            return 0;
        }
    }
    public static void main(String[] args) {
        System.out.println(arith(12, 16, 1));
    }
}
