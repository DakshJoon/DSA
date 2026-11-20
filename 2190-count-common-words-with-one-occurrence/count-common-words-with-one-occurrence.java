class Solution {
    public int countWords(String[] words1, String[] words2) {
        int count = 0;

        for (String word : words1) {
            if (isUnique(word, words1) && isUnique(word, words2)) {
                count++;
            }
        }

        return count;
    }

    public boolean isUnique(String word, String[] words) {
        int occurrences = 0;

        for (String current : words) {
            if (current.equals(word)) {
                occurrences++;
            }
        }

        return occurrences == 1;
    }
}