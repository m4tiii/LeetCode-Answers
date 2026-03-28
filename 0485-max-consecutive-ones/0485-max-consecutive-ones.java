class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int ans = 0;
        int tmp = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 1 && i < nums.length - 1){
                tmp+=1;
            }else if(i == nums.length - 1 && nums[i] == 1){
                tmp+=1;
                ans = Math.max(ans, tmp);
                tmp = 0;
            }else{
                ans = Math.max(ans, tmp);
                tmp = 0;
            }
        }


        return ans;
    }
}