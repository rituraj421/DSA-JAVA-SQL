package Love_SDE_Sheet;

import java.util.Arrays;

public class l_sde_3_arraySubsetofAnotherArray {
    static String subset(int[] arr1, int[] arr2) {
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        int index = 0;
        int i = 0;
        int j = 0;
        while (i < arr1.length && j < arr2.length) {
            if (arr1[i] == arr2[j]) {
                i++;
                j++;
                index++;
            } else if (arr1[i] < arr2[j]) {
                i++;
            } else {
                j++;
            }
        }
        if (index == arr2.length) {
            return "Yes";
        } else {
            return "No";
        }
    }

    public static void main(String[] args) {
        int[] arr1 = { 11, 7, 1, 13, 21, 3, 7, 3 };
        int[] arr2 = { 11, 3, 7, 1, 7 };
        System.out.println(subset(arr1, arr2));
    }

}
