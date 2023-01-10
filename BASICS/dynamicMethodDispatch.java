package BASICS;

class One {
    public void name() {
        System.out.println("My name is ritu");
    }

    public void greet() {
        System.out.println("Hey good morning");
    }
}

class Two extends One {

    public void swagat() {
        System.out.println("Hey aapka swagat hai");
    }

    public void name() {
        System.out.println("My name is rituraj");
    }
}

public class dynamicMethodDispatch {
    public static void main(String[] args) {
        // One obj = new One();
        // Two obj1 = new Two();
        // obj.name();
        // obj1.name();

        One obj = new Two(); // super and sub class
        obj.name();
    }
}
