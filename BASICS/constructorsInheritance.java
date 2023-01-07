package BASICS;

class Base0{

    Base0(){
       System.out.println("I am a constructor"); 
    }
    public int x;

    public int getX(){
        return x;
    }

    public void setX(int x){
        this.x = x;
    }
}

class Derived0 extends Base0{

    Derived0(){
        System.out.println("I am a derived class constructor");
    }
    public int y;

    public int getY(){
        return y;
    }

    public void setY(int y){
        this.y = y;
    }
}

// class child extends Derived0{
//     child(){
//         System.out.println("I am a child of derived constructor");
//     }

//     child(int x, int y, int z){
//         super(x, y)
//         System.out.println("I m an overloaded constructor of derived");
//     }
// }
public class constructorsInheritance {
    public static void main(String[] args) {
        Base0 b = new Base0();
        Derived0 d0 = new Derived0();
    }
}
