package PRACTICE.TCS.STRING;

// import java.util.HashMap;
// import java.util.Map;

public class s_2_countAlphabet {
    static int countAlphabet(String str) {
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            if (((str.charAt(i) >= 'a') && (str.charAt(i) <= 'z'))
                    || ((str.charAt(i) >= 'A') && (str.charAt(i) <= 'Z'))) {
                count++;
            }
        }
        return count;
    }

    // method 2;
    static int countAlphabet1(String str) {
        int count = 0;
        char ch[] = str.toCharArray();
        for (int i = 0; i < ch.length; i++) {
            if (Character.isLetter(ch[i])) {
                count++;
            }
        }
        return count;
    }

    // method 3
    static int countAlphabet2(String str) {
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            if (Character.isAlphabetic(str.charAt(i)))
                count++;
        }
        return count;
    }

    public static void main(String[] args) {
        String str = "n0ji#k$";

        System.out.println("Method 1");
        System.out.println(countAlphabet(str));

        System.out.println("Method 2");
        System.out.println(countAlphabet1(str));

        System.out.println("Method 3");
        System.out.println(countAlphabet2(str));
    }
}
