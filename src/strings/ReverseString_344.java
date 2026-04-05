public class ReverseString_344 {

    public static void main(String[] args) {
        String string = "hello";
        char [] s = string.toCharArray();
        reverseString(s);
        System.out.println(s);
    }

    static void reverseString(char[] s) {
        int i = 0;
        int j = s.length - 1;
        while(i < j){
            char temp = s[i];
            s[i] = s[j];
            s[j] = temp;
            j--; i++;
        }
    }

}
