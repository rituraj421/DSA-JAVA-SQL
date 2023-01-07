package leetcode.ARRAY.Easy;

import java.util.HashSet;
import java.util.Set;

class Solution {
    public boolean containsDuplicate217(int[] nums) {
        Set<Integer> seen = new HashSet<>();

    for (int num : nums) {
        if (seen.contains(num)) {
            return true; // We have seen this value before, so it appears at least twice
        }
        seen.add(num); // Mark this value as seen
    }

    return false;
    }
}
// To find out if any value appears at least twice in an array of integers, you can use a HashSet to keep track of the values that have been seen so far. A HashSet is a data structure that stores a collection of elements in a way that allows you to quickly check if an element is already in the set or not.
