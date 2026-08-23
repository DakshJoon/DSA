class Solution {
    public int[][] flipAndInvertImage(int[][] image) {
        for(int[] arr : image){
            for(int i = 0; i < (arr.length + 1) / 2; i++){
                int j = arr.length - i - 1;
                if(i == j){
                    arr[i] ^= 1;
                } else {
                    int temp = arr[i] ^ 1;
                    arr[i] = arr[j] ^ 1;
                    arr[j] = temp;
                }
            }
        }
        return image;
    }
}