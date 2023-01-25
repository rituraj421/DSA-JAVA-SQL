package STRING;

import java.util.Arrays;

public class string_Builder {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < 26; i++) {
            char ch = (char) ('a' + i);
            sb.append(ch);
            // System.out.println(Arrays.toString(sb.toCharArray()));
            // sb.setCharAt(3, 'b');
            
            sb.reverse();
        }
        System.out.println(sb);

        String name = "rituraj roj";
        // name.reverse();
        System.out.println(Arrays.toString(name.toCharArray()));
        
        name.contentEquals("hey");
        System.out.println(name);
    }
}