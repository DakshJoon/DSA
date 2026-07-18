class Solution {
    public int findGCD(int[] nums) {
        int min = findMin(nums);
        int max = findmax(nums);
        return divisionOfMax(min, max);
    }
    public int divisionOfMax(int min, int max){
        while (min !=0) {
            int temp = min;
            min = max % min;
            max = temp;
        }
        return max;
    }
    public int findMin(int[] nums){ // we will get minimun number
        int min = nums[0];
        for (int num : nums){
            if (num<min) {
                min = num;
            }
        }
        return min;
    }
    public int findmax(int[] nums){ // we will get maximum number
        int max = nums[0];
        for(int num : nums){
            if (num>max) {
                max = num;
            }
        }
        return max;
    }
}