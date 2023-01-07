package BASICS;

class any{
    int a;

    public int getA(){
        return a;
    }

    any(int v){
        this.a = v;
    }
    
    public int returnOne(){
        return 1;
    }
}
public class thisSuper {
    public static void main(String[] args) {
        any a = new any(5);
        System.out.println(a.getA());
    }
}