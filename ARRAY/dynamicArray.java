import java.util.Scanner;

public class dynamicArray {
    public static void main(String[] args){
        int [][] arr = {
            {1,2,3,4},
            {1 ,2 },
            {1}
        };
        Scanner sc = new Scanner(System.in);
        // int [][] arr = new int[3][2];
        for(int row = 0; row < arr.length; row++){
            for (int col = 0; col < arr[row].length; col++){
                System.out.print(arr[row][col] + " ");
            }
            System.out.println();
        }
    }
}

