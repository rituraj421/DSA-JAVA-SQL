package PRACTICE.oReilly;

public class car {

    int avgMPG;
    String licence;
    boolean areTailWorking;

    public car(int avgMPG, String licence,
            boolean areTailWorking) {
        this.avgMPG = avgMPG;
        this.licence = licence;
        this.areTailWorking = areTailWorking;
    }

    public void showDetails(){
        System.out.println("Car Details:");
        System.out.println("Average MPG:"+ avgMPG);
    }
}

class string{
    public string(){
        System.out.println("This is a string class");
    }
}
