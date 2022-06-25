import java.util.Scanner;
public class Lecture11Arrays2d {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        /* 
        int rows = sc.nextInt();
        int cols = sc.nextInt();

        int [][] numbers = new int[rows][cols];
        //input
        //rows
        for(int i = 0; i<rows; i++){
            //cols
            for(int j= 0; j<cols; j++){
                numbers[i][j] = sc.nextInt();
            }
        }
        //output
        for(int i = 0; i<rows; i++){
            for(int j = 0; j<cols; j++){
                System.out.print(numbers[i][j] + " ");
            }
            System.out.println();
        }
        */
        //problem 2
        int row = sc.nextInt();
        int col = sc.nextInt();

        int [][] number = new int[row][col];
        //input
        //rows
        for(int i = 0; i<row; i++){
            //cols
            for(int j= 0; j<col; j++){
                number[i][j] = sc.nextInt();
            }
        }
        //output

        int x = sc.nextInt();

        for(int i = 0; i<row; i++){
            for(int j = 0; j<col; j++){
                //compare with x
                if(number[i][j] == x){
                    System.out.print("x found at location ("+i+" , "+j+" )");
                }
            }
            //System.out.println();
        }
    }
    
}
