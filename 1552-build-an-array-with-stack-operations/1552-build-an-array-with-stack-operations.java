class Solution {
    public List<String> buildArray(int[] target, int n) {
        List<String> ans = new ArrayList<>();
        String push = "Push";
        String pop = "Pop";
        int tmp = 1;
        int i = 0;
        while(i < target.length){
            if(tmp == target[i]){
                ans.add(push);
                tmp++;
                i++;
            }else{
                ans.add(push);
                ans.add(pop);
                tmp++;
            }
        }
        return ans;
    }
}