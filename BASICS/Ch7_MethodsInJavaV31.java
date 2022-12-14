package BASICS;

public class Ch7_MethodsInJavaV31 {
    static int logic(int x, int y){
        int z;
        if (x<y){
            z = x+y;
        }
        else{
            z = (x+y)*11;
        }
        return z;
    }
    public static void main(String[] args) {

        int a = 5;
        int b = 7;
        int c;
        c = logic (a, b);
        int a1 = 2;
        int b1 = 1;
        int c1;
        c1 = logic (a1, b1);

        System.out.println("The value of c is :- ");

        System.out.println( c );

        System.out.println("The value of c1 is :- ");

        System.out.println( c1 );
    }
}
