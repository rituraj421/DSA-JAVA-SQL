public class methods1 {

  // create method to add two numbers
  static int add(int x, int y) {
    int c;
    c = x + y;
    return c; // we need to return it in method itself;
    // we cannot create object of a method , objects are instances of classes;
  }

  // create method to multiply two numbers

  void multiply(int a, int b) {
    double c = a * b;
    System.out.println(c);
  }

  public static void main(String[] args) {
    System.out.println(add(4, 5)); // this is what we call parameterised method , as it has parameters
    System.out.println((add(5, 7))); // way to access method in static way

    // now create object of main class to call the methos for multiplication
    methods1 met = new methods1();
    met.multiply(4, 5); // we r accessing it in non-static way
   // met.add(2, 3); // this is not possible as 'add ' is a static method
  }
}