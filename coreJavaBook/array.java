package coreJavaBook;

import java.util.*;
public class array {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);

        // int [] arr = new int[100];
        
        //     for(int a=0; a<arr.length; a++){
        //     arr[a] =a+1;
        //      System.out.println(arr[a]);
        //     }

        // int[] smallPrimes = {2, 3, 5, 7, 11, 13};
        // int[] luckyNumbers = {1001, 1002, 1003, 1004, 1005, 1006, 1007};
        // System.arraycopy(smallPrimes, 2, luckyNumbers, 3, 4);
        // for (int i = 0; i < luckyNumbers.length; i++)
        // System.out.println(i + ": " + luckyNumbers[i]);

        //lottery code 

        System.out.println("How many numbers do you need to draw? ");
        int k = in.nextInt();

        System.out.println("What is hoghest number you can draw? ");
        int n = in.nextInt();
        
        //fill the array with numbers 1,2 ,3.....n

        int [] numbers = new int[n];
        for(int i = 0; i<numbers.length; i++)
        numbers [i] = i+1;

        // draw k numbers and put them in second array

        int[] result = new int[k];
        for(int i = 0; i<result.length; i++){

            //make a random index between 0 and n-1
            int r = (int) (Math.random()* n);

            //pick the element at the random location
            result[i] = numbers[r];

            //move the last element into the random location
            numbers[r] = numbers[n-1];
            n--;

        }
        //print the sorted array
        Arrays.sort(result);
        System.out.println("Bet the following combination and it'll make u rich!");
        for(int r: result)
        System.out.println(r);
        in.close();
    }
}
