class Solution {
    public boolean isOneBitCharacter(int[] bits) {
        int i = 0;
        while( i < bits.length-1){
            if(bits[i] == 1){
                i += 2;
            }
            else if(bits[i] == 0){
                i++;
            }
        }
        return i == bits.length-1;
    }
}