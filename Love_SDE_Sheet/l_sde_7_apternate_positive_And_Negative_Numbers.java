package Love_SDE_Sheet;

import java.util.ArrayList;

public class l_sde_7_apternate_positive_And_Negative_Numbers {
    static void alternate(int[] arr) {
        ArrayList<Integer> pos = new ArrayList<>();
        ArrayList<Integer> neg = new ArrayList<>();
        ArrayList<Integer> ans = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < 0) {
                neg.add(arr[i]);
            } else {
                pos.add(arr[i]);
            }
        }

        int posIndex = 0;
        int negIndex = 0;
        for (int i = 0; i < arr.length; i++) {
            if (i % 2 == 0 && posIndex < pos.size()) {
                ans.add(pos.get(posIndex));
                posIndex++;
            } 
            else if (i % 2 != 0 && negIndex < neg.size()) {
                ans.add(neg.get(negIndex));
                negIndex++;
            }
        }
        for (int i : ans) {
            System.out.print(i + " ");
        }
    }

    public static void main(String[] args) {
        int[] arr = { 9, 4, -2, -1, 5, 0, -5, -3, 2 };
        alternate(arr);
    }
}
