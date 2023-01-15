package BASICS;

class cylinder {
    private int radius;
    private int height;

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public double surfaceArea() {
        return 2 * Math.PI * radius * radius + 2 * Math.PI * radius * height;
    }

}

public class practiceSet9 {
    public static void main(String[] args) {
        // problem 1
        cylinder myCylinder = new cylinder();
        myCylinder.setHeight(12);
        int h = myCylinder.getHeight();
        System.out.println(h);
        myCylinder.setRadius(9);
        System.out.println(myCylinder.getRadius());

        // problem 2
        System.out.println(myCylinder.surfaceArea());
        // System.out.println(myCylinder.volume());

        // problem 3

    }

}