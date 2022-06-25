import java.util.Scanner;
public class Lecture4LoopsInJava {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter n");
        int n = sc.nextInt();
        System.out.println("Enter x");
        int x = sc.nextInt(); 
        for(int i = 0; i<=10; i++){
            System.out.println(i);
        }
        
        for(int counter = 0; counter<=7; counter ++){
            System.out.println("Hey, ritu!");
        }

        int a = 0;
        while(a<7){
            System.out.println(a);
            a++;
        }
        int z = 0;
        do{
            System.out.println(z);
            z++;
        }
        while(z<=7);

        int sum = 0;
        for(int b = 1;b<=n;b++){
            sum = sum+b;
        }
        System.out.println(sum);

        //second methos for sum of n natural numbers

        int natural = 0;
        for(int c = 1; c<=5; c++){
            natural = natural+c;
        }
        System.out.println(natural);

        //table of a number 
        for(int y = 1; y<=10;y++){
            System.out.println(x*y);
        }
        }

        
    }
    

