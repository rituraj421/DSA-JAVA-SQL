package BASICS;

abstract class Pen {
    abstract void write();

    abstract void refill();
}

class Monkey {
    void jump() {
        System.out.println("monkey is jumping ");
    }

    void bite() {
        System.out.println("monkeys doesnt bite , it's a misconception");
    }
}

class fountainPen extends Pen {
    void write() {
        System.out.println("write bro");
    }

    void refill() {
        System.out.println("refill");
    }

    void changeNip() {
        System.out.println("changing nip");
    }
}

class human extends Monkey {
    void speak() {
        System.out.println("Hey , yeah we humans can speak");
    }
}

public class practiceSet11_OOPS {
    public static void main(String[] args) {
        fountainPen p = new fountainPen();
        p.changeNip();

        human mm = new human();
        mm.jump();
        mm.speak();
    }
}