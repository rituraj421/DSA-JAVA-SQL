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

        String sa = new String("rituraj");
        sa.concat(" roj"); // garbage collection 
        sa = sa.concat(" choudhary");
        System.out.println(sa);

        String r = new String("spring");
        r.concat("Fall");
        String r1 = r.concat(" winter");
        r1.concat("Summer");

        System.out.println(r);
        System.out.println(r1);

        System.out.println("Strings c series");

        String c1 = new String("You cannot change me");
        String c2 = new String("You cannot change me");

        System.out.println(c1 == c2);

        String c3 = "You cannot change me";
        System.out.println(c1 == c3);

        String c4 = "You cannot change me";
        System.out.println(c3 == c4);

        String c5 = "You cannot" + " change me"; // both constant true
        System.out.println(c4 == c5);

        String c6 = "You cannot";
        String c7 = c6 + " change me"; // both are not constant , false 
        System.out.println(c4 == c7);

        final String c8 = "You cannot"; // final means constant, i.e both are constant so will return true
        String c9 = c8 + " change me";
        System.out.println(c4 == c9); // returns true


    }
}
