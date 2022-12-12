package CLG;
import java.util.Scanner;

public class ifPr {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter your age");
            int age;
            age = sc.nextInt();

            switch(age){
                case 18:
                    System.out.println("You are going to become adult");
                    break;             
                case 22:
                    System.out.println("You are now an employee");
                    break;

            }
        }
        int ag = 47;
        if (ag>56){
            System.out.println("You Are Experienced!");
        }
        else if(ag>46){
            System.out.println("You Are Semi-Experienced!");
        }
        else{
            System.out.println("You Are A Child");
        }

         
    }


}
