package BASICS;

// import java.util.Scanner;
// import java.util.*;

class c1 {
    public int x = 5;
    protected int y = 45;
    int z = 6;
    // private int a = 55;

    public void meth1() {
        System.out.println(x);
    }
}

public class accessModifier {
    public static void main(String[] args) {

        c1 c = new c1();
        c.meth1();
        
        System.out.println(c.x);
        System.out.println(c.y);
        System.out.println(c.z);
        // System.out.println(c.a);
    }
}