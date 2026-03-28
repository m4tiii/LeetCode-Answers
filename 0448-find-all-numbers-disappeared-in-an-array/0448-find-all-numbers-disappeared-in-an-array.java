class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        int[] count = new int[nums.length + 1];
        List<Integer> ans = new ArrayList<>();

        for (int num : nums){
            count[num]++;
        }

        for (int i = 1; i < count.length; i++){
            if(count[i] == 0){
                ans.add(i);
            }
        }
        
        return ans;
    }
}