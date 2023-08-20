package GFG_4_STRINGS;

import java.util.Arrays;

public class str_5_maxChar {
    static final int Ch = 256;
    static void maxFre(String str){
        char[] count = new char[Ch];
        char[] str0 = str.toCharArray();
        Arrays.sort(str0);

        for(int i = 0; i<str.length(); i++){
            count[str.charAt(i)]++;
        }

        int max = 0;
        for(int i = 0; i<str0.length; i++){
            if(count[str0[i]] >max){
                max = i;
            }
        }
        System.out.println(max);

    }
    public static void main(String[] args) {
        String str = "bacbbbb";
        maxFre(str);
    }
}
