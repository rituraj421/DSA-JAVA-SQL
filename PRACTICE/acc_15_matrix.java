package PRACTICE;

import java.util.ArrayList;
import java.util.Collections;

public class acc_15_matrix {
    static void arr(int[] arr) {
        ArrayList<Integer> even = new ArrayList<>();
        ArrayList<Integer> odd = new ArrayList<>();
        for (int i = 0; i <= arr.length - 1; i++) {
            if (i % 2 == 0) {
                even.add(arr[i]);
            } 
            else if (i % 2 == 1) {
                odd.add(arr[i]);
            }
        }
        Collections.sort(even);
        Collections.sort(odd);
        int e = even.get(even.size()-2);
        int o = odd.get(odd.size()-2);

        System.out.println(o+e);
    }

    public static void main(String[] args) {
        int[] arr = { 3, 4, 1, 7, 9 };
        arr(arr);
    }
}
