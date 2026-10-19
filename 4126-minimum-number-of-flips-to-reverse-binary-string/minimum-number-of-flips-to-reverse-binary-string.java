class Solution {
    public int minimumFlips(int n) {
        String s = binaryToString(n);
        int flip = 0;
        int start = 0;
        int end = s.length() - 1;
        while(start <= end){
            if(s.charAt(start) != s.charAt(end)){
                flip += 2;
            }
            start++;
            end--;
        }
        return flip;
    }
    public String binaryToString(int n){
        return Integer.toBinaryString(n);
    }
}