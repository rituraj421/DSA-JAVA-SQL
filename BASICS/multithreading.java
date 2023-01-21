package BASICS;

class myThread1 extends Thread {
    public void run() {
        int i = 0;
        while (i <= 10) {
            System.out.println("My thread1 is running");
            System.out.println("Thats ohehk");
            i++;
        }
    }
}

class myThread2 extends Thread {
    public void run() {
        int i = 0;
        while (i <= 10) {
            System.out.println("My thread2 is running");
            System.out.println("Thats ohehk");
            i++;
        }
    }
}

class threadRunnable1 implements Runnable {
    public void run() {
        System.out.println("I am a thread1.1 bullet1");
    }
}

class threadRunnable2 implements Runnable {
    public void run() {
        System.out.println("I am a thread2.1 bullet2");
    }
}

public class multithreading {
    public static void main(String[] args) {
        myThread1 t1 = new myThread1();
        myThread2 t2 = new myThread2();
        t1.start();
        t2.start();

        threadRunnable1 bullet1 = new threadRunnable1();
        Thread gun1 = new Thread(bullet1);
        threadRunnable2 bullet2 = new threadRunnable2();
        Thread gun2 = new Thread(bullet2);

        gun1.start();
        gun2.start();

    }
}