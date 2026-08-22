class Solution {
    public boolean hasAlternatingBits(int n) {
        int last = 0;
        int last1 = 0;
        while(n>0){
            last = n & 1;
            n = n>>1;
            last1 = n & 1;
            if(last == last1){
                return false;
            }
        }
        return true;
    }
}