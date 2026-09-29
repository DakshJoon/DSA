import java.util.*;

public class leetcode2659 {
    public static void main(String[] args){
        int[] arr = {3,4,-1};
        int[] arr1 = {1,2,4,3};
        int[] arr2 = {1,2,3};
        System.out.println(countOperationsToEmptyArray(arr));
        System.out.println(countOperationsToEmptyArray(arr1));
        System.out.println(countOperationsToEmptyArray(arr2));
    }
    public static long countOperationsToEmptyArray(int[] nums) {
        ArrayList<Integer> ans = new ArrayList<>();
        long count = 0;
        for (int num : nums) {
            ans.add(num);
        }
        while (!ans.isEmpty()) {
            if (ans.get(0).equals(minimum(ans))) {
                ans.remove(0);
            } else {
                ans.add(ans.remove(0));
            }
            count++;
        }
        return count;
    }
    public static int minimum(ArrayList<Integer> list){
        int min = list.get(0);
        for(int i = 0; i<list.size(); i++){
            if(list.get(i)<min){
                min = list.get(i);
            }
        }
        return min;
    }
}
