package BASICS;

public class Ch7_OverloadingInJavaV32 {
    static void foo(){
        System.out.println("Gud Mrng bhai");
    }
    static void foo(int c){
        System.out.println("Gud Mrng" + c + "bhai");
    }
    static void change(int a){
        a = 98;
    }
    static void change2(int [] arr){
        arr[0] = 98;
    }
    static void tellJoke(){
        System.out.println("I Invented a new world\n" + "plagiarism");

    }
    public static void main(String[] args) {
        //tellJoke();
        int [] marks = {52, 73, 77, 89, 98, 94};
        //case 2 changing the integer

        change2(marks);

        System.out.println("the value of x after running is: " +marks[0]);

        //case 1 changing the integer
        //int x = 45;
        //change(x);
        //System.out.println("the value of x after running is: " +x);

        //method overloading
        foo();
        //foo(c:3000);
    }
}

