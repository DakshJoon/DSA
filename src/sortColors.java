import java.util.Arrays;

public class sortColors {
    public static void main(String[] args) {
        // now we are going to do leetcode 75
        int[] nums = {2,0,2,1,1,0};
        sortColors1(nums);
        System.out.println(Arrays.toString(nums));

    }
    public static void sortColors1(int[] nums) {
        boolean swapped;
        for(int i = 0; i<nums.length; i++){
            swapped = false;
            for(int j = 1; j<nums.length ;j++){
                if (nums[j]<nums[j-1]) {
                    int temp = nums[j];
                    nums[j] = nums[j-1];
                    nums[j-1] = temp;
                    swapped = true;
                }
            }
            if (!swapped) {
                break;
            }
        }
    }
}
