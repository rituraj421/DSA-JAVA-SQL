package PRACTICE;

public class acc_11_replace {
    static String replace(String str, char ch1, char ch2) {
        char[] charr = str.toCharArray();
        for (int i = 0; i < str.length(); i++) {
            if (charr[i] == (ch1)) {
                charr[i] = (ch2);
            } 
            else if (charr[i] == (ch2)) {
                charr[i] = (ch1);
            }
        }
        return new String(charr);
    }

    static String replace1(String str, char ch1, char ch2) {
        String ans = "";
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == ch1) {
                ans = ans + ch2;
            } 
            else if (str.charAt(i) == ch2) {
                ans += ch1;
            }
            else{
                ans+= str.charAt(i);
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        // we r givena string str and characters ch1 and ch2 replcase all the characters
        // and return the string
        String str = "apple";
        char ch1 = 'a';
        char ch2 = 'p';
        System.out.println(replace(str, ch1, ch2));
        System.out.println(replace1(str, ch1, ch2));
    }
}
