public class LongestConsective2177 {

        public long[] sumOfThree(long num) {

            long temp = num-3;
            long firstNo = 0;
            if(temp % 3 == 0){
                firstNo = temp / 3;
            }else{
                return new long[0];
            }
            long res[] = {firstNo , firstNo+1, firstNo+2};
            return res;

        }

    public static void main(String[] args) {

    }
}
