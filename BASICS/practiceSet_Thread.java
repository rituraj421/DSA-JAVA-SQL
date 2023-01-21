package BASICS;

// write a program to print good morning and welcome continiouosly on the screen in java using threads

class pr13 extends Thread {
    public void run() {
        while (true) {
            try {
                Thread.sleep(200);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("good morning ser");
        }
    }
}

class pr13b extends Thread {
    public void run() {
        while (true) {
            // try {
            // Thread.sleep(200);
            // } catch (InterruptedException e) {
            // e.printStackTrace();
            // }
            System.out.println("welcome ser!!");
        }
    }
}

public class practiceSet_Thread {
    public static void main(String[] args) {
        pr13 p1 = new pr13();
        p1.setPriority(5);

        pr13b p2 = new pr13b();
        p2.setPriority(2);
        p1.start();
        p2.start();
    }
}