package BASICS;

class cylinderrrrr {
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
        cylinderrrrr mycylinderrrrr = new cylinderrrrr();
        mycylinderrrrr.setHeight(12);
        int h = mycylinderrrrr.getHeight();
        System.out.println(h);
        mycylinderrrrr.setRadius(9);
        System.out.println(mycylinderrrrr.getRadius());

        // problem 2
        System.out.println(mycylinderrrrr.surfaceArea());
        // System.out.println(mycylinderrrrr.volume());

        // problem 3

    }

}