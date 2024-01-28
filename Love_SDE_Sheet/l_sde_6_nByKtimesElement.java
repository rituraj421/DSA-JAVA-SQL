package Love_SDE_Sheet;

import java.util.HashMap;
import java.util.Map;

public class l_sde_6_nByKtimesElement {
    static int nkTime(int[] arr, int k) {
        Map<Integer, Integer> map = new HashMap<>();
        int n = arr.length;
        int limit = n / k;
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (map.containsKey(arr[i])) {
                map.put(arr[i], map.get(arr[i]) + 1);
            } else {
                map.put(arr[i], 1);
            }
            if (map.get(arr[i]) > limit && arr[i] < limit + 2) {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        int[] arr = { 3, 1, 2, 2, 1, 2, 3, 3 };
        System.out.println(nkTime(arr, 4));
    }
}
