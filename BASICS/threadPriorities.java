package BASICS;

class myThr1 extends Thread {
    public myThr1(String name) {
        super(name);
    }

    public void run() {
        int i = 0;
        while (i < 3) {
            System.out.println("Im a Thr " + this.getName());
            i++;
        }
    }
}

public class threadPriorities {
    public static void main(String[] args) {
        myThr1 t1 = new myThr1("rituraj");
        myThr1 t2 = new myThr1("rituu");
        myThr1 t3 = new myThr1("rituuu");
        myThr1 t4 = new myThr1("rituuuu");
        myThr1 t5 = new myThr1("rituuuuu(MOST IMPORTANT)");
        t5.setPriority(Thread.MAX_PRIORITY);
        t1.setPriority(Thread.MIN_PRIORITY);
        t2.setPriority(Thread.MIN_PRIORITY);
        t3.setPriority(Thread.MIN_PRIORITY);
        t4.setPriority(Thread.MIN_PRIORITY);
        t1.start();
        t2.start();
        t3.start();
        t4.start();
        t5.start();
        // System.out.println("The id of the thread is " + t1.getId());
        // System.out.println("The name of the threAD IS " + t2.getName());
    }
}