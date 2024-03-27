package Love_SDE_Sheet;

import java.util.ArrayList;

public class l_sde_first_And_Last_Occurance_of_X {
    static ArrayList<Integer> firtAndLast(int[] arr, int x){
        ArrayList<Integer> ans = new ArrayList<>();
        int start = 0;
        int end = arr.length-1;
        // ans.add(0,-1);
        // ans.add(1,-1);
        
        while(start<=end){
            if(arr[start] == x && arr[end] == x){
                ans.add(0, start);
                ans.add(1, end);
                break;
            }
            if(arr[start] != x){
                start++;
            }
            if(arr[end] != x){
                end--;
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        int[] arr = { 1, 3, 5, 5, 5, 5, 67, 123, 125 };
        System.out.println(firtAndLast(arr, 5));
    }
}
