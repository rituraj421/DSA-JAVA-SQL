package PRACTICE.OOPS_1;

class student {
    int marks;
    String name;
    int roll;

    student(){
        // this.marks = 1;
        // this.name = "rit";
        // this.roll = 2;

        // calling constructor inside other constructor
        this(0, "rituo", 7);
    }
    // below is the parameterised constructor of the above class "student"
    student( int marks, String name, int roll){
        this.marks = marks;
        this.name = name;
        this.roll = roll;
    }
    
}

public class oops_1 {
    public static void main(String[] args) {
        student rt = new student(); // when an object of a class is created , then we say that the class is instantiated
        student rti = new student(0, null, 0);
        // rt.marks = 90;
        // rt.name = "rituraj";
        // rt.roll = 1;
        System.out.println(rti.marks +" "+ rt.roll +" "+ rt.name);

        student gbu = new student();
        System.out.println(gbu.name);
    }
}
