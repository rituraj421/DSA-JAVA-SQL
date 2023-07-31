package PRACTICE.TCS;

public class tcs_2_string {
    static int validString(String str) {
        int count1 = 0;
        int count2 = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == '*') {
                count1++;
            }
            if (str.charAt(i) == '#') {
                count2++;
            }
        }
        if (count1 > count2) {
            return 1;
        } 
        else if (count2 > count1) {
            return -1;
        } else {
            return 0;
        }
    }

    public static void main(String[] args) {
        String str = "###****";
        System.out.println(validString(str));
    }
}
