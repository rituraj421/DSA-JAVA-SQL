import java.util.Scanner;
public class Lecture10Arrays {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        /*
        System.out.println("Enter marks of Phy");
        System.out.println("Enter marks of Chem");
        System.out.println("Enter marks of Maths");
        int[] array = new int[3];
        //for(int i = 0; i<3; i++){
            //System.out.println(array [i]);
        }
        */
        int marks[] = {97,98,95};
        for(int i = 0; i<3; i++){
            System.out.println(marks[i]);
        }
        int size = sc.nextInt();
        int numbers[] = new int[size];
        //input
        for(int i = 0; i<size; i++){
            numbers[i] = sc.nextInt();
        }
        int x = sc.nextInt();
        //output
        for(int i=0; i<size; i++){
            if(numbers[i] == x){
                System.out.println("x found at index : " + i);
            }
        }
    }
    
}
