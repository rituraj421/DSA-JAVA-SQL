package GFG.GFG_00_Practice;

import java.util.ArrayList;

public class gfg_5_LeadersInAnArray {
    static void leader(int[]arr){
        ArrayList<Integer> ans = new ArrayList<>();
        for(int i =0;i<arr.length; i++){
            int j;
            for(j = i+1; j<arr.length; j++){
                if(arr[j]>=arr[i]){
                    break;
                }
            }
            if(j == arr.length){
                ans.add(arr[i]);
            }
        }
        System.out.println(ans);
    }
    public static void main(String[] args) {
        int[] arr = {16,17,4,3,5,2};
        leader(arr);
    }
}
