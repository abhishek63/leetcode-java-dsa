import java.util.HashSet;
import java.util.Set;

public class LongestConsecutiveSeq {

    private int longestConsecutive(int[] nums) {

        Set<Integer> set = new HashSet<>();

        for(int num : nums){
            set.add(num);
        }
        int res = 0;
        for(int num: nums){
            int count = 0;
            while(set.contains(num)){
               count++;
               num++;
            }
            if(res < count){
                res = count;
            }
        }

        return res;
    }

    // No tle approach is compare with prev no suppposed to
    private int longestConsecutive1(int[] nums) {

        Set<Integer> set = new HashSet<>();

        for (int num : nums) {
            set.add(num);
        }

        int res = 0;
        for (int num : set) {
            if (!set.contains(num - 1)) {
                int j = num;
                while (set.contains(j)) {
                    j++;
                }
                if (res < j-num) {
                    res = j-num;
                }
            }
        }
            return res;
        }




    public static void main(String[] args) {
        LongestConsecutiveSeq longestConsecutiveSeq = new LongestConsecutiveSeq();
        int[] nums = {100,4,200,1,3,2};
        System.out.println(longestConsecutiveSeq.longestConsecutive1(nums));
    }
}
