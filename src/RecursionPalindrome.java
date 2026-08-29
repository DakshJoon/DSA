public class RecursionPalindrome {
    public static void main(String[] args){
        System.out.println(palindrome(545));  
    }
    public static int reverse2(int n){ // this will need a helper function also
        int digits = (int)(Math.log10(n))+1;
        return helper(n , digits);
    }
    public static int helper(int n, int digits) { // this is the helper function
        if(n % 10 == n){
            return n;
        }
        int ans = n % 10;
        return ans * (int)(Math.pow(10, digits-1)) + helper(n/10, digits-1);
    }
    public static boolean palindrome(int n){ // this method is to find if the number is palindrome or not
        return n == reverse2(n);
    }
}
