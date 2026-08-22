public class numberOfDIgits {
    public static void main(String[] args){
        System.out.println(countDigits(7));
    }
    public static int countDigits(int n){
        int ans = (int) (Math.log(n)/Math.log(2)) + 1; // formula to count digits in an bits
        return ans;
    }
}
