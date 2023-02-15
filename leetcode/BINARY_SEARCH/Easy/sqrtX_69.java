package leetcode.BINARY_SEARCH.Easy;

public class sqrtX_69 {
    static int mySqrt(int x) {
        int start = 1;
        int end = x;
        int ans = 0;

        if(x == 0){
            return 1;
        }
        while (start <= end) {
            int mid = start + (end - start) / 2;
            int key = (x / mid);

            if (key >= mid) {
                ans = mid;
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        int ans = mySqrt(0);
        System.out.println(ans);
    }
}
