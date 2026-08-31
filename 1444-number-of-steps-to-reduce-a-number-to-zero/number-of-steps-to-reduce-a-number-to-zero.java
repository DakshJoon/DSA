class Solution {
    public int numberOfSteps(int num) {
        return helper(num, 0);
    }
    public int helper(int n , int ans){
        if(n == 0){
            return ans;
        }
        if(n % 2 == 0){
            n = n /2;
        }
        else {
            n = n - 1; 
        }
        return helper(n, ans + 1);
    }
}