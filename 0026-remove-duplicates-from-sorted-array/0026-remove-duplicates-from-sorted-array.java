class Solution {
   public static int removeDuplicates(int[] nums) {

        int activeNum = nums[0];
        int k = 1;
        for (int i = 1; i < nums.length; i++) {
            if (activeNum != nums[i]) {
                activeNum = nums[i];
                nums[k] = activeNum;
                k+=1;
            }
        }

        return k;
    }
}