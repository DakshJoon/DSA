/*
    @here we are going to use recursion function for binary search
*/

public class binarySearchUsingRecursion {
    public static void main(String[] args){
        int[] nums = {1,2,3,5,6};
        int target = 6;
        int[] nums1 = {1,23,44,53,54,65,67,87};
        System.out.println(binarySearch(nums, target, 0, nums.length-1)); // this will return the int value
        // this will return the boolean value
        System.out.println(binarySearch1(nums1, 87, 0, nums1.length-1));
    }
    public static int binarySearch(int[] nums, int target, int start, int end ){
        
        if(start>end){
            return -1;
        }

        int middle = start + (end -start)/2;
        
        if(nums[middle] == target){
            return middle;
        }
        
        else if (nums[middle]>target){
            return binarySearch(nums, target, start, middle-1);
        }
        
        else if(nums[middle]<target){
            return binarySearch(nums, target, middle+1, end);
        }

        return -1;
    }
    public static boolean binarySearch1(int[] nums, int target, int start, int end){
        if(start>end){
            return false;
        }
        int middle = start + (end - start)/2;

        if(nums[middle] == target){
            return true;
        }

        else if (nums[middle]>target){
            return binarySearch1(nums, target, start, middle-1);
        }

        else if(nums[middle]<target){
            return binarySearch1(nums, target, middle+1, end);
        }
        return false;
    }
}
