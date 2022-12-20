package CLG;

import java.util.Scanner;

public class sum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter input value : ");
        int input = sc.nextInt();
        // int x = 2;.
        // int sum = 0;
        // print sum of 2-4+6-8.....-20
        // -2+4-6
        // double sum = 0, p=-1;
        // for (int j = 1; j <= 20;j++) {
        // // p = Math.pow(-1,j-1);
        // if(j%2==0){

        // p= p*-1;
        // sum= sum+p*j;
        // }
        // }
        // System.out.println(sum);

        // print sum = x/2+x/5+x/8 ---x/20
        // -2+4-6+8....+20
        double sum = 0, p = 1;
        for (int j = 1; j <= 20; j++) {
            // p = Math.pow(-1,j-1);
            if (j % 2 == 0) {
                p = p * -1;
                sum = sum + p * j;
            }
        }
        System.out.println(sum);
        // double sum;
        // int nume = 1;
        // for(int i = 2; i<=20; i = i+3){
            
        // }
        // sum = sum+(nume/i);
        //     System.out.println(sum);

        //oprint the sum of series , 3/x-5/x^2+ 7/x^4...
        // double summ = 0 , k=1;
        for (int i = 3; i<= input; i = i+2){
            System.out.println(i);
        }
        for (int j = 0; j<=40; j = j+2){
            System.out.println(j);
            j = (int) Math.pow(j, 2);
        }
        // k = k * -1;
        // summ = (i/j);
    }
}