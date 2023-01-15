package BASICS;

interface Camera2 {
    void takeSnap();

    void recordVideo();

    // private void greet() {
    //     System.out.println("Good morning!");
    // }

    default void record4kVidoe() {
        System.out.println("Recording in 4k");
    }
}

interface Wifi2 {
    String[] getNetworks();

    void connectToNetwork(String network);
}

class cellPhonee2 {
    void callNumber(int phoneNumber) {
        System.out.println("calling " + phoneNumber);
    }

    void pickCall() {
        System.out.println("connecting..t ");
    }

}

class smartPhonee2 extends cellPhonee2 implements Wifi2, Camera2 {
    public void takeSnap() {
        System.out.println("Taking snap..");
    }

    public void recordVideo() {
        System.out.println("recording video..");
    }

    public String[] getNetworks() {
        System.out.println("Getting list of networks");
        String[] networkList2 = { "ritu", "bannu" };
        return networkList2;
    }

    public void connectToNetwork(String network) {
        System.out.println("Connecting to " + network);
    }

}

public class polymorphism {
    public static void main(String[] args) {
        Camera2 cam1 = new smartPhonee2();
        cam1.takeSnap();

        smartPhonee2 s = new smartPhonee2();
        s.callNumber(0);
        s.connectToNetwork("rituraj");
        s.takeSnap();
    }
}