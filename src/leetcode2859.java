import java.util.*;

public class leetcode2859 {
    public static void main(String[] args){
        List<Integer> ans = new ArrayList<>();
        ans.add(5);
        ans.add(10);
        ans.add(1);
        ans.add(5);
        ans.add(2);
        int k = 1;
        System.out.println(sumIndicesWithKSetBits(ans, k));
    }
    public static int sumIndicesWithKSetBits(List<Integer> nums, int k) {
        int count = 0;
        for(int i = 0; i<nums.size(); i++){
            if((Integer.bitCount(i))==k){
                count = count + nums.get(i);
            }
        }
        return count;
    }
}
