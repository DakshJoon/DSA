class Solution {
    public int mySqrt(int x) {
        int start = 0;
        int end = x / 2;
        int ans = 0;

        if(x < 2){
            return x;
        }
        while(start <= end){
            int middle = start + (end - start) / 2;

            if((long) middle * middle <= x){
                ans = middle;
                start = middle + 1;

            }
            else {
                end = middle - 1;
            }
        
        
        }
        return ans;
    }
}