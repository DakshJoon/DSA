class Solution {
    public List<Integer> countSmaller(int[] nums) {
        int n = nums.length;
        List<Integer> ans = new ArrayList<>(Collections.nCopies(n,0));
        if(n==0) return ans;

        // Discretize values to ranks
        int[] sorted = Arrays.copyOf(nums, n);
        Arrays.sort(sorted);
        Map<Integer,Integer> rank = new HashMap<>();
        int r = 1;
        for(int v : sorted){
            if(!rank.containsKey(v)) rank.put(v, r++);
        }

        // Fenwick tree (BIT)
        int size = rank.size();
        int[] bit = new int[size+1];

        // helper functions
        java.util.function.IntConsumer dummy = x -> {};

        // update BIT at position i by delta
        java.util.function.BiConsumer<Integer,Integer> update = (pos,delta) -> {
            for(int i=pos;i<=size;i+=i&-i) bit[i]+=delta;
        };

        // query prefix sum up to pos
        java.util.function.IntFunction<Integer> query = (pos) -> {
            int s=0;
            for(int i=pos;i>0;i-=i&-i) s+=bit[i];
            return s;
        };

        // iterate from right to left
        for(int i=n-1;i>=0;i--){
            int rk = rank.get(nums[i]);
            int smaller = query.apply(rk-1);
            ans.set(i, smaller);
            update.accept(rk, 1);
        }
        return ans;
    }
}