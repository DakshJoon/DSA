class Solution {
    public List<List<Integer>> subsetsWithDup(int[] array) {
        Arrays.sort(array);

        List<List<Integer>> outer = new ArrayList<>();
        outer.add(new ArrayList<>());

        int start = 0;
        int end = 0;
        for(int i = 0; i < array.length; i++ ){
            start = 0;
            // if current and previous elements are same , s = e + 1;
            if(i > 0 && array[i] == array[i - 1]){
                start = end + 1;
            }
            end = outer.size() - 1;
            int n = outer.size();

            for(int j = start; j< n ; j++){
                List<Integer> internal = new ArrayList<>(outer.get(j));
                internal.add(array[i]);
                outer.add(internal);
            }
        }
        return outer; 
    }
}