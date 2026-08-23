/**
 *  In this class we will learn about GCD and LCM
*/
public class Gcd_Lcm1 {
    public static void main(String[] args) {
        System.out.println(GCD(20,9));
        System.out.println(LCM(2, 7));
    }
    public static int GCD(int a , int b) { // this is how we can find greatest commom divisor of 2 numbers
        if(a == 0){
            return b;
        }
        return GCD(b%a, a); // we can also use the recursion here
    }
    public static int LCM(int a, int b) {
        return (a*b)/GCD(a,b);
    }
}
