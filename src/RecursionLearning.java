/*   
    @ now we are going to learn about recursion
*/
public class RecursionLearning {
    public static void main(String[] args) {
        hello(1); // printing a String 5 times without using loops
        number(1); // printing number for 5 times without using loops
        System.out.println(); // space line between 2 different part of questions
        System.out.println(fibo(7)); // try to print fibonacci of Nth term
        // this will return 13 because the 7th fibonacci number is 13
    } 
    public static int fibo(int n){
        // we need to put a base condition 
        if(n<2){ // if n is 0 it will return 0, if n is 1 it will return 1 
            return n;
        }
        return fibo(n-1) + fibo(n-2);
    }
    public static void number(int s){
        if(s == 6){
            return;
        }
        System.out.println(s);
        // this is the last fuction call 
        number(s+1); // this is called tail recursion
    }
    public static void hello(int s){
        if(s == 6){
            return;
        }
        System.out.println("started learning about recursion");
        hello(s+1);
    }
}