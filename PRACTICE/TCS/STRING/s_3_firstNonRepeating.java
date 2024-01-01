package PRACTICE.TCS.STRING;

import java.util.HashMap;
import java.util.Map;

public class s_3_firstNonRepeating {
    static char firstNonRepeatingChar(String str) {
        char ans = 0;
        Map<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < str.length(); i++) {
            map.put(str.charAt(i), map.getOrDefault(str.charAt(i), 0) + 1);
        }
        for (int i = 0; i < str.length(); i++) {
            if (map.get(str.charAt(i)) == 1) {
                ans += str.charAt(i);
                return ans;
            }
        }
        return '$';
    }

    public static void main(String[] args) {
        String str = "hello";
        System.out.println(firstNonRepeatingChar(str));

    }
}
