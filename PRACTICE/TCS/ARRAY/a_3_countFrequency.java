package PRACTICE.TCS.ARRAY;

import java.util.HashMap;
import java.util.Map;

public class a_3_countFrequency {
    static void countFrequency(int[] arr, int p) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            map.put(arr[i], map.getOrDefault(arr[i], 0) + 1);
        }
        System.out.println("Number\tFrequency");
        for (int i = 0; i <= p; i++) {
            int frequency = map.getOrDefault(i, 0);
            System.out.println(i + "\t" + frequency);
        }
    }

    public static void main(String[] args) {
        int arr[] = { 2, 3, 2, 3, 5 };
        countFrequency(arr, 5);
    }
}
