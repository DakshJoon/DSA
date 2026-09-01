class Solution {
    public int[] evenOddBit(int n) {
        int an1 = 0;
        int an2 = 0;
        for(int i = 32; i>=0; i--){
            if(i % 2 == 0 && (n & 1) == 1){
                an1++;
            }
            else if(i % 2 != 0 && (n & 1) == 1){
                an2++;
            }
            n = n >> 1;
        }
        return new int[]{an1, an2};
    }
}