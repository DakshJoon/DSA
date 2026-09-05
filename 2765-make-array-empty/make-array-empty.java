class Solution {
    public long countOperationsToEmptyArray(int[] nums) {
        int n = nums.length;
        Integer[] indices = new Integer[n];
        for (int i = 0; i < n; i++) {
            indices[i] = i;
        }
        Arrays.sort(indices, (a, b) -> Integer.compare(nums[a], nums[b]));

        FenwickTree active = new FenwickTree(n);
        for (int i = 0; i < n; i++) {
            active.add(i, 1);
        }

        long count = 0;
        int start = 0;
        for (int index : indices) {
            if (start <= index) {
                count += active.sum(index + 1) - active.sum(start);
            } else {
                count += active.sum(n) - active.sum(start) + active.sum(index + 1);
            }
            active.add(index, -1);
            start = (index + 1) % n;
        }
        return count;
    }

    private static class FenwickTree {
        private final int[] tree;

        FenwickTree(int size) {
            tree = new int[size + 1];
        }

        void add(int index, int value) {
            for (index++; index < tree.length; index += index & -index) {
                tree[index] += value;
            }
        }

        int sum(int end) {
            int result = 0;
            for (; end > 0; end -= end & -end) {
                result += tree[end];
            }
            return result;
        }
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