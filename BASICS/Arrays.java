package BASICS;

// import java.util.Scanner;
public class Arrays {
    public static void main(String[] args) {
        
       int [] marks = {12, 13, 14, 30, 50};
    //    int [] marks = new int[5];
    //    marks[0] = 100; 
    //    marks[1] = 100;
    //    marks[2] = 100;
    //    marks[3] = 100;
    //    marks[4] = 100;
      //  System.out.println(marks[4]);

    //    System.out.println(marks);
       for (int i = 0; i<marks.length; i++){
        System.out.println(marks[i]);
       }
    // using for each loop 
    
       for (int element: marks){
         System.out.println(element);
        }
    }
}