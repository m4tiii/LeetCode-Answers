class Solution {
    public static int countGoodSubstrings(String s) {
        int count = 0;
        for (int i = 0; i < s.length()-2; i++) {
            String s1 = s.substring(i, i + 3);
            if(s1.charAt(0) != s1.charAt(1) && s1.charAt(0) != s1.charAt(2) && s1.charAt(1) != s1.charAt(2)) {
                count++;
            }
        }
        return count;
    }
}