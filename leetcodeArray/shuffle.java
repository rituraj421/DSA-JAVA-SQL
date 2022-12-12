package leetcodeArray;
import java.util.Scanner;
public class shuffle {
    // public static void main(String[] args){
        public int[] shuffle(int[] nums, int n) {
            int int = sc.nextInt(2*n);
            for(int i = 0; i <2*n; i++){
                if(i % 2 == 0)
                    
                    int[i] = nums[i/2];
                else
                    int[i] =nums[n + i/2];
            }
            return int;
        }
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        
    }
