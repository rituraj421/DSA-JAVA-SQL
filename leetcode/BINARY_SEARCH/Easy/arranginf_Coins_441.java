package leetcode.BINARY_SEARCH.Easy;

public class arranginf_Coins_441 {

    static int arrangeCOins(int n) {
        int start = 0;
        int end = n;

        while (start <= end) {
            int mid = start + (end - start) / 2;
            long ans = (long) mid * (mid + 1) / 2;

            if(ans == n){
                return mid;
            }
            else if(ans > n){
                end = mid -1;
            }
            else{
                start = mid + 1;
            }
        }
        return end;
    }

    public static void main(String[] args) {
        System.out.println(arrangeCOins(1804289383));
    }
}
