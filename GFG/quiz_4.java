package GFG;

public class quiz_4 {
    static int power(int a, int b, int c){
        int x = (int) Math.pow(a, b);
        int y = x%c;
        return y;
    }

    static int multiple(int n){
        int count = 0;
        for(int i = -6; i<= 35; i++){
            if(i%n == 0){
                count++;
            }
        }
        return count;
    }
    public static void main(String[] args) {
        // System.out.println(power(7, 100, 5));
        System.out.println(multiple(6));
    }
}
