class Solution {
    public int[] plusOne(int[] digits) {
        if(digits.length == 0) {
            return new int[0];
        }
        return plusOne(digits, digits.length - 1);
    }
    private static int[] plusOne(int[] digits, int length) {
        if (length < 0) {
            int[] result = new int[digits.length + 1];
            result[0] = 1;
            return result;
        }

        if (digits[length] < 9) {
            digits[length]++;
            return digits;
        }

        digits[length] = 0;
        return plusOne(digits, length - 1);
    }
}
