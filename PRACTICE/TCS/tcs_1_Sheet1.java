package PRACTICE.TCS;

import java.util.ArrayList;

public class tcs_1_Sheet1 {
    static boolean perfect(int num) {
        if (num == 1) {
            return true;
        }
        for (int i = 0; i < num; i++) {
            if (i * i == num) {
                return true;
            }
        }
        return false;
    }

    // step 1
    static int digit(int n) {
        int temp = 0;
        while (n != 0) {
            temp += n % 10;
            n = n / 10;
        }
        return temp;
    }

    // step 2
    static int digit1(int n) {
        while (n > 9) {
            n = digit(n);
        }
        return n;
    }

    // Given an integer as input and replace all the ‘0’ with ‘5’ in the integer.
    static void replace5(int n) {
        ArrayList<Integer> list = new ArrayList<>();
        while (n != 0) {
            list.add(n % 10);
            n = n / 10;
        }
        System.out.println(list);
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) == 0) {
                list.set(i, 5);
            }
        }
        System.out.println(list);
    }

    public static void main(String[] args) {
        // int num = 100000001;
        // System.out.println(perfect(num));
        // System.out.println(Math.pow(2, 31)/2);
        // System.out.println(digit1(38));
        replace5(1020302);
    }
}
