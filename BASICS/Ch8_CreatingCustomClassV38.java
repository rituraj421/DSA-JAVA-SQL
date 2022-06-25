package com.company;
class Employee1{
    int salary;
    int id;
    String name;
    public void printDetails(){
        System.out.println("My id is " + id);
        System.out.println("My name is " + name);
        System.out.println("& My salary is " + salary);
    }
}

public class Ch8_CreatingCustomClassV38 {
    public static void main(String[] args) {
        System.out.println("this is our custom class");
        Employee ritu = new Employee();

        Employee raman = new Employee();

        //setting attributes for ritu
        ritu.id = 7;
        ritu.name = "ritu";
        ritu.salary = 60000;

        //setting attributes for raman

        raman.id = 8;
        raman.name = "raman";

        ritu.printDetails();

        raman.printDetails();
        // System.out.println(ritu.id);
        // System.out.println(ritu.name);
    }
}
