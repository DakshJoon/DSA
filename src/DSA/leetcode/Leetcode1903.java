package DSA.leetcode;

public class Leetcode1903 {
    public static void main(String[] args) {
        System.out.println(largestOddNumber("52"));
        System.out.println(largestOddNumber("4206"));
        System.out.println(largestOddNumber("35427"));

    }
    public static String largestOddNumber(String num) {
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
