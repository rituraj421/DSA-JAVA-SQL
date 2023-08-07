package PRACTICE.TCS;

public class tcs_17_twist4 {
    static void twist4(String str1, String str2, String str3) {
        // char[] vowels = { 'a', 'e', 'i', 'o', 'u' };
        char[] strr = str1.toCharArray();
        char[] strrr = str2.toCharArray();
        for (int i = 0; i < strr.length; i++) {
            if (strr[i] == ('a') || strr[i] == ('e') || strr[i] == ('i') || strr[i] == ('o')
                    || strr[i] == ('u')) {
                strr[i] = '%';
            }
        }
        for (int i = 0; i < strrr.length; i++) {
            if (strrr[i] == ('a') || strrr[i] == ('e') || strrr[i] == ('i') || strrr[i] == ('o')
                    || strrr[i] == ('u')) {
                strrr[i] = strrr[i];
            } else {
                strrr[i] = '#';
            }
        }
        str3 = str3.toUpperCase();
        String str11 = new String(strr);
        String str22 = new String(strrr);
        System.out.println(strr);
        System.out.println(strrr);
        System.out.println(str11 + str22 + str3);
    }

    public static void main(String[] args) {
        String str1 = "abderoura";
        String str2 = "abchfhcchghfejdndcu";
        String str3 = "jdfgdfgdkfgv";
        twist4(str1, str2, str3);
    }
}
