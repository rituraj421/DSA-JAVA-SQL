package Love_SDE_Sheet;

import java.util.ArrayList;

public class mediaNet {
    static int repeatedNumber(int[] A) {
        int slow = 0;
        int fast = 0;

        while (true) {
            slow = A[slow];
            fast = A[A[fast]];

            if (slow == fast) {
                break;

            }
        }

        slow = 0;
        while (slow != fast) {
            slow = A[slow];
            fast = A[fast];
        }
        return slow;
    }

    static int largestSum(int[] arr) {
        int currSum = 0;
        int maxSum = Integer.MIN_VALUE;

        for (int i = 0; i < arr.length; i++) {
            currSum = Math.max(arr[i], currSum + arr[i]);
            maxSum = Math.max(maxSum, currSum);
        }

        return maxSum;
    }

    // interview question
    static void evenOdd(int[] arr) {
        ArrayList<Integer> ans = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0) {
                ans.add(arr[i]);
            }
        }
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 != 0) {
                ans.add(arr[i]);
            }
        }
        // for (int i = 0; i < ans.size(); i++) {
        //     System.out.println(ans[i] + " ");
        // }
        System.out.println(ans);
    }

    public static void main(String[] args) {
        int[] A = { 1, 1, 2, 3, 4, 5, 8, 8 };
        System.out.println(repeatedNumber(A));

        System.out.println("max sum problem");
        // int[] arr = { -1, 4, 5, 2 };
        // System.out.println(largestSum(arr));

        System.out.println("problem 3");
        int[] arr = { 1, 1, 2, 3, 4, 5, 8, 8 };
        evenOdd(arr);
    }
}
