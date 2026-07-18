public class greatestCommonDivisor {
    public static void main(String[] args) {
        // now we are going to see how can we
        // today we are going to solve 1979 of leet code to find the greatest division of the minimum number and maximum number
        int[] nums = {2,5,6,9,10};
        System.out.println(findGCD(nums));
    }
    public static int findGCD(int[] nums) {
        int min = findMin(nums);
        int max = findmax(nums);
        return divisionOfMax(min, max);
    }
    public static int divisionOfMax(int min, int max){
        while (min !=0) {
            int temp = min;
            min = max % min;
            max = temp;
        }
        return max;
    }
    public static int findMin(int[] nums){ // we will get minimun number
        int min = nums[0];
        for (int num : nums){
            if (num<min) {
                min = num;
            }
        }
        return min;
    }
    public static int findmax(int[] nums){ // we will get maximum number
        int max = nums[0];
        for(int num : nums){
            if (num>max) {
                max = num;
            }
        }
        return max;
    }
}