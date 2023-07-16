package PRACTICE;

// create a class employee
class emp{
    int salary;
    String name;

    public int getSalary(){
        return salary;
    }
    public String getName(){
        return name;
    }
    public void setName(String n){
       name = n;
    }
}

// create a class celphone 
class cell{
    String tune;

    public void rin(){
        System.out.println("ringing.....");
    }
    public void vib(){
        System.out.println("vubratingg....");
    }
}

// create a class square

class squ{
    int side;
    // public void len(int a){
    //     side = a;
    // }
    public int area(){
        return side*side;
    }
    public int perimeter(){
        return 4*side;
    }
}

// repeate above for a rectangle
class rec{
    int length;
    int breadth;

    public int area(){
        return length * breadth;
    }
    public int perimeter(){
        return (2*(length + breadth));
    }
}
public class II_2_Opps {
    public static void main(String[] args) {
        // emp ritu = new emp();
        // ritu.name = "rituraj";
        // ritu.salary = 900000;
        // System.out.println(ritu.name);
        // System.out.println(ritu.salary);

        // cell sam = new cell();
        // sam.rin();
        // sam.vib();

        // squ dabba = new squ();
        // dabba.side = 4;
        // System.out.println(dabba.area()); 
        // System.out.println(dabba.perimeter());

        rec rect = new rec();
        rect.length = 4;
        rect.breadth = 5;
        System.out.println(rect.area());
        System.out.println(rect.perimeter());
    }
}
