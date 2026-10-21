class Solution {
    public boolean isHappy(int n) {
        if(n == 1 || n == 7) {
            return true;
        }
        else if(n > 0 && n != 1 && n != 7&& n <= 9) {
            return false;
        }

        int sum = 0;
        while(n > 0) { 
            sum += Math.pow(n % 10, 2);
            n /= 10;
        }

        return isHappy(sum);
    }
}