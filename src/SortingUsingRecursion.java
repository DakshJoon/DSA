/*
    @now we are going to sort an array using recursion
*/
import java.util.*;
public class SortingUsingRecursion {
    public static void main(String[] args){
        int[] nums = {2,3,1,4,5,8,6};
        sort(nums, 0);
        System.out.println(Arrays.toString(nums));
    }
    public static void sort(int[] nums, int index){

        // let the index be the minimum number of index
        int min = index;
        if(index == nums.length-1){
            return;
        }

        // finding the index of minimum number
        for(int i = index+1; i<nums.length; i++){
            if(nums[i]<nums[min]){
                min = i;
            }
        }

        // let the minimum number get sorted first
        int temp = nums[min];
        nums[min] = nums[index];
        nums[index] = temp;

        // sorting the rest array using recursion
        sort(nums, index+1);
    }
}
