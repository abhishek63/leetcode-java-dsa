
/**
 * Problem: https://neetcode.io/problems/three-integer-sum?list=neetcode150
 * Approach: HashMap to store the additon of complement of i+j that is -k
 *  arr[i] + arr[j] + arr[k] = 0
 *  arr[k] = - (arr[i] + arr[j])
 */

import java.util.*;

public class ThreeSum {
    public List<List<Integer>> threeSum(int[] nums) {

        Set<List<Integer>> set = new HashSet<>();

        for(int i = 0 ; i<nums.length; i++){
            Map<Integer,Integer> hashmap = new HashMap<>();
            for(int j= i+1; j<nums.length; j++){
                int k = -(nums[i]+nums[j]);
                if(hashmap.containsKey(k)){
                    List<Integer> list = new ArrayList<>();
                    list.add(nums[i]);
                    list.add(nums[j]);
                    list.add(k);
                    Collections.sort(list);
                    set.add(list);
                }else{
                    hashmap.put(nums[j],j);
                }

            }
        }

        List<List<Integer>> result = new ArrayList<>(set);
        System.out.println(result);
        return result;

    }

    public static void main(String[] args) {
        ThreeSum threeSum = new ThreeSum();
        int[] nums = {-1,0,1,2,-1,-4};
        threeSum.threeSum(nums);
    }
}

