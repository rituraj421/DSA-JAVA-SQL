import java.util.Scanner;
public class Lecture6Patterns {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //problem 1
        System.out.println("Enter a");
        int a = sc.nextInt();

        //problem 2
        System.out.println("Enter b");
        int b = sc.nextInt();
        //problem 1
        // mine code showing some errors 
        for(int i = 1; i<=a; i++){
            for(int j = 1; j<=i; j++){
                System.out.print("*");
            }
            int spaces = 2 * (a-i);
            for(int j = 1; j<=spaces; j++ ){
                System.out.print(" ");
            }
            for(int j = 1; j<=i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
        
        /*
        for(int i=1; i<=a; i++) {
            for(int j=1; j<=i; j++) {
                System.out.print("*");
            }
  
            int spaces = 2 * (a-i);
            for(int j=1; j<=spaces; j++) {
                System.out.print(" ");
            }
  
            for(int j=1; j<=i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        */
 
        for(int i=a; i>=1; i--) {
            for(int j=1; j<=i; j++) {
                System.out.print("*");
            }
  
            int spaces = 2 * (a-i);
            for(int j=1; j<=spaces; j++) {
                System.out.print(" ");
            }
  
            for(int j=1; j<=i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        //problem 2
        for(int i = 1; i<=b;i++){
            for(int j = 1; j<=b-i; j++){
                System.out.print(" ");
            }
            for(int j = 1; j<=b; j++){
                System.out.print("*");
            }
            System.out.println();
        }
 
    }
    
}
