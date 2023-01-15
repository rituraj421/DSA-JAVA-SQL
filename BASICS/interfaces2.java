package BASICS;

interface sampleInterface {
    void meth1();

    void math2();
}

interface childSampleInterface extends sampleInterface {
    void meth3();

    void meth4();
}

class mySampleClass implements childSampleInterface {
    public void meth1() {
        System.out.println("meth1");
    }

    public void math2() {
        System.out.println("math2");
    }

    public void meth3() {
        System.out.println("meth3");
    }

    public void meth4() {
        System.out.println("meth4");
    }
}

public class interfaces2 {
    public static void main(String[] args) {
        mySampleClass ms = new mySampleClass();
        ms.meth1();
    }
}