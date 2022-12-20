import java.util.Scanner;

public class dynamicArray {
    public static void main(String[] args){
        int [][] arr = {
            {1,2,3,4},
            {1 ,2 },
            {1}
        };
        try (Scanner sc = new Scanner(System.in)) {
        }
        // int [][] arr = new int[3][2];
        for(int i = 0; i < arr.length; i++){
            for (int j = 0; j < arr[i].length; j++){
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("the array is " + arr[0][0]);
    }
}

