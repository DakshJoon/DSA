package DSA.leetcode;

import java.util.*;

public class findAllMissingNumber {
    public static void main(String[] args){
        int[] nums = {4,3,2,7,8,2,3,1};
        findAllMissingNumber obj = new findAllMissingNumber();
        System.out.println(obj.findDisappearedNumbers(nums));
    }
    public List<Integer> findDisappearedNumbers(int[] nums) {
        ArrayList<Integer> ans = new ArrayList<Integer>();
        int i = 0;
        while(i<nums.length){
            int correctIndex = nums[i]-1;
            if(correctIndex<nums.length && nums[i] != nums[correctIndex]){
                swap(nums, i, correctIndex);
            } else{
                i++;
            }
        } 
        for(int j = 0; j< nums.length; j++){ 
            if(nums[j] != j+1){
                ans.add(j+1);
            }
        }
        return ans;
    }
    public static void swap(int[] nums, int first, int second){
        int temp = nums[first];
        nums[first] = nums[second];
        nums[second] = temp;
    }
}
