import java.util.*;

public class GroupAnnagram_49 {

    public static void main(String[] args) {
        String str [] = {"eat","tea","tan","ate","nat","bat"};
        GroupAnnagram_49.groupAnagrams(str);
    }

    public static List<List<String>> groupAnagrams(String[] strs) {

        LinkedList<LinkedList<Integer>> freqList = new LinkedList<>();

        List<List<String>> result = new ArrayList<>();

        for(int i = 0 ; i< strs.length ; i++){
            String s = strs[i];
            LinkedList<Integer> freq = new LinkedList<>(Collections.nCopies(26, 0));

            for(int j = 0 ; j < s.length() ; j++){
                char ch = s.charAt(j);
                freq.set(ch - 'a' , freq.get(ch - 'a') + 1);
            }

            freqList.add(freq);
        }
        Set<String> sets = new HashSet<>();

        for(int i = 0; i< strs.length ; i++){
            List<String> strList = new ArrayList<>();
            String str = strs[i];
            if(!sets.contains(str)){
                sets.add(str);
                strList.add(str);
            }else{
                continue;
            }
            List<Integer> freq = freqList.get(i);
            for(int j = i+1; j< strs.length; j++){
                List<Integer> freq1 = freqList.get(j);
                int count = 0;
                for(int k = 0 ; k< 26 ; k++){
                    if(freq.get(k) == freq1.get(k)){
                        count++;
                    }
                }
                if(count == 26){
                    //make set for i and j
                    strList.add(strs[j]);
                    sets.add(strs[j]);
                }
            }
            result.add(strList);
        }
        return result;

    }
}
