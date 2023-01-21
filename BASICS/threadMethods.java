package BASICS;

class myThr2 extends Thread {
    public void run() {
        int i = 0;
        while (i < 10) {
            System.out.println("Im a Thr ");
            i++;
        }
    }
}

class myThr3 extends Thread {
    public void run() {
        // int i = 0;
        while (true) {
            System.out.println("Im a Thrrrrrrrrrr ");
            // i++;
        }
    }
}

public class threadMethods {
    public static void main(String[] args) {
        myThr2 t1 = new myThr2();
        myThr3 t2 = new myThr3();
        t1.start();
        try {
            t1.join();
        } catch (Exception e) {
            System.out.println(e);
        }
        t2.start();
    }
}