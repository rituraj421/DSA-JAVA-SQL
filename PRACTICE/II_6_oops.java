package PRACTICE;

class base {
    int x;

    public void printMe() {
        System.out.println("Hey its me ");
    }

    public void setX(int a) {
        this.x = a;
    }

    public int getX() {
        return x;
    }
}

class Derived extends base {
    int y;

    public void setY(int b) {
        this.y = b;
    }

    public int getY() {
        return y;
    }
}

public class II_6_oops {
    public static void main(String[] args) {
        // base b = new base();
        Derived d = new Derived();
        d.setX(5);
        // b.setX(4);
        System.out.println(d.getX());
    }
}
