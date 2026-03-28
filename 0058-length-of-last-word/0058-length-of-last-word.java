class Solution {
    public int lengthOfLastWord(String s) {
        int k = 0;

        for(int i = s.length() - 1; i >= 0; i--){
            if(s.charAt(i) == ' ' && k == 0){
               continue;
            }

            if(s.charAt(i) != ' '){
                k++;
            }
            else{
                break;
            }
        }
        return k;
    }
}