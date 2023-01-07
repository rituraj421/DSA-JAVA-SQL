package coreJavaBook;

public class welcome {
    public static void main(String[] args){

        String[] greeting = new String[3];
        greeting[0] = "Welcome to Core java ";
        greeting[1] = "by Cay Horstmann ";
        greeting[2] = "and Gary Cornel";

        int[] num = new int[3];
        num[0] = 0;
        num[2] = 2;
        num[1] = 1;

        for (int i: num)
        System.out.println("The desired number arrays are :" + i);

        for(String g: greeting)
        System.out.print(g);
    }
}
