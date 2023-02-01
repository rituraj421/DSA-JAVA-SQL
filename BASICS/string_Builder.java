package BASICS;

public class string_Builder {
    public static void main(String[] args) {
        
        char[] cha = {'f', 'r'};
        String s = new String(cha);
        System.out.println(s);

        byte[] b = {1,2,3,4,5,6}; // output = ☺☻♥♦♣C
        String bs = new String(b);
        System.out.println(bs);
        System.out.println(bs.isEmpty());

      

    }
}
