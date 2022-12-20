package CLG;

import java.util.*;

class rituraj {
    static class Job { // function for declaration
        int st, ed, profit;

        Job(int st, int ed, int profit) {
            this.st = st;
            this.ed = ed;
            this.profit = profit;
        }
    }

    static int overlap(Job arr[], int i) { // function for detecting the time overlap
        for (int j = i - 1; j >= 0; j--) // i stores start times j stores ed times
        {
            if (arr[j].ed <= arr[i - 1].st)
                return j;
        }
        return -1; // when no compatible value is found
    }

    static int sortMaxPro(Job arr[], int n) { // a reccursive function is used which finds the maximum profit value.

        if (n == 1)
            return arr[n - 1].profit; // if return value=1 then we consider the profit of n-1 th value.
                                      // in thi we are considering the current job
        int incl = arr[n - 1].profit;
        int i = overlap(arr, n);
        if (i != -1) // if return value=-1 then we nth value.
                     // in this we are not considering the current value.
            incl += sortMaxPro(arr, i + 1);
        int excl = sortMaxPro(arr, n - 1);
        return Math.max(incl, excl);
    }

    static int findMaxProfit(Job arr[], int n) { // function to find max profit.
        Arrays.sort(arr, new Comparator<Job>() { // used an inbuilt function comaparator to compare two jobs

            public int compare(Job j1, Job j2) {
                return j1.ed - j2.ed; // Sorting according to ed time.
            }
        });
        return sortMaxPro(arr, n);
    }

    public static void main(String args[]) {
        int m = 4;
        Job arr[] = new Job[m];
        arr[0] = new Job(900, 1030, 100);
        arr[1] = new Job(1000, 1200, 50);
        arr[2] = new Job(1100, 1200, 100);
        arr[3] = new Job(1500, 1530, 200);
        int n = arr.length;
        System.out.println("The maximum possible profit is " + findMaxProfit(arr, n));
    }
}
