package com.company;

class Employee{
    int salary;
    String Name;

    public int getSalary(){
    return salary;

}
    public String getName(){
    return Name;
}
    public void setName(String n){
    Name = n;
}
}
class CellPhone{
    public void ring(){
        System.out.println("Ringing......");
    }
}



public class Ch8_practiceSetV39 {
    public static void main(String[] args) {
        //problem 1
        Employee ritu = new Employee();
        ritu.setName("rituraj");
        System.out.println(ritu.getName());
        ritu.salary = 233;
        System.out.println(ritu.getSalary());
        
        //problem 2

        CellPhone apple = new CellPhone();
        apple.ring();
    }
}
