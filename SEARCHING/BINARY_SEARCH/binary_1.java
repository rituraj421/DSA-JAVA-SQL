package SEARCHING.BINARY_SEARCH;

public class binary_1 {

    static int binarySearch(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;

        while (start < end) {
            int mid = start + (end - start) / 2; // same as (start+end )/2

            if (target < arr[mid]) {
                end = mid - 1;
            } else if (target > arr[mid]) {
                start = mid + 1;
            } else {
                return mid;
            }
        }
        return -1;
    }

    // binary approach
    // static int rBinarySearch(int[]arr, int target){
    // int start = 0;
    // int end = arr.length-1;

    // int mid = start+end/2;

    // if(arr[mid] == target){
    // return mid;
    // }
    // else if(arr[mid]>target){
    // return rBinarySearch(arr, start, mid-1, target);
    // }
    // else if(arr[mid]<target){
    // return rBinarySearch(arr, mid+1, end,target);
    // }
    // }

    // first occuring index
    static int firstOccur(int[] arr, int x) {
        int start = 0;
        int end = arr.length - 1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (x < arr[mid]) {
                end = mid - 1;
            } else if (x > arr[mid]) {
                start = mid + 1;
            } else {
                return mid;
            }
        }
        return -1;
    }

    // last occuring index
    static int lastOccur(int[] arr, int x, int n) {
        int start = 0;
        int end = arr.length - 1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (arr[mid] < x) {
                start = mid + 1;
            } 
            else if (arr[mid] > x) {
                end = mid - 1;
            } 
            else {
                if (mid == n-1 || arr[mid] != arr[mid + 1]) {
                    return mid;
                } else {
                    start = mid + 1;
                }
            }
        }
        return -1;
    }

    // count occurances
    static int countOccur(int[] arr, int x){
        int count = 0;
        for(int i = 0; i<arr.length; i++){
            if(arr[i] == x){
                count++;
            }
        }
        return count;
    }

    // sqrt of a given number 
    static int sqrt(int n){
        int start = 0;
        int end = n;
        int ans = -1;
        while(start<=end){
            int mid = (start+end)/2;
            int sqrt = mid*mid;
            if(sqrt == n){
                return mid;
            }
            else if (sqrt>n){
                end = mid-1;
            }
            else{
                start = mid+1;
                ans = mid;
            }
        }
        return ans;
    }

    // search in sorted rorated array
    static int sortedRot(int[] arr, int x){
        int start = 0;
        int end = arr.length-1;
        while(start<=end){
            int mid = (start+end)/2;
            if(arr[mid] == x){
                return mid;
            }
            if(arr[start] <=arr[mid]){
                if(x>=arr[start] && x<arr[mid]){
                    end = mid-1;
                }
                else{
                    start = mid+1;
                }
            }
            else{
                if(x>arr[mid] && x<=arr[end]){
                    start = mid+1;
                }
                else{
                    end = mid-1;
                }
            }
        }
        return -1;
    }

    // peak element in an array(iterative approach)
    static int peakEle(int[] arr){
        for(int i = 1; i<arr.length-1;i++){
            if(arr[i]> arr[i+1] && arr[i]>arr[i-1]){
                return arr[i];
            }
        }
        return -1;
    }

    // two pointers approach
    static boolean twoPoi(int[] arr, int X){
        int i = 0;
        int j = arr.length-1;
        while(i<j){
            if(arr[i] + arr[j] == X){
                return true;
            }
            else if(arr[i] + arr[j] >X){
                j--;
            }
            else{
                i++;
            }
        }
        return false;
    }

    // triplet in an given array
    static boolean triplet(int[] arr, int x){
        for(int i = 0; i<arr.length-2; i++){
            for(int j = i+1; j<arr.length-1; j++){
                for(int k = j+1; k<arr.length; k++){
                    if(arr[i] + arr[j] +arr[k] == x){
                        return true;
                    }
                }
            }
        }
        return false;
    }

    // repeating element
    static int repeating(int[] arr){
        boolean[] visited = new boolean[arr.length];
        for(int i = 0; i<arr.length; i++){
            if(visited[arr[i]]){
                return arr[i];
            }
            visited[arr[i]] = true;
        }
        return -1;
    }
    public static void main(String[] args) {
        // int[] arr = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
        // int ans = binarySearch(arr, 9);
        // int target = 9;
        // System.out.println("The target " + target + " is found at index " + ans);

        // int[] arr = {1,10,10,10,20,20};
        // System.out.println(firstOccur(arr, 20));

        // last occurance
        // int[] arr = { 10, 10, 10, 20, 20 };
        // System.out.println(lastOccur(arr, 20, 5));

        // count occurances
        // int[] arr = { 10, 10, 10, 20, 10 };
        // System.out.println(countOccur(arr, 10));

        // sqrt of a given number 
        // System.out.println(sqrt(20));

        // search in a rotated sorted array
        // int[] arr = {10,20,40,60,5,8};
        // System.out.println(sortedRot(arr, 5));

        // peak element (iterative approach)
        // int[] arr = {5,10,20,25,7};
        // System.out.println(peakEle(arr));

        // two pointers
        // int[] arr = {2,5,8,12,30};
        // System.out.println(twoPoi(arr, 17));

        // triplet
        int[] arr = {2,3,5,6,15};
        System.out.println(triplet(arr, 20));

    }
}
