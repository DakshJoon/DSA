class Solution {
    public int percentageLetter(String s, char letter) {
        return countl(s, letter) * 100 / s.length();
    }

    public static int countl(String s, char letter) {
        int count = 0;
        for(int i = 0; i < s.length(); i++) {
            if(s.charAt(i) == letter) {
                count++;
            }
        }

        return count;
    }
}