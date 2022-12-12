package CLG;

import java.util.Scanner;
public class statementsP {
    public static void main(String[] args) {

        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter Your Age: ");
            int a = sc.nextInt();

            if(a>18){
                System.out.println("You Can Drive");
            }
            else if(a==18){
                System.out.println("go and learn driving");
            }
            else{
                System.out.println("You can drive");
            }
        }
    }
    
}
