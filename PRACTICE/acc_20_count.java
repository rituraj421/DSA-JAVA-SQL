package PRACTICE;

import java.util.HashSet;
import java.util.Set;

public class acc_20_count {
    static int unqCount(String str) {
        Set<Character> unique = new HashSet<>();

        for (char c : str.toCharArray()) {
            unique.add(c);
        }
        return unique.size();
    }

    public static void main(String[] args) {
        String str = "10120000";
        System.out.println(unqCount(str));
    }
}
