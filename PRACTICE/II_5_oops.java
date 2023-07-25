package PRACTICE;

class cylinder {
    private int height;
    private int radius;

    public cylinder(int h, int r) {
        this.height = h;
        this.radius = r;
    }

    public void setR(int r) {
        radius = r;
    }

    public int getR() {
        return radius;
    }

    public void setH(int h) {
        height = h;
    }

    public int getH() {
        return height;
    }

    public int area(){
        return height*radius;
    }
}

public class II_5_oops {
    public static void main(String[] args) {
        // create a class cylinder and use getters and setters to its radius and height
        cylinder c = new cylinder(10, 5);
        System.out.println(c.getR());
        System.out.println(c.getH());
        System.out.println(c.area());
    }
}
