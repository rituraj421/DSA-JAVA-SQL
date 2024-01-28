package BASICS;

class myThr extends Thread {
    public myThr(String name) {
        super(name);
    }

    public void run() {
        int i = 0;
        while (i < 3) {
            System.out.println("Im a Thr");
            i++;
        }
    }
}

public class threadConstructor {
    public static void main(String[] args) {
        myThr t = new myThr("rituraj");
        t.start();
        // System.out.println("The id of the thread is " + t.getId());
        System.out.println("The name of the threAD IS " + t.getName());
    }
}
