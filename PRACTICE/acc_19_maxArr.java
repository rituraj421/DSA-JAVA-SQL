package PRACTICE;

public class acc_19_maxArr {
    static int maxArr(int[] arr) {
        int max = 0;
        int index = 0;
        for (int i = 0; i <= arr.length - 1; i++) {
            if (max < arr[i]) {
                max = arr[i];
                index = i;
            }
        }
        return index;
    }

    public static void main(String[] args) {
        int[] arr = { 23, 45, 82, 27, 66, 12, 78, 13, 71, 86 };
        System.out.println(maxArr(arr));
    }
}
