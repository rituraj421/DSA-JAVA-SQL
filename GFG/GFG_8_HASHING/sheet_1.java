package GFG_8_HASHING;

import java.util.Arrays;
import java.util.HashMap;
// import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class sheet_1 {
    static void countDist(int[] arr) {
        HashSet<Integer> hs = new HashSet<>();
        for (int i = 0; i < arr.length; i++) {
            hs.add(arr[i]);
        }
        System.out.println(hs.size());
    }

    // count frequency
    static void frequency(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            boolean flag = false;
            for (int j = 0; j < i; j++) {
                if (arr[i] == arr[j]) {
                    flag = true;
                    // break;
                }
            }
            if (flag == true) {
                continue;
            }
            int count = 1;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    count++;
                }
            }
            System.out.println(arr[i] + ", " + count);
        }
    }

    // count frequency using efficient approach(HashMap)
    static void frequency1(int[] arr) {
        Map<Integer, Integer> hmp = new HashMap<Integer, Integer>();
        // Map<Integer, Integer> hmp = new HashMap<Integer, Integer>();
        for (int i = 0; i < arr.length; i++) {
            // int key = arr[i];
            if (hmp.containsKey(arr[i]) == true)
                hmp.put(arr[i], hmp.get(arr[i]) + 1);
            else
                hmp.put(arr[i], 1);
        }

        for (Map.Entry<Integer, Integer> itr : hmp.entrySet())
            System.out.println(itr.getKey() + " " + itr.getValue());
    }

    // intersection of two arrays
    static void intersection(int[] arr1, int[] arr2) {
        for (int i = 0; i < arr1.length; i++) {
            for (int j = 0; j < arr2.length; j++) {
                if (arr1[i] == arr2[j]) {
                    System.out.println(arr1[i]);
                }
            }
        }
    }

    // efficient approach using hashSet
    static void intersection1(int[] arr1, int[] arr2) {
        HashSet<Integer> hsh = new HashSet<>();
        for (int num : arr2) {
            hsh.add(num);
        }
        for (int i = 0; i < arr1.length; i++) {
            if (hsh.contains(arr1[i])) {
                System.out.print(arr1[i] + " ");
            }
            System.out.println();
        }
    }

    // union of two unsorted arrays
    static void union(int[] A, int[] B){
        HashSet<Integer> hsh = new HashSet<>();
        int a = A.length; 
        int b = B.length;
        int[] ans = new int[a+b];
        for(int i = 0; i<a; i++){
            ans[i] +=A[i];
        }
        for(int i = 0; i<b; i++){
            ans[i+a] +=B[i];
        }
        for(int num : ans){
            // System.out.print(num +" ");
            hsh.add(num);
        }
        System.out.println(hsh);
        // for
    }
    // subArray with zero sum
    static boolean subArray(int[] arr){
        for(int i = 0; i<arr.length; i++){
            int sum = 0;
            for(int j = i; j<arr.length; j++){
                sum+=arr[j];
                if(sum == 0){
                    return true;
                }
            }
        }
        return false;
    }
    // more than n/k occurances
    // static void occur(int[] arr, int k){
    //     Arrays.sort(arr);
    //     int count = 0;
    //     for(int i = 1; i<arr.length; i++){
    //         if(arr[i] == arr[i-1]){
    //             count++;
    //         }
    //         if(count>arr.length/k){
    //             System.out.println(arr[i]);
    //         }
    //     }
    // }
    // efficient approach using hashMap
    static void occurHsh(int[] arr, int k){
        HashMap<Integer, Integer> hsm = new HashMap<>();
        for(int x: arr){
            hsm.put(x, hsm.getOrDefault(x, 0)+1);
        }
        for(Map.Entry <Integer,Integer> e:hsm.entrySet())
            if(e.getValue()>arr.length/k)
                System.out.print(e.getKey()+" ");
    }
    public static void main(String[] args) {
        // basic hashmap
        // HashMap<String, Integer> m = new HashMap<>();
        // m.put("ritu", 1);
        // m.put("raj", 2);
        // m.put("roj", 3);

        // System.out.println(m);
        // System.out.println(m.size());

        // Q1 count distinct elements
        // int[] arr = { 10, 20, 10, 20, 30 };
        // countDist(arr);
        // int[] arr = { 1, 2, 2, 3, 4, 4, 4, 5, 5, 5 };
        // frequency(arr);

        // frequency1(arr);

        int[] arr1 = { 10, 20, 30 };
        int[] arr2 = { 30, 20 };
        // intersection(arr1, arr2);

        // intersection1(arr1, arr2);

        int[] A = {1,2,3,4};
        int[] B = {4,6,7};
        // union(A, B);

        // sunArray
        // int[] arr = {4,-3, 2,1};
        // System.out.println(subArray(arr));

        // n/k occurances
        int[] arr = {10,10,20,30,20,10,10};
        // occur(arr, 2);
        occurHsh(arr, 2);
    }
}
