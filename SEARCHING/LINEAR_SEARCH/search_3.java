package SEARCHING.LINEAR_SEARCH;

public class search_3 {

    static boolean search(String str, char target) {
        if (str.length() == 0) {
            return false;
        }
        for (int i = 0; i < str.length(); i++) {
            if (target == str.charAt(i)) {
                return true;
            }
        }
        return false;
    }

    // using for Each loop
    static boolean search2(String str, char target) {
        if (str.length() == 0) {
            return false;
        }
        for (char ch : str.toCharArray()) {
            if (ch == target) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {

        String name = "rituraj";
        char target = 'u';
        System.out.println(search(name, target));
        System.out.println(search2(name, target));
    }
}
