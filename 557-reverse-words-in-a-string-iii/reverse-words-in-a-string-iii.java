class Solution {
    public String reverseWords(String s) {
        String[] ar = s.split(" ");
        for(int i = 0; i < ar.length; i++){
            ar[i] = reverseString(ar[i]);
        }
        return String.join(" ", ar);
    }
    public static String reverseString(String s){
        char[] chars = s.toCharArray();
        int start = 0;
        int end = chars.length - 1;
        while(start <= end){
            char temp = chars[start];
            chars[start] = chars[end];
            chars[end] = temp;
            start++;
            end--;
        }
        return new String(chars);
    }
}