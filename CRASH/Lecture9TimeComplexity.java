import java.util.Scanner;
public class Lecture9TimeComplexity {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        for(int i = 0; i<n; i++){
            System.out.println("Hello");
        }
        for(int i = 0; i<m; i++){
            for(int j = 0; j<m; j++){
                System.out.println("hii");
            }
        }
    }
    
}
