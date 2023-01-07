package BASICS;
// problem 1

class Employee0 {
    int salary;
    String name;

    public int getSalary() {
        return salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String n) {
        name = n;
    }
}

// problem 2

class cellPhone {
    public void ringing() {
        System.out.println("ringing ...");
    }

    public void vibrating() {
        System.out.println("vibrating ...");
    }

    public void calling() {
        System.out.println("calling ...");
    }
}

// problem 3

class rec {
    int length;
    int breadth;
    int area;
    int perimeter;

    public int area() {
        return area = (length * breadth);
    }

    public int perimeter() {
        return perimeter = 2 * (length + breadth);
    }
}

public class customClassPractice {
    public static void main(String[] args) {

        // problem 1

        Employee0 ritu = new Employee0();
        ritu.setName("rituraj");
        ritu.salary = 15;
        System.out.println(ritu.getSalary());
        System.out.println(ritu.getName());

        // problem 2

        cellPhone nothing = new cellPhone();
        nothing.calling();
        nothing.ringing();
        nothing.vibrating();

        // problem 3

        rec sq = new rec();
        sq.length = 33;
        sq.breadth = 10;

        System.out.println(sq.area());
        System.out.println(sq.perimeter());
    }
}