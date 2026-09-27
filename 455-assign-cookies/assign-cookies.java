class Solution {
    public int findContentChildren(int[] g, int[] s) {
        quickSort(g, 0, g.length - 1);
        quickSort(s, 0, s.length - 1);

        if(g.length == 0){
            return 0;
        }

        int count = 0;
        int child = 0;
        int cookie = 0;

        while(child <= g.length - 1){

            if(cookie == s.length){
                break;
            }

            if(g[child] <= s[cookie]){
                count++; child++; cookie++;
            }

            else if(g[child] > s[cookie]){
                cookie++;
            }
        }

        return count;

    }
    public void quickSort(int[] nums, int low , int high){
        if(low >= high){
            return;
        }

        int start = low;
        int end = high;
        int middle = start + (end - start) / 2;
        int povit = nums[middle];

        while(start <= end){

            while(nums[start] < povit){
                start++;
            }
            while(nums[end] > povit){
                end--;
            }

            if(start <= end){
                int temp = nums[start];
                nums[start] = nums[end];
                nums[end] = temp;
                start++; end--;
            }
        }

        quickSort(nums, low, end);
        quickSort(nums, start, high);
    }
}