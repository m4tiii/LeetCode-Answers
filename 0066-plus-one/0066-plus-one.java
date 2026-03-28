import java.math.BigInteger;

class Solution {
        public static int[] plusOne(int[] digits) {
        int l = digits.length - 1;
        int[] newDigits = new int[digits.length + 1];

        if(digits[l] != 9){
            digits[l]++;
            return digits;
        }else{
            int i = l;
           while(i >= 0){
               if(digits[i] == 9 && i > 0){
                   digits[i] = 0;
               } else if (digits[i] == 9 && i == 0) {
                   newDigits[0] = 1;
                   System.arraycopy(digits, 0, newDigits, 1, i);
                   return newDigits;
               }else{
                   digits[i]++;
                   return digits;
               }


               i--;
           }
        }

        return digits;

    }
}
