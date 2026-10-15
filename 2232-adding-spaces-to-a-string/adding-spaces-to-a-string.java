class Solution {
    public String addSpaces(String s, int[] spaces) {
        int k = 0;
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            if (k < spaces.length && i == spaces[k]) {
                result.append(" ");
                k++;
            }
            result.append(s.charAt(i));
        }
        return result.toString();
    }
}