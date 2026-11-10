class Solution {
    public String largestOddNumber(String num) {
        if (num.isEmpty()) {
            return "";
        }

        int lastDigit = num.charAt(num.length() - 1) - '0';
        if (lastDigit % 2 != 0) {
            return num;
        }
        return largestOddNumber(num.substring(0, num.length() - 1));
    }
}