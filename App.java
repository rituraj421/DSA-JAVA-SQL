import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Scanner;

public class App {

    // factorial practice
    static int fact(int n) {
        int fac = 1;
        int count = 0;
        if (n == 0 || n == 1) {
            return 1;
        } else {
            fac = n * fact(n - 1);
        }
        while (fac != 0) {
            fac = fac / 10;
            count++;
        }
        return count;
    }

    static int count(int f) {
        int count = 0;
        while (f != 0) {
            f = f / 10;
            count++;
        }
        return count;
    }
    // write a java method to print multiplication table
    // static int table(int n){
    // for(int i = 1; i<=n; i++){

    // }

    // }

    // static int abs(int a){
    // if(a < 0){
    // return a*-1;
    // }
    // else{
    // return a;
    // }
    // }

    // celcius to f
    // static int cel(int n){
    // return (n * 9/5) + 32;

    // }

    static int factorialDigits(int n) {
        BigInteger factorial = BigInteger.ONE;
        for (int i = 2; i <= n; i++) {
            factorial = factorial.multiply(BigInteger.valueOf(i));
        }

        String factorialString = factorial.toString();
        return factorialString.length();
    }

    static boolean power(int n) {
        for (int i = 1; i <= n; i++) {
            if (i * i == n) {
                return true;
            }
        }
        return false;
    }

    static int oddOccurence(int[] n) {
        int res = n[0];
        for (int i = 1; i < n.length; i++) {
            res ^= n[i];
        }
        return res;
    }

    static int xor(int a) {
        return a & (a - 1);
    }

    // prepinsta accenture coding reminder practice
    // problem 1 , rats
    static void ratFood(int[] arr, int r, int cap) {
        int foodRequired = r * cap; // it is the total food rat , i.e
        int sum = 0;
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
            count++;
            if (sum >= foodRequired) {
                break;
            }
        }
        System.out.println(count);
    }

    // problem 2
    static void binary(String str) {
        int res = str.charAt(0) - '0';
        for (int i = 1; i < str.length();) {
            char prev = str.charAt(i);
            i++;
            if (prev == 'A') {
                res = res & (str.charAt(i) - '0');
            }
            if (prev == 'B') {
                res = res | (str.charAt(i) - '0');
            }
            if (prev == 'C') {
                res = res ^ (str.charAt(i) - '0');
            }
            i++;
        }
        System.out.println(res);
    }

    // problem 3, absolute difference
    static void absDiff(int[] arr, int num, int diff) {
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (Math.abs(num - arr[i]) <= diff) {
                count++;
            }
        }
        System.out.println(count);
    }

    // upper to lower and lower to upper
    static void upprLower(String s) {
        StringBuilder sb = new StringBuilder();
        String[] words = s.split(" ");

        for (String word : words) {
            char[] chars = word.toCharArray();

            for (int i = 0; i < chars.length; i++) {
                if (Character.isLowerCase(chars[i])) {
                    chars[i] = Character.toUpperCase(chars[i]);
                } else if (Character.isUpperCase(chars[i])) {
                    chars[i] = Character.toLowerCase(chars[i]);
                }
                // sb.append(chars[i]);
            }

            sb.append(new String(chars)).append(" ");
        }
        String result = sb.toString();
        String[] wor = result.split(" ");
        for (String ss : wor) {
            System.out.println(ss);
        }
    }

    // summ
    static void sec(int[] arr) {
        ArrayList<Integer> even = new ArrayList<>();
        ArrayList<Integer> odd = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            if (i % 2 == 0) {
                even.add(arr[i]);
            }
            if (i % 2 != 0) {
                odd.add(arr[i]);
            }
        }
        Collections.sort(even);
        Collections.sort(odd);
        int sum = even.get(even.size() - 2) + odd.get(1);
        System.out.println(even);
        System.out.println(odd);
        System.out.println(sum);
    }

    // decto Nbase
    static void dec(String s) {
        String sb = "";
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '-') {
                sb = s.charAt(i) + sb;
            }
            if (s.charAt(i) != '-') {
                sb = sb + s.charAt(i);
            }
        }
        System.out.println(sb);
    }

    // we r given a string , we need to print all the missing letters
    static void missing(String str) {
        HashSet<Character> availChar = new HashSet<>();
        StringBuilder notAvailChar = new StringBuilder();

        for (int i = 0; i < str.length(); i++) {
            availChar.add(str.charAt(i));
        }

        // code for missing letters
        for (char c = 'a'; c <= 'z'; c++) {
            if (!availChar.contains(c)) {
                notAvailChar.append(c);
            }
        }
        System.out.println(availChar);
        System.out.println(notAvailChar.toString());
    }
// max sum sub array;
    static int maxSum(int[] arr, int k) {
        int ans = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length - k; i++) {
            int sum = 0;
            for (int j = i; j < i + k; j++) {
                sum += arr[j];
            }
            ans = Math.max(ans, sum);
        }
        return ans;
    }

    // max product
    static long maxProduct(int[] ar1, int n){
        long ans = Integer.MIN_VALUE;
        for(int i = 0; i<ar1.length-n; i++){
            long product = 1;
            for(int j = i; j<i+n; j++){
                product *= ar1[j];
            }
            ans = Math.max(ans, product);
        }
        return ans;
    }

    public static void main(String[] args) throws Exception {
        // System.out.println("Hello, World!");
        // System.out.println(fact(5));
        // System.out.println(abs(-32));
        // System.out.println(cel(34));
        // System.out.println(count(120));
        // System.out.println(factorialDigits(5));
        // System.out.println(power(6));
        // int[] n = {9,12,2,11,2,2,10,9,12,10,9,11,2};
        // System.out.println(oddOccurence(n));
        // System.out.println(xor(5));
        // int a = 10;
        // System.out.println(a++++); // it will throw cimpilation error

        // problem 1;
        Scanner sc = new Scanner(System.in);

        // int n = sc.nextInt();
        // int[]arr = new int[n];
        // for(int i = 0; i<n; i++){
        // arr[i] = sc.nextInt();
        // }
        // int[] arr = {2, 8, 3, 5, 7, 4, 1, 2};
        // ratFood(arr, 7, 2);

        // String str = "1C0C1C1A0B1";
        // binary(str);

        // int[] arr = {12, 3, 14, 56, 77, 13};
        // absDiff(arr, 13, 2);

        // int n = 100;
        // for(int i = 0; i<=n; i/7){
        // System.out.println(i);
        // }
        // String s = "HelloL Rahul";
        // upprLower(s);

        // int[] arr = {3, 2 ,1 ,7, 5 ,4};
        // sec(arr);

        // String s = "Move-Hyphens-to-Front";
        // dec(s);

        // String str = "your input string";
        // missing(str);
        sc.close();

        // max sum subrray
        // int[] arr = { 1, 8, 30, -5, 20, 7 };
        // System.out.println(maxSum(arr, 3));

        int[] ar1 = {6 ,-3 ,-10, 0 ,2};
        System.out.println(maxProduct(ar1, 5));
    }
}
