package PRACTICE;

class employee {
    int id;
    String name;

    public void printDetail() {
        System.out.println("My id is " + id);
        System.out.println("My name is " + name);
    }
}

public class customClass1_0 {

    public static void main(String[] args) {
        employee ritu = new employee();
        ritu.id = 1;
        ritu.name = "raj";

        // System.out.println(ritu.id);
        ritu.printDetail();
    }
}
