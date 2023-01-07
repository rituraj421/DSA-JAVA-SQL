package BASICS;

public class BreakAndContinue {
    public static void main(String[] args) {
        // break and continue using loop
        for (int i = 0; i<=5; i++){
        if(i==3){
            System.out.println("Ending the loop");
            // break;
            continue;

        }
        System.out.println(i);
        }
    }
}
