package CLG;

// import java.util.Scanner;

public class pattern2 {
    public static void main(String[] args) {

        for(int i = 0; i<=5; i++){
            System.out.println("");
            for(int j=0; j<=5-i; j++){
                System.out.print(" ");
            }
            for(int j=0; j<=i; j++){
                System.out.print("*");
            }
            
        }
    }

}

