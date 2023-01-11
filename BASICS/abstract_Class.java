package BASICS;

abstract class parenta {
    public parenta() {
        System.out.println("I am constructor of parenta class");
    }

    public void sayHello() {
        System.out.println("Hello...");
    }

    abstract public void greeta();

    abstract public void greetaa();
}

class Childa extends parenta {
    public void greeta() {
        System.out.println("Good  morning");
    }

    public void greetaa() {
        System.out.println("Good afternoon");
    }
}

abstract class Childaa extends parenta {
    public void th() {
        System.out.println("I am good");
    }
}

public class abstract_Class {
    public static void main(String[] args) {
        Childa a = new Childa();
        System.out.println(a); // optional no need for it

    }
}