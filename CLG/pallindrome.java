package CLG;

import java.util.Scanner;
public class pallindrome {
    public static void main (String[] args){
        //FIND THE SUM OF DIGITS
        //reverse the number
        //find pallindrome
        //a+= a+++++a+--a+a-- find output 

        Scanner sc =  new Scanner(System.in);
        System.out.println("Enter a");
        int a = sc.nextInt(); 
        
        // while(a<=7){
        //     System.out.println(a++ + ++a + --a + a--);

        // }

        // s = x^1-x^2+x^3-x^4 ......-x^20
        // x = 2
        // int x = 2;
        // System.out.println(x^1-x^2+x^3-x^4+x^5-x^6+x^7-x^8+x^9-x^10+x^11-x^12+x^13-x^14+x^15-x^16+x^17-x^18+x^19-x^20);
        // System.out.println(++x);

        // int x = 2;
        // int sum = 0;
        // for(int j =1; j<=20; j++ ){
        //     sum + = math.pow(-1, j-1);
        //     *math.pow(x,j);
            
        // }
        // System.out.println(sum);

        // for(int j = 1; j<=a; j++){
        //     System.out.print("l");
            
        //it has two methods 
            for(int i = 0; i<=5; i++){
                System.out.print("");
                for(int j=0; j<=i; j++){
                    System.out.print("1");
                }
                // for(int j=0; j<=i; j++){
                //     System.out.print("*");
                // }
                System.out.print(" ");
                
            }
        }
    }

