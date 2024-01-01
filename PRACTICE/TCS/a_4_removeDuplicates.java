package PRACTICE.TCS;

import java.util.ArrayList;

public class a_4_removeDuplicates {
    static void removeDuplicates(int[] arr) {
        int count = 1;
        ArrayList<Integer> ans = new ArrayList<>();
        ans.add(arr[0]);
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] == arr[i - 1]) {
                continue;
            } else {
                ans.add(arr[i]);
                count++;
            }
        }
        System.out.println(ans);
        System.out.println(count);
    }

    public static void main(String[] args) {
        int[] arr = { 2, 2, 2, 2,3,3,5 };
        removeDuplicates(arr);
    }
}
