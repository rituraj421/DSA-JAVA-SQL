package leetcode.STRING.EASY;

public class indexOfFirstOccurence {
    static int firstIndex(String haystack, String needle) {
        // use the sliding window approach
        int needleindex = 0;
        for (int i = 0; i < haystack.length(); i++) {
            if (haystack.charAt(i) == needle.charAt(needleindex)) {
                needleindex++;
            } 
            else {
                // reset both needle index and haystack index
                i = i - needleindex;
                needleindex = 0;
            }
            if (needleindex == needle.length()) {
                return i - needle.length() + 1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        String haystack = "sadbutsad";
        String needle = "sad";
        System.out.println(firstIndex(haystack, needle));
    }
}
