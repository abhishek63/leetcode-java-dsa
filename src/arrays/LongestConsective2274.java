import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class LongestConsective2274 {

        public int maxConsecutive(int bottom, int top, int[] special) {

            Set<Integer> set = new HashSet<>();

            for(int i = 0 ; i<special.length; i++){
                set.add(special[i]);
            }
            int maxCount = 0;
            int count = 0;
            for(int i = bottom; i<= top; i++){
                if(set.contains(i)){
                    // reset and compare with maxcount and add
                    if(count > maxCount){
                        maxCount = count;
                    }
                    count = 0;
                }else{
                    count++;
                }
            }
            if(count > maxCount){
                maxCount = count;
            }

            return maxCount;

        }

        public int maxConsecutive1(int bottom, int top, int[] special){
            Set<Integer> set = new HashSet<>();
            int max = 0;
            int min = Integer.MAX_VALUE;
            for(int i = 0 ; i<special.length; i++){
                int temp = special[i];
                if(temp > max){
                    max = temp;
                }
                if(temp < min){
                    min = temp;
                }
                set.add(special[i]);
            }
            int maxCount = 0;
            int count = 0;


            for(int i = min; i<= max; i++){
                if(set.contains(i)){
                    // reset and compare with maxcount and add
                    if(count > maxCount){
                        maxCount = count;
                    }
                    count = 0;
                }else{
                    count++;
                }
            }
            if(count > maxCount){
                maxCount = count;
            }

            maxCount = Integer.max(maxCount, min - bottom);
            maxCount = Integer.max(maxCount, top - max);

            return maxCount;

        }

    public int maxConsecutive2(int bottom, int top, int[] special) {
        Arrays.sort(special);
        int max = 0;
        int j = bottom;

        for(int i = 0 ; i<special.length; i++){
            int diff = special[i] - j - 1;
            if(diff > max){
                max = diff;
            }
            j = special[i];
        }
        max = Integer.max(max, top - j - 1);

        return max;

    }

    public static void main(String[] args) {

            LongestConsective2274 longestConsective2274 = new LongestConsective2274();
            int []arr = {7,6,8};
             int res = longestConsective2274.maxConsecutive2(6,8, arr );
        System.out.println(res);
    }
}
