package PRACTICE;

public class acc_16_tableSum {
    static void tableSum(int n) {
        int sum = 0;
        int table = n;
        for (int i = 1; i <= 10;) {
            System.out.print((n * i) + " ");
            table = n * i;
            sum += (table);
            i++;
        }
        System.out.println();
        System.out.println(sum);

    }

    public static void main(String[] args) {
        // System.out.println(tableSum(5));
        tableSum(5);
    }
}
