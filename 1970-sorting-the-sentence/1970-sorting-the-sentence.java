class Solution {
   public static String sortSentence(String s) {
        String[] words = s.split(" ");
        String[] sortedWords = new String[words.length];
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < words.length; i++) {
            sortedWords[words[i].charAt(words[i].length() - 1) - '1'] = words[i].substring(0, words[i].length() - 1);
        }
        for (int i = 0; i < sortedWords.length - 1; i++) {
            result.append(sortedWords[i]);
            result.append(" ");
        }
        result.append(sortedWords[sortedWords.length - 1]);
        return result.toString();
    }
}