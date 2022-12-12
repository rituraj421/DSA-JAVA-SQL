package CLG;

import java.util.Scanner;
public class nested {
    public static void main(String[] args) {

        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter number a : ");
            int a = sc.nextInt();
            System.out.println("Enter number b : ");
            int b = sc.nextInt();
            System.out.println("Enter c");
            int c = sc.nextInt();
            if(a>b){
                if(a>c){
                    System.out.println("A is greater than b");
                }
            }
            if(b>a){
                if(b>c){
                    System.out.println("B is greater");
                }
            }
            else{
                System.out.println("hthgb");
            }
        }
        
    }
}