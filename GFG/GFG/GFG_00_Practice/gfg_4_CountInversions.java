package GFG.GFG_00_Practice;

public class gfg_4_CountInversions {
    static int countInversions(int[] arr){
        int count = 0;
        for(int i = 0; i<arr.length; i++){
            for(int j = i+1; j<arr.length; j++){
                // System.out.print(arr[i] +", "+ arr[j]);
                if(arr[i]> arr[j] && i<j){
                    count++;
                }
            }
        }
        return count;
    }
    public static void main(String[] args) {
        int[] arr = {2,4,1,3,5};
        System.out.println(countInversions(arr));
    }
}
