package BASICS;

class Base{
    int x;

    public int getX(){
        return x;

    }

    public void getX(int x){
        this.x = x;
    }

    public void setX(int i) {
    }

    public void printMe(){
        System.out.println("Im a constructor");
    }
}

class Derived extends Base{
    int y;

    public int getY(int Y){
        return Y;
    }
}

public class Ch10_InheritanceV45 {
    public static void main(String[] args) {
        Base b = new Base();
        b.setX(4);
        System.out.println(b.getX());
    }
    
}
