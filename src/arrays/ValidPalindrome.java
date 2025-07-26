/**
 * Problem: https://neetcode.io/problems/is-palindrome?list=neetcode150
 * Approach: HashMap to store complement
 */
public class ValidPalindrome {

     private boolean isPalindrome(String s) {

        String str = s.replaceAll("[^a-zA-Z0-9]","").toLowerCase();
        int i = 0;
        int j = str.length()-1;

        while(i<j){
            if(str.charAt(i) == str.charAt(j)){
                i++;
                j--;
            }else{
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
         ValidPalindrome validPalindrome = new ValidPalindrome();
         String s = "Was it a car or a cat I saw?";
         System.out.println(validPalindrome.isPalindrome(s));
    }
}
