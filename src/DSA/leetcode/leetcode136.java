package DSA.leetcode;


public class leetcode136 {
    public static void main(String[] args){
        int[] ans = {2,2,1};
        int[] ans1 = {4,1,2,1,2};
        int[] ans2 = {1};
        System.out.println(singleNumber(ans));
        System.out.println(singleNumber(ans1));
        System.out.println(singleNumber(ans2));
    }
    public static int singleNumber(int[] nums) {
        int result = 0;
        for (int i = 0; i < nums.length; i++) {
            result ^= nums[i];
        }
        return result;
    }
}
