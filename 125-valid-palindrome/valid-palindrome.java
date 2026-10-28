class Solution {
    public boolean isPalindrome(String s) {
        
        char[] ch = s.toCharArray();
        if(s.isEmpty()) {
            return true;
        }

        return isPalindrome(ch, 0, ch.length - 1);
    }

    private static boolean isPalindrome(char[] ch, int start, int end) {
        if(start >= end) {
            return true;
        }

        if(!Character.isLetterOrDigit(ch[start])) {
            return isPalindrome(ch, start + 1, end);
        }
        if(!Character.isLetterOrDigit(ch[end])) {
            return isPalindrome(ch, start, end - 1);
        }

        if(Character.toLowerCase(ch[start]) != Character.toLowerCase(ch[end])) {
            return false;
        }

        return isPalindrome(ch, start + 1, end - 1);
    }
}