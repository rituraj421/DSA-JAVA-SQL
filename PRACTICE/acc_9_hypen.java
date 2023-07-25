package PRACTICE;

public class acc_9_hypen {
    static String moveHypen(String str) {
        String str1 = "";
        String str2 = "";
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == '_') {
                str1 += str.charAt(i);
            }
            if (str.charAt(i) != '_') {
                str2 += str.charAt(i);
            }
        }
        return str1 + str2;
    }

    public static void main(String[] args) {
        // we r given a string 'str'which contains hypen we need to move all of them to
        // start
        String str = "bahs_hdhd__";
        System.out.println(moveHypen(str));
    }
}
