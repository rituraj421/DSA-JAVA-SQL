package GFG_3_ARRAYS;

public class arr_6_whoHasMajority {
    static int majorEle(int[] arr, int x, int y){
        int count1 = 1;
        int count2 = 1;
        for(int i = 0; i<arr.length; i++){
            if(arr[i] == x){
                count1++;
            }
            else if(arr[i] == y){
                count2++;
            }
        }
        if(count1 == count2){
            return Math.min(x, y);
        }
        else {
            return Math.max(count1, count2);
        }
    }
    public static void main(String[] args) {
        int arr[] = {5 ,22, 29, 12, 32, 69, 1, 75};
        System.out.println(majorEle(arr, 29, 86));
    }
}
