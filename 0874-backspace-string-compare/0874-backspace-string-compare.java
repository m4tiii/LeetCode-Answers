class Solution {
    public boolean backspaceCompare(String s, String t) {
        Deque<Character> sChar = new ArrayDeque<>();
        Deque<Character> tChar = new ArrayDeque<>();

        for (char c : s.toCharArray()){
            if(c == '#' && !sChar.isEmpty()){
                sChar.pop();
            }else if(c != '#'){
                sChar.addFirst(c);
            }
        }
        for (char c : t.toCharArray()){
            if(c == '#'&& !tChar.isEmpty()){
                tChar.pop();
            }else if(c != '#'){
                tChar.addFirst(c);
            }
        }
        if (Arrays.equals(sChar.toArray(), tChar.toArray()) || (sChar.isEmpty() && tChar.isEmpty())){
            return true;
        }


        return false;
    }
}