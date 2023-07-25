package GFG_1_Bit;

public class sumOfNaturalNumberts {
    //approach 1
    static int natural(int n) {
        int sum = 0;
        for (int i = 0; i <= n; i++) {
            sum += i;
        }
        return sum;
    }

    // approach 2 // we have also done method overloading 
    static int natural(){
        int n = 5;
        int sum = n *(n+1)/2;
        return sum;
    }
    public static void main(String[] args) {
        // java program to find sum of natural numbers
        System.out.println(natural(5));
        System.out.println(natural());
    }

}
