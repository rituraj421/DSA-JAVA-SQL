import java.util.Scanner;
public class Lecture5Patterns {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //problem 1
        System.out.println("Enter n");
        int n = sc.nextInt();
        System.out.println("Enter m");
        int m = sc.nextInt();

        //problem 2
        System.out.println("Enter x");
        int x = sc.nextInt();
        System.out.println("Enter y");
        int y = sc.nextInt();

        //problem 3
        System.out.println("Enter a");
        int a = sc.nextInt();

        //problem 4
        System.out.println("Enter b");
        int b = sc.nextInt();

        //problem 5
        System.out.println("Enter c");
        int c = sc.nextInt();

        //problem 6
        System.out.println("Enter d");
        int d = sc.nextInt();

        //problem 7
        System.out.println("Enter e");
        int e = sc.nextInt();

        //problem 8
        System.out.println("Enter f");
        int f = sc.nextInt();
        System.out.println("Enter number");
        int number = sc.nextInt();

        //problem 9
        System.out.println("Enter g");
        int g = sc.nextInt();

        //problem 1
        for(int i = 1; i<=n; i++){
            //System.out.println("*");
            for(int j = 1; j<=m;j++){
                System.out.print("*");
            }
            System.out.println();
        }
        //problem 2
        for(int i = 1; i<=x; i++){
            for(int j = 1; j<=y; j++){
                if(i == 1 || j == 1 || i == x || j == y){
                    System.out.print("0");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
        //problem 3
        for(int i = 1; i<=a; i++){
            for(int j = 1; j<=i; j++){
                System.out.print("1");
            }
            System.out.println();
        }
        // problem 4
        for(int i = b; i>=2; i--){
            for(int j = 1; j<i; j++){
                System.out.print("r");
            }
            System.out.println();
        }
        //problem 5
        for(int i = c; i>=1; i--){
            for(int j = 1; j<i; j++){
                System.out.print("hey u, ");
            }
            for(int j = 0;j<=c-i; j++){
                System.out.print("ritu ! ");
            }
            System.out.println();
        }
        //problem 6
        for(int i = 1;i<=d;i++){
            for(int j = 1; j<=i;j++){
                System.out.print(j); // if we replace j = i , the outcome will be different
            }
            System.out.println();
        }
        //problem 7
        for(int i = e; i>=1; i--){
            for(int j = 1; j<=i; j++){
                System.out.print(j);
            }
            System.out.println();
        }
        //problem 8
        //int number = 1;
        for(int i = 1; i<=f; i++){
            for(int j = 1; j<=i; j++){
                System.out.print(number+" ");
                number++;
            }
            System.out.println();
        }
        //problem 9
        for(int i = 1; i<=g; i++){
            for(int j = 1; j<=i; j++){
                if((i+j)  % 2 == 0){
                    System.out.print(1+" ");
                }
                else{
                    System.out.print(0+" ");
                }
            }
            System.out.println();
        }
    }
    
}
