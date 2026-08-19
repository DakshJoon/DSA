import java.util.Arrays;

public class sortArrayByParity {
    public static void main(String[] args) {
        // now we are going to do leetcode 905
        int[] nums = {3,1,2,4};
        sortArray(nums);
        System.out.println(Arrays.toString(nums));
        int[] nums1 = {3,2,4,5,6,8};
        System.out.println(Arrays.toString(sortArrayByParity1(nums1)));

    }
    public static int[] sortArrayByParity1(int[] nums) {
        int[] result = Arrays.copyOf(nums, nums.length);
        sortArray(result);
        return result;
    }
    public static void sortArray(int[] nums){
        for(int i = 0; i<nums.length; i++){
            for(int j = 0; j<nums.length-1; j++){
                if (nums[j]%2!=0) {
                    int temp = nums[j];
                    nums[j] = nums[j+1];
                    nums[j+1] = temp;
                }
            }
        }
    }
}
