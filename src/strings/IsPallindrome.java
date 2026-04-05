public class IsPallindrome {
//      125
        public boolean isPalindrome(String s) {
            String strLow = s.toLowerCase();
            char[] strArr = strLow.toCharArray();
            char[] result = new char[strArr.length] ;

            int count = 0;

            for(int i = 0 ; i<strArr.length ; i++){
                if((strArr[i] >= 'a' && strArr[i] <= 'z' ) || (strArr[i] >= '0' && strArr[i] <= '9')){
                    result[count]= strArr[i];
                    count++;
                }
            }

            // now check pallindrome
            int i = 0;
            int j = count - 1;
            while(i < j){
                if(result[i] != result[j]){
                    return false;
                }
                i++; j--;
            }
            return true;
        }
}
