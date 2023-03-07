package RECURSION;

public class print_Numbers {

  static void printNumb(int n) {
    if (n == -6) {
      return;
    }
    System.out.println(n);
    printNumb(n - 1);
  }

  public static void main(String[] args) {
    // print numbers from 5-1;
   
    int n = 5;
    printNumb(n);
  }
}
