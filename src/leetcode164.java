public class leetcode164 {
    public static void main(String[] args){
        int[] ar = {3, 6, 9, 1};
        int[] ar1 = {10, 10, 10, 10};
        int[] ar2 = {1, 100, 5, 50};
        int[] ar3 = {1, 2};
        System.out.println(maximumGap(ar));
        System.out.println(maximumGap(ar1));
        System.out.println(maximumGap(ar2));
        System.out.println(maximumGap(ar3));
    }
    public static int maximumGap(int[] nums) {
        if (nums == null || nums.length < 2) {
            return 0;
        }
        quickSort(nums, 0, nums.length-1);
        int gap = nums[1] - nums[0];
        for(int i = 1; i < nums.length; i++){
            if((nums[i] - nums[i-1]) > gap){
                gap = nums[i] - nums[i-1];
            }
        }
        return gap;
    }
    public static void quickSort(int[] nums, int low, int high){
        if(low >= high){
            return;
        }

        int start = low;
        int end = high;
        int middle = start + (end - start) / 2;
        int povit = nums[middle];

        while(start <= end){

            while(start <= high && nums[start] < povit){
                start++;
            }

            while(end >= low && nums[end] > povit){
                end--;
            }

            if(start <= end){
                int temp = nums[start];
                nums[start] = nums[end];
                nums[end] = temp;
                start++; end--;
            }
        }

        quickSort(nums, low , end);
        quickSort(nums, start, high);
    }
}
