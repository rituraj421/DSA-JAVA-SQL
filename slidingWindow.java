public class slidingWindow {

    // maximum sum of sub Arrayusing sliding window technique
    static int maxSumSlide(int[] arr, int k) {
        int currSum = 0;
        for (int i = 0; i < k; i++) {
            currSum += arr[i];
        }
        int maxSum = currSum;
        for (int j = k; j < arr.length; j++) {
            currSum += (arr[j] - arr[j - k]);
            maxSum = Math.max(maxSum, currSum);
        }
        return maxSum;
    }

    // sliding window technique for maxproduct sum;
    
    public static void main(String[] args) {
        int arr[] = { 1, 8, 30, -5, 20, 7 };
        System.out.println(maxSumSlide(arr, 3));

    }
}
