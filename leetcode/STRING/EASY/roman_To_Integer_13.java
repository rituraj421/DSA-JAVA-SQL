package leetcode.STRING.EASY;

public class roman_To_Integer_13 {
    class Solution {
        public int romanToInt(String s) {
            int result = 0;
            int previous = 0;
            for (int i = s.length() - 1; i >= 0; i--) {
                char c = s.charAt(i);
                int current = 0;
                switch (c) {
                    case 'I':
                        current = 1;
                        break;
                    case 'V':
                        current = 5;
                        break;
                    case 'X':
                        current = 10;
                        break;
                    case 'L':
                        current = 50;
                        break;
                    case 'C':
                        current = 100;
                        break;
                    case 'D':
                        current = 500;
                        break;
                    case 'M':
                        current = 1000;
                        break;
                }
                if (current < previous) {
                    result -= current;
                } else {
                    result += current;
                }
                previous = current;
            }
            return result;
        }
    }
}