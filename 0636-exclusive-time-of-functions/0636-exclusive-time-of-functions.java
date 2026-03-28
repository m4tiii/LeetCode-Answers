class Solution {
    public int[] exclusiveTime(int n, List<String> logs) {
        int[] ans = new int[n]; 
        Deque<Integer> stack = new ArrayDeque<>();
        int prevTime = 0;

        for (String logStr : logs) {
            Log log = parseLog(logStr);

            if (log.type().equals("start")) {
                if (!stack.isEmpty()) {
                    ans[stack.peek()] += log.timestamp() - prevTime;
                }
                stack.push(log.id());
                prevTime = log.timestamp();
            } else {
                ans[stack.pop()] += log.timestamp() - prevTime + 1;
                prevTime = log.timestamp() + 1;
            }
        }

        return ans;
    }
    
    private record Log(int id, String type, int timestamp) {}

    private Log parseLog(String s) {
        String[] parts = s.split(":");
        return new Log(
                Integer.parseInt(parts[0]),
                parts[1],
                Integer.parseInt(parts[2])
        );
    }
}