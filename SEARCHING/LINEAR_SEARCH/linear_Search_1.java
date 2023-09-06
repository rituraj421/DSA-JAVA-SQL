package SEARCHING.LINEAR_SEARCH;

public class linear_Search_1 {
    // Q1 SEARCH THE ELEMENT
    static int ele(int[] arr, int x){
        for(int i = 0; i<arr.length; i++){
            if(arr[i] == x){
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args) {

        // Q1 ELEMENT SEARCH
        int[] arr = {10,20,30,40,50,60};
        System.out.println(ele(arr, 0));
    }
}