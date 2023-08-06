package PRACTICE.TCS;

public class tcs_8_washing {
    static void wash(int n) {
        if (n <= 2000) {
            System.out.println("Estemeted time is 25 min");
        }
        if (n > 2000 && n <= 4000) {
            System.out.println("Estimated time is 35 min");
        }
        if (n > 4000 && n <= 7000) {
            System.out.println("Estimeted time is 45 min");
        } 
        else {
            System.out.println("Invalid input ");
        }
    }

    public static void main(String[] args) {
        int n = 8000;
        wash(n);
    }
}
