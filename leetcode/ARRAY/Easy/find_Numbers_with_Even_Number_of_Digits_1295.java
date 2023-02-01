package leetcode.ARRAY.Easy;

public class find_Numbers_with_Even_Number_of_Digits_1295 {
    public static void main(String[] args) {
        int count = 0;
        int[] nums = { 1, 22, 43, 5 };
        String[] s = new String[nums.length];
        for (int i = 0; i < nums.length; i++) {
            s[i] = Integer.toString(nums[i]);
        }
        for (int j = 0; j < s.length; j++) {
            if (s[j].length() % 2 == 0) {
                count++;
            }
        }
        System.out.println("there are total " + count + " numbers with even length");
    }

}

    // DIRECT LEETCODE SOLUTION
/*
class solutin{
    public int findNumbers(int[] nums) {
        int count = 0;
        String[] s = new String[nums.length];
        for(int i = 0; i<nums.length; i++){
            s[i] = Integer.toString(nums[i]); // converting arr to String 
        }
        for(int j = 0; j<s.length; j++){
            if(s[j].length() % 2 == 0) // function to find the even length
            
            {
                count ++;
            }
        }
        return count;
    }
}
*/
