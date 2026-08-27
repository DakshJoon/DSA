class Solution {
    public int countPrimeSetBits(int left, int right) {
        int count = 0;
        for(int i = left; i<= right; i++){
            int ans = Integer.bitCount(i);
            if(isPrime(ans) == true){
                count++;
            }
        }
        return count;
    }
    public static boolean isPrime(int n){
        if(n < 2){
            return false;
        }
        if(n == 2){
            return true;
        }
        int squareRoot = (int)(Math.sqrt(n));
        for(int i = 2; i <= squareRoot; i++) {
            if(n % i == 0){
                return false;
            }
        }
        return true;
    }
}