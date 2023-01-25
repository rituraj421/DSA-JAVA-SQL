package BASICS;

public class string_Buffer {
    public static void main(String[] args) {
        // String
        String s = new String("ritu");
        s.concat("java");
        System.out.println(s);
        // Strings are immutable ,

        // StringBuffer

        StringBuffer sb = new StringBuffer("ritu");
        sb.append("raj");
        System.out.println(sb);

        // Stringbuffer are mutable

        // operators
        System.out.println("OPERATORS : -");
        
        String s1 = new String("ritu");
        String s2 = new String("ritu");

        System.out.println(s1 == s2); // returns false
        System.out.println(s1.equals(s2)); // returns true

        StringBuffer sb1 = new StringBuffer("ritu");
        StringBuffer sb2 = new StringBuffer("ritu");

        System.out.println(sb1 == sb2); // returns false
        System.out.println(sb1.equals(sb2)); // returns false

    }
}
