import java.util.ArrayList;

public class syntax {

    static void change(int[] arr){
        ArrayList<Integer> change = new ArrayList<>();
        for(int i = arr.length/2; i<arr.length; i++){
            change.add(arr[i]);
        }
        for(int i = 0; i<arr.length/2; i++){
            change.add(arr[i]);
        }
        System.out.println(change);
    }
    public static void main(String[] args){
        
        // System.out.println("hey");
        int[] arr = {1,2,3,4,5,6,7};
        change(arr);
        // output = {4,5,6,1,2,3};
    }
}
