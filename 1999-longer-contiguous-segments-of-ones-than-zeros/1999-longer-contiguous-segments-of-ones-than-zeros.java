class Solution {
     public static boolean checkZeroOnes(String s) {
        int countZ = 0;
        int countO = 0;
        int tmpZ = 0;
        int tmpO = 0;

        for(char c : s.toCharArray()) {
            if(c == '0') {
                tmpZ++;
                tmpO = 0;
                countZ = countZ < tmpZ ? tmpZ : countZ;
            }else{
                tmpO++;
                tmpZ = 0;
                countO = countO < tmpO ? tmpO : countO;
            }
        }
        
        return countO > countZ;
    }
}