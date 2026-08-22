class Solution {
    public boolean hasAlternatingBits(int n) {
        int alternating = n ^ (n >> 1);
        return (alternating & (alternating + 1)) == 0;
    }
}