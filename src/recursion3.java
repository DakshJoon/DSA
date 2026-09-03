import java.util.*;

public class recursion3 {
    public static void main(String[] args){
        int[] ans = {1,2,3,4,5};
        int[] ans1 = {1,2,3,2,1,2};
        int[] ans2 = {1,2,3,4,4,8};
        System.out.println(sortedOrNot(ans));
        System.out.println(sortedOrNot(ans1));
        System.out.println(helper1(ans, 0));
        System.out.println(helper1(ans1, 0));
        System.out.println(linearSearch(ans, 4));
        System.out.println(linearSearch(ans1, 5));
        System.out.println(binarySearch(ans, 4));
        System.out.println(findAllIndex(ans1, 2));
        System.out.println(findAllIndex(ans2, 4));
        
    }
    public static boolean sortedOrNot(int[] array){ // this method will check if the array is sorted or not 
        if(array.length < 2){
            return false;
        }
        return helper(array, 0);
    }
    public static boolean helper(int[] array , int index){ // helper for @sortedOrNot method
        if (index == array.length - 1) {
            return true;
        }
        if (array[index] > array[index + 1]) {
            return false;
        }
        return helper(array , index + 1);
    }
    public static boolean helper1(int[] array, int index) { // same helper function for the @sortedOrNot method 
        if (array.length < 2) {
            return true;
        }
        if(index == array.length-1) {
            return true;
        }
        return array[index] < array[index+1] && helper1(array, index+1);
    }
    public static boolean linearSearch(int[] array, int target) { // this is to find a number in an array using linear search
        if(array.length == 0){
            return false;
        }
        return helperForLS(array, target, 0);
    }
    public static boolean helperForLS(int[] array,int target, int index) { // helper for @linearSearch method
        if(array[index] == target) {
            return true;  
        }
        else if(index == array.length-1 && array[index] != target) {
            return false;
        }
        return helperForLS(array, target, index+1); 
    }
    public static boolean binarySearch(int[] array, int target) { // this method is for binarySearch in an array 
        if(array.length == 0){
            return false;
        }
        return helperForBS(array, target, 0, array.length-1);
    }
    public static boolean helperForBS(int[] array, int target, int start, int end) { // this is the helper of @binarSearch method
        if (start > end) {
            return false;
        }
        int middle = start + (end-start)/2;
        if(array[middle] == target) {
            return true;
        }
        else if(array[middle]>target) {
            return helperForBS(array, target, start, middle-1);
        }
        return helperForBS(array, target, middle + 1, end);
    }
    public static ArrayList<Integer> findAllIndex(int[] array, int target){ // this method will find the elements in the array
        ArrayList<Integer> ans = new ArrayList<>();
        return helperForAL(array, target, 0, ans);
    }
    public static ArrayList<Integer> helperForAL(int[] array, int target, int index, ArrayList<Integer> list){ // helper method for @findAllIndex
        if(index == array.length){
            return list;
        }
        else if(array[index] == target){
            list.add(index);
        }
        return helperForAL(array, target, index+1, list);
    }
}
