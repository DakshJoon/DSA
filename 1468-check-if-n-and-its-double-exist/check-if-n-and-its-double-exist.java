class Solution {
    public boolean checkIfExist(int[] arr) {
        if(arr == null || arr.length == 0){
            return false;
        }
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if (i != j && (long) arr[i] == 2L * arr[j]) {
                    return true;
                }
            }
        }
        
        return false;

    }
}