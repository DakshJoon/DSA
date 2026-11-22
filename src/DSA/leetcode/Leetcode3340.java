package DSA.leetcode;

public class Leetcode3340 {
    public static void main(String[] args) {
        System.out.println(isBalanced("1234"));
        System.out.println(isBalanced("24123"));
    }
    public static boolean isBalanced(String num) {
        int sum = 0;
        int sum1 = 0;
        for(int i = 0; i < num.length(); i++) {
            if(i % 2 == 0) {
                sum += num.charAt(i) - '0';
            }

            else {
                sum1 += num.charAt(i) - '0';
            }
        }

        return sum == sum1;
    }
}
