package DSA.leetcode;

public class Leetcode3536 {
    public static void main(String[] args) {
        System.out.println(maxProduct(31));
        System.out.println(maxProduct(22));
        System.out.println(maxProduct(124));
    }

    public static int maxProduct(int n) {
        int largest = 0;
        int secondLargest = 0;

        while (n > 0) {
            int digit = n % 10;
            if (digit >= largest) {
                secondLargest = largest;
                largest = digit;
            } else if (digit > secondLargest) {
                secondLargest = digit;
            }
            n /= 10;
        }

        return largest * secondLargest;
    }
}
