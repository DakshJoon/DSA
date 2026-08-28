public class PassingNumbers {
    public static void main(String[] args){
        concept(5);
        reverse(1234);
        System.out.println(sum);
        System.out.println(reverse1(123456));
        System.out.println(reverse2(123456));
        // three ways to reverse a number
    }
    public static void concept(int n){
        if(n == 0){
            return;
        }
        System.out.println(n);
        // method1(n--); it will cause stack overflow
        concept(--n); // it will work

    }
    public static int sum = 0; // this method will take a variable outside the method 
    public static void reverse(int n){ // this method is to reverse a number example 132 -> 231

        if(n == 0){
            return;
        }

        int ans = n % 10;
        sum = (sum * 10) + ans;
        reverse(n/10);
    }
    // sometime you might need some additional variables in the argument 
    // in that case, make another function
    // lets do it with another function
    public static int reverse1(int n){ // this will need an another method to count the digits so that digits - 1 can be the power of the 10
        if(n % 10 == n){
            return n;
        }
        int count = countDigits(n) - 1;
        
        int ans = (int)((n % 10) * Math.pow(10, count));
        n = n /10;
        return ans + reverse1(n);
    }

    public static int countDigits(int n){ // this method is for counting the digits 
        if (n == 0) {
            return 1;
        }

        n = Math.abs(n);
        if (n < 10) {
            return 1;
        }

        return 1 + countDigits(n / 10);
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
}
