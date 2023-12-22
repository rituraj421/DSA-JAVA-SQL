package GFG_01_Beginers_SDE_SHEET;

class pair{
    long min;
    long max;

    pair(long min, long  max){
        this.min = min;
        this.max = max;
    }
}

public class gfg_1_findMaxAndMinElement {
    static void minMax(int[] a) {
        int min = a[0];
        int max = a[0];
        for (int i = 0; i < a.length; i++) {
            if (a[i] < min) {
                min = a[i];
            }
            if (a[i] > max) {
                max = a[i];
            }
        }
        System.out.println(min + " " + max);
    }

    public static void main(String[] args) {
        // we need to find minimum and maximum elements
        int[] a = { 1, 4, 5, 2, 3, 2 };
        minMax(a);
    }
}
