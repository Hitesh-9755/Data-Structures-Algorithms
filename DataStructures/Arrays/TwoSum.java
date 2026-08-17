package DataStructures.Arrays;

import java.util.HashMap;
import java.util.Map;
import java.util.Arrays;

/**
 * Problem: Two Sum
 * Difficulty: Easy
 * Description: Given an array of integers `nums` and an integer `target`,
 * return indices of the two numbers such that they add up to `target`.
 * 
 * Time Complexity: O(N)
 * Space Complexity: O(N)
 */
public class TwoSum {

    public static int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> numMap = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];
            if (numMap.containsKey(complement)) {
                return new int[] { numMap.get(complement), i };
            }
            numMap.put(nums[i], i);
        }
        return new int[] {};
    }

    public static void main(String[] args) {
        int[] nums = { 2, 7, 11, 15 };
        int target = 9;
        int[] result = twoSum(nums, target);
        System.out.println("Input: " + Arrays.toString(nums) + ", Target: " + target);
        System.out.println("Output Indices: " + Arrays.toString(result));
    }
}
