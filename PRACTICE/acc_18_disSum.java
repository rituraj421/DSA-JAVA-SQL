package PRACTICE;

public class acc_18_disSum {
    static int sumDis(int x1, int x2, int y1, int y2) {
        float diff1 = (float) Math.sqrt((Math.pow(x2 - x1, 2)) + (Math.pow(y2 - y1, 2)));
        return (int) diff1;
    }

    public static void main(String[] args) {
        System.out.println(sumDis(1, 2, 1, 4));
    }
}
