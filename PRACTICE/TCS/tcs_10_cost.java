package PRACTICE.TCS;

import java.util.ArrayList;
import java.util.Arrays;

public class tcs_10_cost {
    static void cost(double fare, int[] arr, String[] stops, String source, String destination) {
        // int indexxx = 0;
        // for(int i = 0; i<stops.length; i++){
        // if(stops[i]==source){
        // indexxx = i;
        // }
        // }
        // System.out.println(indexxx);

        ArrayList<String> stop = new ArrayList<>(Arrays.asList(stops));
        int index1 = stop.indexOf(source);
        int index2 = stop.indexOf(destination);
        System.out.println(index1);
        System.out.println(index2);
        int distance = 0;
        double cost = 0;
        for (int i = index2; i <= index1; i++) {
            distance += arr[i];
        }
        cost = (distance * 0.005);
        System.out.println(distance);
        System.out.println(cost);

    }

    public static void main(String[] args) {
        String[] stops = { "TH", "GA", "IC", "HA", "TE", "LU", "NI", "CA" };
        int[] arr = { 800, 600, 750, 900, 1400, 1200, 1100, 1500 };
        String source = "NI";
        String destination = "HA";
        cost(5, arr, stops, source, destination);
    }
}
