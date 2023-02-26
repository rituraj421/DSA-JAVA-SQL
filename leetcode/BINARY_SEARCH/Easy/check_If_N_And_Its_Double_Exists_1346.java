package leetcode.BINARY_SEARCH.Easy;

import java.util.Arrays;

public class check_If_N_And_Its_Double_Exists_1346 {
    static boolean checkIfExist(int[] arr) {
        Arrays.sort(arr);
        int slow = 0;
        int fast = 1;

        while (fast < arr.length ) {
            if (arr[slow] == 0 && arr[fast]== 0) {
            return true;
        }
            if (arr[slow] == 2 * arr[fast] || arr[fast] == 2 * arr[slow]) {
                return true;
            }
            if (arr[fast] > 2 * arr[slow]) {
                slow++;
            } else {
                fast++;
            }
            if (slow == fast) {
                fast++;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        // int[] arr = { 3, 1, 7, 11 };
        int[] arr = {-2,0,10,-19,4,6,-8};
        // int [] arr = {-766,259,203,601,896,-226,-844,168,126,-542,159,-833,950,-454,-253,824,-395,155,94,894,-766,-63,836,-433,-780,611,-907,695,-395,-975,256,373,-971,-813,-154,-765,691,812,617,-919,-616,-510,608,201,-138,-669,-764,-77,-658,394,-506,-675,523};
        System.out.println(checkIfExist(arr));
        
    }
}
