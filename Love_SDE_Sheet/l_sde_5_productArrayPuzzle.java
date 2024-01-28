package Love_SDE_Sheet;

public class l_sde_5_productArrayPuzzle {
    static void productPuzzle(int[] arr) {
        long[] ans = new long[arr.length];
        long product = 1;
        int count = 0;
        int zeroIndex = -1;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != 0) {
                product *= arr[i];
            } else {
                count++;
                zeroIndex = i;
            }
        }
        if (count > 1) {
            return;
        }
        if (count == 1) {
            ans[zeroIndex] = product;
        } else {
            for (int i = 0; i < arr.length; i++) {
                ans[i] = product / arr[i];
            }

        }
        for (int i = 0; i < ans.length; i++) {
            System.out.print(ans[i] + " ");
        }
        System.out.println();
        System.out.println(product);
    }

    public static void main(String[] args) {
        int[] arr = { 1, 0 };
        productPuzzle(arr);
    }
}
