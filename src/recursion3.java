public class recursion3 {
    public static void main(String[] args){
        int[] ans = {1,2,3,4,5};
        int[] ans1 = {1,2,3,2,1,2};
        System.out.println(sortedOrNot(ans));
        System.out.println(sortedOrNot(ans1));
    }
    public static boolean sortedOrNot(int[] n){ // this method will check if the array is sorted or not 
        return helper(n, 0);
    }
    public static boolean helper(int[] n , int start){
        if (n[start] > n[start + 1]) {
            return false;
        }
        else if (start == n.length - 2){
            return true;
        }
        return helper(n , start+1);
    }
}
