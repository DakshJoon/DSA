/**
 * This class is used to learn about time and space complexity.
 */

public class timeAndSpace {
    public static void main(String[] args) {
        System.out.println(fibonacci(10));
        for(int i = 0; i<10; i++){ // this will find the fibonacci of number from 1 to 10 
            System.out.println(fibonacciFormula(i));
        }
    }
    public static int fibonacci(int index) { 
        // this is our base condition
        if(index<2){
            return index;
        }
        return fibonacci(index - 1) + fibonacci(index-2); 
    }
    public static int fibonacciFormula(int n){ // this is all using the Fibonacci formula 
        return (int)(( Math.pow ( ( ( 1 + Math.sqrt (5) ) / 2 ) , n ) - Math.pow ( ( ( 1 - Math.sqrt (5) ) / 2 ) , n ) ) / Math.sqrt (5) );
    }
}
