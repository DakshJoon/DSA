class Solution {
    public int minMoves(int target, int maxDoubles) {
        return helper(target, maxDoubles, 0);
    }
    public static int helper(int target, int maxDoubles, int count){
        if (target == 1) {
            return count;
        }
    
        if (maxDoubles == 0) {
            return count + (target - 1);
        }
    
        if (target % 2 == 0) {
            return helper(target / 2, maxDoubles - 1, count + 1);
        }

        return helper(target - 1, maxDoubles, count + 1);
    }
}