package leetcode.BINARY_SEARCH.Easy;

public class count_Negative_Numbers_Ia_A_Sorted_Matrix_1351 {
    public static void main(String[] args) {
        int count = 0;
        int[][] grid = {
                { 4, 3, 2, -1 },
                { 3, 2, 1, -1 },
                { 3, 2, 1, -1 },
                { -1, -1, -2, -3 }
        };

        for(int i= 0; i<grid.length; i++){
            for(int j = 0; j<grid[i].length; j++){
                System.out.print(grid[i][j] + " ");
                if(grid[i][j] < 0){
                    count ++;
                }
            }
            System.out.println();
        }
        System.out.println(grid[0][1]);
        System.out.println(count);

        

/*
        int count = 0;
        for(int i = 0; i<grid.length; i++){
            for(int j = 0; j<grid[i].length; j++){
                if(grid[i][j] < 0){
                    count ++;
                }
            }
        }
        return count;
 */
/*
        int count = 0;
        int start = 0;
        int end = grid[0].length - 1;

        while(start<end){
            int mid = start + (end - start) / 2;
            for(int i =0; i<grid.length -1; i++){
                for(int j = i; j<grid[i].length -1; j++){
                    if(mid < 0){
                end = mid - 1;
                count++;
            }
            else{
                start = mid + 1;
                count++;
            }
                }
            }
        }
        return count -1;

*/
    }
}