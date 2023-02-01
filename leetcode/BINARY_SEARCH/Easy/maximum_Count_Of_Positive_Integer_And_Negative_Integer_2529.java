package leetcode.BINARY_SEARCH.Easy;

public class maximum_Count_Of_Positive_Integer_And_Negative_Integer_2529 {
    
    public static void main(String[] args) {
        int[] nums = { 5,20,66,1314 };
        int pos = 0;
        int neg = 0;

        for(int i = 0; i<nums.length; i++){
            if(nums[i]> 0){
                pos++;
            }
            else  if(nums[i] < 0){
                neg++;
            }
        }
        System.out.println(Math.max(pos, neg));
    }
}
