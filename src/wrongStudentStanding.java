import java.util.Arrays;
public class wrongStudentStanding {
    public static void main(String[] args){
        // this is a question with will tell how many numbers are on the wrong index in an Array
        int[] student = {1,1,4,2,1,3};
        System.out.println(heightChecker(student));
    }
    public static int heightChecker(int[] heights) {
        int[] ans = Arrays.copyOf(heights, heights.length);
        bubbleSort(ans);
        int count = 0;
        for(int i = 0; i< ans.length; i++){
            if(ans[i] != heights[i]){
                count++;
            }
        }
        return count;
    }
    public static void bubbleSort(int[] nums){
        for(int i = 0; i<nums.length-1; i++){
            for(int j = 0; j<nums.length-1; j++){
                if(nums[j]> nums[j+1]){
                    swap(nums, j , j+1);
                }
            }
        }
    }
    public static void swap(int[] nums, int first, int second) { 
        int temp = nums[first];
        nums[first] = nums[second];
        nums[second] = temp;
    }
}
