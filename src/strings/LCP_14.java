public class LCP_14 {

    // focus on editorial as well

    public static void main(String[] args) {

        String [] strs = {"ab", "ab"};

        System.out.println(strs[1].indexOf("ab")) ;

        String result = LCP_14.longestCommonPrefix(strs);
        System.out.println(result);

    }
    public static String longestCommonPrefix(String[] strs) {

        String result = strs[0];

        for(int i = 0; i< strs.length ; i++){
            String first = strs[i];
            String temp = "";
            for(int j = 0 ; j < first.length() && j<result.length(); j++){
                if(first.charAt(j) == result.charAt(j)){
                    temp += first.charAt(j);
                }else{
                    if(temp.length() < result.length()){
                        result = temp;
                    }
                    break;
                }
            }
            result = temp;

        }
        return result;
    }

}
