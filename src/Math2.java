import java.util.*;

public class Math2 { 
    public static void main(String[] args){
        // find square root by newton rephson method
        System.out.println(newtonSqrt(40));

        // how can we find factor of a number 
        System.out.println(factor(24)); // finding factor using ArrayList<Integer>

        // more better time complexity
        factor1(20);
        System.out.println();
    }
    public static double newtonSqrt(double n){ 
        double x = n;
        double root;
        while(true){
            root = 0.5 * (x + (n/x));
            if(Math.abs(root - x)< 0.5){
                break;
            } 
            
            x = root; 
        }
        return root;
    }
    public static List<Integer> factor(int n){ // the time complexity is O(n) , we will try to reduce that
        ArrayList<Integer> ans = new ArrayList<>();
        for(int i = 1; i<=n; i++){
            if(n%i==0){
                ans.add(i);
            }
        }
        return ans;
    }
    // O(squareRoot(n)) == Time complexity
    public static void factor1(int n) {
        ArrayList<Integer> ans = new ArrayList<>();
        for(int i = 1; i<=Math.sqrt(n); i++) {
            if(n % i == 0){
                if(n/i == i){
                    System.out.print(i + " ");
                } else{
                    System.out.print(i + " ");
                    ans.add(n/i);
                }
            }
        }
        for(int i = ans.size() -1; i >= 0 ; i--) {
            System.out.print(ans.get(i)+ " ");
        }
    }
}