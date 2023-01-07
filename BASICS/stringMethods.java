package BASICS;

import java.util.Scanner;
public class stringMethods {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter your name : ");
        String name = sc.nextLine();
        System.out.println("My name is " + name);

        int value = name.length(); //it returns the length of string
        System.out.println(value);

        String casee = name.toUpperCase(); // it will return in upperCase(BOLD), similarly we also hava toLowerCase
        System.out.println(casee);

        String trimm = name.trim(); //it will trim the blank spaces 
        System.out.println(trimm);

        System.out.println(name.substring(1, 5));  //it will start from index 1(including 1) and will go till end (excluding end)

        System.out.println(name.replace('r', 'j'));  //it will replcase r with j

        System.out.println(name.startsWith("u")); //it returns the boolean, if matches the condition then returns else false, similarly we also have 'endswith'

        System.out.println(name.charAt(0)); // returns tha character at index(here at index 0)

        System.out.println(name.indexOf('z')); // if z is present in the string then returns the index of it and alse it will return '-1'

        sc.close();
    }
}
