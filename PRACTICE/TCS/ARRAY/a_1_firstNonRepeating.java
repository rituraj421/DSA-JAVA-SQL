package PRACTICE.TCS.ARRAY;

import java.util.HashMap;
import java.util.Map;

public class a_1_firstNonRepeating {
    static void firstNonRepeating(int[] arr) {
        Map<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < arr.length; i++) {
            map.put(arr[i], map.getOrDefault(arr[i], 0) + 1);
        }

        // print the numbers and their frequencies
        System.out.println("Number\tFrequency");
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            System.out.println(entry.getKey() + "\t" + entry.getValue());
        }

        // now print the first non repeating element
        System.out.println("First Non repeating element");
        for (int i = 0; i < arr.length; i++) {
            if (map.get(arr[i]) == 1) {
                System.out.println(arr[i]);
            }
        }

    }

    public static void main(String[] args) {
        int[] arr = { -1, 2, -1, 3, 2 };
        firstNonRepeating(arr);

    }
}
