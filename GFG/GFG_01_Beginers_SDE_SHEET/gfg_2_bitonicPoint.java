package GFG_01_Beginers_SDE_SHEET;

public class gfg_2_bitonicPoint {
    static int bitonicPoint(int[] arr){
        int max = arr[0];
        for(int i = 0; i<arr.length; i++){
            if(arr[i]>max){
                max = arr[i];
            }
        }
        return max;
    }
    public static void main(String[] args) {
        int[] arr = {1,15,25,45,42,21,17,12,11};
        System.out.println(bitonicPoint(arr));
    }
}
