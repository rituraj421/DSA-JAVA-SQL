package BASICS;

interface Bicycle {
    void applyBrake(int decrement);

    void speedUp(int increment);
}

class avonCycle implements Bicycle {
    void blowHorn() {
        System.out.println("pee pee po po..");
    }

    public void applyBrake(int decrement) {
        System.out.println("applying brake");
    }

    public void speedUp(int increment) {
        System.out.println("Applying speedUp");
    }
}

public class interfaces {
    public static void main(String[] args) {
        avonCycle ac = new avonCycle();
        ac.applyBrake(40);
    }
}