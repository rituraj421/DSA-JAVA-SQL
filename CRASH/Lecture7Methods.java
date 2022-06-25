import java.util.Scanner;

public class Lecture7Methods {
    //problem 1
    public static void printMyName(String name){
        System.out.println(name);
        return ;
    }
    //problem 2
    public static int calculateSum(int a, int b){
        int sum = a + b;
        return sum;
    }
    //problem 3
    public static int findProduct(int c, int d){
        int product = (c*d);
        return product;
    }
    //problem 4
    public static void printFactorial(int n){
        if(n<0){
            System.out.println("Invalid Number");
            return;
        }
        int factorial = 1;
        for(int i = n; i>=1; i--){
            factorial = factorial*i;
        }
        System.out.println(factorial);
        return;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //problem 1
        System.out.println("Enter ur name");
        String name = sc.nextLine();
        printMyName(name);
        
        //problem 2
        System.out.println("Enter a");
        int a = sc.nextInt();
        System.out.println("Enter b");
        int b = sc.nextInt();
        
        int sum = calculateSum(a,b);
        System.out.println("The sum of two numbers i.e a & b is:- "+sum);

        //problem 3
        System.out.println("Enter c");
        int c = sc.nextInt();
        System.out.println("Enter d");
        int d = sc.nextInt();

        int product = findProduct(c,d);
        System.out.println("The product of two given numbers is:- "+product);
        
        //problem 4

        System.out.println("Enter n");
        int n = sc.nextInt();
        printFactorial(n);
        //System.out.println("The factorial of given number is:- "+printFactorial);
    }
    
}
