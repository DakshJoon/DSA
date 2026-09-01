import java.util.*;
public class leetcode1 {
    public static void main(String[] args){
        int[] ans = {2,7,11,15};
        System.out.println(Arrays.toString(twoSum(ans, 9)));
        int[] ans1 = {3,2,4};
        System.out.println(Arrays.toString(twoSum(ans1, 6)));
        int[] ans2 = {3,3};
        System.out.println(Arrays.toString(twoSum(ans2, 6)));
    }
    public static int[] twoSum(int[] nums, int target) {
        int[] ans = new int[2];
        for(int i = 1; i < nums.length; i++){
            if(nums[i-1] + nums[i] == target){
                ans[0] = i-1;
                ans[1] = i;
            }
        }
        return ans;
    }
}
