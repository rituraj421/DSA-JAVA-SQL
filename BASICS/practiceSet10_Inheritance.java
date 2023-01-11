package BASICS;

// problem 1
class Circle {
    public int radius;

    Circle(int r) {
        System.out.println("I am circle parameterised constructor");
        this.radius = r;
    }

    public double area() {
        // double area = Math.PI * this.radius * this.radius;
        return Math.PI * this.radius * this.radius;
    }
}

class Cylinder extends Circle {
    public int height;

    Cylinder(int r, int h) {
        super(r);
        this.height = h;
    }

    public double volume() {
        return Math.PI * this.radius * this.radius * this.height;
    }
}

public class practiceSet10_Inheritance {
    public static void main(String[] args) {
        // PROBLEM 1
        // create a class circle and create another class cylinder from it

        Circle cir = new Circle(12);
        System.out.println(cir);

        Cylinder cyl = new Cylinder(12, 10);
        System.out.println(cyl);

        // PROBLEM 2
        // create a class rectangle and use inheritance to create another class cuboid , try to keep it as close to real world scenerio as possible

    }
}