package PRACTICE.TCS;

public class tcs_1_newString {
    static String newString(String A, String B) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < A.length(); i++) {
            char currentChar = A.charAt(i);
            if (B.indexOf(currentChar) == -1) {
                sb.append(currentChar);
            }
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        // derieve a new string
        String A = "tigera";
        String B = " gti";
        System.out.println(newString(A, B));
    }
}
