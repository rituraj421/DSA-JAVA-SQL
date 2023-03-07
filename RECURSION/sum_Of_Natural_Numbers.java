package RECURSION;

public class sum_Of_Natural_Numbers {

  static void printSum(int i, int n, int sum) {
    if (i == n) {
      sum += i;
      System.out.println(sum);
      return;
    }
    sum += i;
    printSum(i + 1, n, sum);
    System.out.println(i);
  }

  public static void main(String[] args) {
    printSum(0, 2, 0);
  }
}
