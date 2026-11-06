class Solution {
    public int countCharacters(String[] words, String chars) {
        int count = 0;
        int[] available = new int[26];
        for (char ch : chars.toCharArray()) {
            available[ch - 'a']++;
        }

        for (String word : words) {
            int[] remaining = available.clone();
            boolean canForm = true;
            for (char ch : word.toCharArray()) {
                if (remaining[ch - 'a'] == 0) {
                    canForm = false;
                    break;
                }
                remaining[ch - 'a']--;
            }
            if (canForm) {
                count += word.length();
            }
        }
        return count;
    }
}