/*
    In this class we are going to study about the Math and usage of Math
*/

public class math1 {
    public static void main(String[] args){
        // write a program to find if a number is prime or not
        System.out.println(isPrime(36));
        for(int i = 0; i<=30; i++){
            System.out.println(i + " is prume : " +isPrime(i));
        }

        // how many prime number are in this array
        int[] array = {0,1,2,3,4,5,6,8,9,10,11,13};
        System.out.println(checkNumber(array));

        // find prime number from 0 to n
        int n = 40;
        boolean[] ar = new boolean[n+1];
        isPrime1(n, ar);
        System.out.println();

        // find the square root of the number 
        System.out.printf("%.3f",sqrt(40, 3)); // this situation is for prefect root

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
    public static int checkNumber(int[] array){
        int count = 0;
        for(int i = 0; i<array.length-1; i++){
            if(array[i] == 2){
                count++;
            }
            if(array[i] < 2){
                continue;
                
            }
            int squareRoot = (int)(Math.sqrt(array[i]));
            for(int j = 2; j<=squareRoot; j++){
                if(array[i] % j == 0){
                    count++;
                    break;
                }
            }
        }
        return count;
    }
    public static void isPrime1(int n, boolean[] prime){
        for(int i = 2; i*i<=n; i++){
            if(!prime[i]){ // false in array means number is prime 
                for(int j = i * 2; j <= n; j += i){
                    prime[j] = true;
                }
            }
        }
        for(int i = 2; i <= n ; i++){
            if(!prime[i]){
                System.out.print( i + " ");
            }
        }
    }
    public static double sqrt(int n, int p){ // this is taking O(log(n)) time complexity
        int start = 0;
        int end = n;
        double root = 0.0;

        while(start<=end){
            int middle = start + (end - start)/2;
            if(middle * middle == n){
                root = middle;
            } else if (middle * middle > n){
                end = middle - 1;
            } else { 
                start = middle + 1;
            }
        }
        double incr = 0.1;
        for(int i = 0; i<p; i++){
            while (root * root <= n){
                root += incr;
            }

            root -= incr;
            incr /= 10;
        }

        return root;
    }
}
