import java.util.Scanner;
public class Lecture13stringbuilder {
    public static void main(String[] args) {
     StringBuilder sb = new StringBuilder("ritu");
     System.out.println(sb);
     //char at index
     System.out.println(sb.charAt(1)); 
     //set char at
     sb.setCharAt(1,'u');
     System.out.println(sb);
     //insert char
     sb.insert(0,'r');
     System.out.println(sb); 
     //delete the extra
     sb.delete(0,1);
     System.out.println(sb);
     //append
     sb.append("r"); //str = str + "r"
     sb.append("a");
     sb.append("j");
     System.out.println(sb);

     for(int i=0; i<sb.length()/2; i++) {
        int front = i;
        int back = sb.length() - i - 1;
  
        char frontChar = sb.charAt(front);
        char backChar = sb.charAt(back);
  
        sb.setCharAt(front, backChar);
        sb.setCharAt(back, frontChar);
      }
  
      System.out.println(sb);
    }
    
}
