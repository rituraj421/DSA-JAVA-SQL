package BASICS;

class A {
    public int a;

    public int ritu() {
        return 5;
    }

    public void meth2() {
        System.out.println("I am method 2 of class A");
    }
}

class B extends A {

    public void meth2() {
        System.out.println("I am method 2 of class B");
    }

    public void meth3() {
        System.out.println("I am meth 3 of class B");
    }
}

public class methodOverriding {
    public static void main(String[] args) {
        A a = new A();
        a.meth2();

        B b = new B();
        b.meth2();
    }
}
