package BASICS;

public class methodsInJava {
    // WE CAN ONLY CALL STATIC METHOD FROM A STATIC METHOD 
    // add static before int and remove "methodsInJava obj = new methodsInJava();"
    static int logic(int x, int y){
        int z ;
        if(x>y){
            z = x+y;
        }
        else{
            z = (x+y)*5;
        }
        return z;
    }
    public static void main(String[] args) {

        //alternate method if we dont want to use static keyword

        int a = 5;
        int b = 7;
        int c ;
        c = logic(a, b);
        // methodsInJava obj = new methodsInJava();
        // c = obj.logic(a, b);

        int a1 = 4;
        int b1 = 1;
        int c1;
        c1 = logic(a1, b1);
        System.out.println(c);
        System.out.println(c1);
    }
}