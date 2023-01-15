package BASICS;

interface Camera {
    void takeSnap();

    void recordVideo();

    default void record4kVidoe() {
        System.out.println("Recording in 4k");
    }
}

interface Wifi {
    String[] getNetworks();

    void connectToNetwork(String network);
}

class cellPhonee {
    void callNumber(int phoneNumber) {
        System.out.println("calling " + phoneNumber);
    }

    void pickCall() {
        System.out.println("connecting..t ");
    }

}

class smartPhonee extends cellPhonee implements Wifi, Camera {
    public void takeSnap() {
        System.out.println("Taking snap..");
    }

    public void recordVideo() {
        System.out.println("recording video..");
    }

    public String[] getNetworks() {
        System.out.println("Getting list of networks");
        String[] networkList = { "ritu", "bannu" };
        return networkList;
    }

    public void connectToNetwork(String network) {
        System.out.println("Connecting to " + network);
    }
}

public class interfaces1 {
    public static void main(String[] args) {

        smartPhonee ms = new smartPhonee();
        smartPhonee ts = new smartPhonee();
        ts.takeSnap();
        ms.record4kVidoe();
        String[] ar = ms.getNetworks();
        for (String item : ar) {
            System.out.println(item);
        }
    }
}