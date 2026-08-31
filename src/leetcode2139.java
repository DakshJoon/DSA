public class leetcode2139 {
    public static void main(String[] args){
        System.out.println(minMoves(5,0));
        System.out.println(minMoves(19,2));
        System.out.println(minMoves(10,4));
    }

    public static int minMoves(int target, int maxDoubles) {
        return helper(target, maxDoubles, 0);
    }

    public static int helper(int target, int maxDoubles, int count) {
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