class Solution {
    public int strStr(String haystack, String needle) {
        if (needle.isEmpty()) {
            return 0;
        }
        if (haystack.length() < needle.length()) {
            return -1;
        }

        for (int i = 0; i <= haystack.length() - needle.length(); i++) {
            if (str(haystack, needle, i)) {
                return i;
            }
        }
        return -1;
    }

    public static boolean str(String haystack, String needle, int start) {
        if (start + needle.length() > haystack.length()) {
            return false;
        }

        for (int i = 0; i < needle.length(); i++) {
            if (haystack.charAt(start + i) != needle.charAt(i)) {
                return false;
            }
        }
        return true;
    }
}