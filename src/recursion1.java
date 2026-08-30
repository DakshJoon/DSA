/**
 * In this class we are going to learn about recursion.
 */
public class recursion1 {
    public static void main(String[] args) {
        printNTo1(6);
        System.out.println();
        print1ToN(12);
        System.out.println();
        print1(6); 
        System.out.println();
        product(5,10);
        System.out.println();
        System.out.println(factorial(5));
        System.out.println();
        System.out.println(sum(10));
        System.out.println();
        System.out.println(sumOfDigits(1234));
        System.out.println();
        System.out.println(productOfDigits(24));
        System.out.println();
        System.out.println(countZeros(203005));
    }
    public static void printNTo1(int n){ // simple method to print number from n to 1
        if(n == 0){
            return;
        }
        System.out.println(n);
        printNTo1(n-1);
    } 
    public static void print1ToN(int n){ // simple method to print number from 1 to n
        if(n == 0){
            return;
        }
        print1ToN(n-1);
        System.out.println(n);
    }
    public static void print1(int n) { // print in a pattern like 1 to n and n to 1
        if(n == 0){
            return;
        }
        System.out.println(n);
        print1(n-1);
        System.out.println(n);
    }
    public static void product(int n, int k){ // print the product of n from 1 to k
        if(k == 0){
            return;
        }

        product(n, k-1);
        System.out.println(n*k);
    }
    public static long factorial(int n){ // this function is to find factorial of any number
        if(n <= 1){
            return n;
        }
        return n * factorial(n-1); 
    }
    public static int sum(int n){ // this is to find the sum of number from 1 to n
        if(n == 1){
            return 1;
        }
        return n + sum(n-1);
    }
    public static int sumOfDigits(int n){ // this is to find the sum of digits of a number
        if(n <= 1){
            return n;
        }
        int remainder = n % 10;
        n = n/10;
        return remainder + sumOfDigits(n);
    }
    public static int productOfDigits(int n){ // this is to find the product of digits of a number
        if(n % 10 == n){
            return n;
        }
        int remainder = n % 10;
        n = n/10;
        return remainder * productOfDigits(n);
    }
    public static int countZeros(int n){ // this will count zeros in the number
        return countZerosH(n, 0);
    }
    // special pattern, how to pass a value to above calls
    public static int countZerosH(int n, int count){
        if(n == 0){
            return count;
        }
        int remainder = n % 10;
        if(remainder == 0){
            return countZerosH(n/10, count+1);
        }
        return countZerosH(n/10, count);
    }
}