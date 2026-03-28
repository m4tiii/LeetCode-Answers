class Solution {
   public static int lengthOfLongestSubstring(String s) {
    int n = s.length();
    int max = 0;
    int[] lastIndex = new int[128]; 

    for (int left = 0, right = 0; right < n; right++) {
        char current = s.charAt(right);
        left = Math.max(lastIndex[current], left);
        max = Math.max(max, right - left + 1);
        lastIndex[current] = right + 1;
    }
    
    return max;
}
}