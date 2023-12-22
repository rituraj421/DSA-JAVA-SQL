package PRACTICE.TCS;

import java.util.HashMap;

public class tcs_19_HashMap {
    public static void main(String[] args) {
        HashMap<String, Integer> map = new HashMap<>();

        map.put("ritu", 1);
        map.put("raj", 2);
        map.put("choudhary", 0);

        System.out.println(map.values());
        System.out.println(map.get("ritu"));
    }
}
