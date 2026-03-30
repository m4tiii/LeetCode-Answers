class Solution {
    public String[] sortPeople(String[] names, int[] heights) {
        String tmpName;
        int tmpHeight;
        for (int i = 0; i < names.length; i++) {
            for (int j = i+1; j < names.length; j++) {
                if(heights[i] < heights[j]){
                    tmpName = names[i];
                    tmpHeight = heights[i];
                    names[i] = names[j];
                    heights[i] = heights[j];
                    names[j] = tmpName;
                    heights[j] = tmpHeight;
                }
            }
        }
        return names;
    }
}