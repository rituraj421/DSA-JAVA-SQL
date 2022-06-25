import java.util.Scanner;
public class Lecture3Conditional {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter your age");
        int age = sc.nextInt();
        System.out.println("Enter your name");
        String name = sc.next();

        System.out.println("Enter x");
        int x = sc.nextInt();

        System.out.println("Enter a ");
        int a = sc.nextInt();
        System.out.println("Enter b ");
        int b = sc.nextInt();
        
        if (age>=18){
            System.out.println("Hey, "+name+" You are an adult !!");
        }
        else{
            System.out.println("Arre, "+name+" Tum to bacche ho yar!!");
        }
        

        
        if (x % 2 == 0){
            System.out.println("It's an even number ");
        }
        else{
            System.out.println("It's an odd number ");
        }
        

        if(a==b){
            System.out.println("Equal");
        }
        else{
            if(a<b){
                System.out.println("a is lesser");
            }
            else{
                System.out.println("a is greatrer");
            }
        }
        
    }
    
}
