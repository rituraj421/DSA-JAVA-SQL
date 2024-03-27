package Love_SDE_Sheet;

import java.util.ArrayList;

public class l_sde_11_arrange_negative_positive {
    static void Rearrange(int a[]) {
        // Your code goes here
        ArrayList<Integer> ans = new ArrayList<>();
        for (int i = 0; i < a.length; i++) {
            if (a[i] < 0) {
                ans.add(a[i]);
            }
        }
        for (int i = 0; i < a.length; i++) {
            if (a[i] >= 0) {
                ans.add(a[i]);
            }
        }
        for (int i = 0; i < a.length; i++) {
            a[i] = ans.get(i);
        }
    }

    public static void main(String[] args) {
        int[] a = { -3, 3, -2, 2 };
        Rearrange(a);
    }
}
