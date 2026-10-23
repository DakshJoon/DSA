class Solution {
    public int lengthOfLastWord(String s) {
        int i = s.length() - 1;
        while (i >= 0 && Character.isWhitespace(s.charAt(i))) {
            i--;
        }

        int count = 0;
        while (i >= 0 && !Character.isWhitespace(s.charAt(i))) {
            count++;
            i--;
        }
        return count;
    }
}