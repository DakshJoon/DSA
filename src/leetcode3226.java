public class leetcode3226 {
    public static void main(String[] args){
        System.out.println(minChanges(13,4));
    }
    public static int minChanges(int n, int k) {
        // A 1-bit in k must already be 1 in n; changing 1 to 0 is allowed.
        if ((n & k) != k) {
            return -1;
        }
        return Integer.bitCount(n ^ k);
    }
}
