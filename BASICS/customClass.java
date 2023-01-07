package BASICS;

class worker{
    int id;
    int salary;
    String name;

    public void printDetail(){
        System.out.println("worker name is " + name + " his id is " + id + " and his salary is " + salary);
    }
}
public class customClass {
    public static void main(String[] args) {
        System.out.println("This is our custom class");

        worker ritu = new worker();
        worker raj = new worker();

        // setting attributes
        ritu.id = 11;
        ritu.salary = 80000;
        ritu.name = "rituraj";

        raj.id = 13;
        raj.name = "raj charles";
        ritu.printDetail(); // we are calling method else wen can directly "sout" in main class
        raj.printDetail();
        // System.out.println("worker name is " + ritu.name + " and his id is " + ritu.id);
    }
}
