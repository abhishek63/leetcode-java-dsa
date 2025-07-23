/**
 * Problem: https://leetcode.com/problems/two-sum/
 * Approach: HashMap to store complement
 */
import java.util.*;

public class TwoSum {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int comp = target - nums[i];
            if (map.containsKey(comp)) {
                return new int[]{map.get(comp), i};
            }
            map.put(nums[i], i);
        }
        return new int[0]; // No solution found
    }

    public static void main(String[] args) {
        System.out.println("Hello world");
    }
}
