package PRACTICE.TCS;

public class tcs_11_monkey {
    static void monkey(int nMonkey, int eatBanana, int eatPeanut, int bananaAvail, int peanutAvail) {
        int remaining1 = 0;
        int remaining2 = 0;
        if (bananaAvail % eatBanana == 0) {
            remaining1 += nMonkey - (bananaAvail / eatBanana);
        }
        if (peanutAvail % eatPeanut == 0) {
            remaining2 += nMonkey - (peanutAvail / eatPeanut);
        }
        // System.out.println(remaining1);
        // System.out.println(remaining2);
        System.out.println((nMonkey - remaining1) + (nMonkey - remaining2));
    }

    public static void main(String[] args) {
        int nMonkey = 20;
        int eatBanana = 2;
        int eatPeanut = 3;
        int bananaAvail = 12;
        int peanutAvail = 12;
        monkey(nMonkey, eatBanana, eatPeanut, bananaAvail, peanutAvail);
    }
}
