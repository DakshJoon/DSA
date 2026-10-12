class Solution {
    public String reverseVowels(String s) {
        char[] chars = s.toCharArray();
        int start = 0;
        int end = chars.length - 1;
        while(start < end){
            if(chars[start] == 'A' || chars[start] == 'a' || chars[start] == 'E' || chars[start] == 'e' || chars[start] == 'O' || chars[start] == 'o' || chars[start] == 'I' || chars[start] == 'i' || chars[start] == 'U' || chars[start] == 'u'){
                while(end >= start){
                    if(chars[end] == 'A' || chars[end] == 'a' || chars[end] == 'E' || chars[end] == 'e' || chars[end] == 'O' || chars[end] == 'o' || chars[end] == 'I' || chars[end] == 'i' || chars[end] == 'U' || chars[end] == 'u'){
                        char temp = chars[start];
                        chars[start] = chars[end];
                        chars[end] = temp;
                        start++; end--;
                        break;
                    }
                    else {end--;}
                }
            }
            else {
                start++;
            }
        }
        return new String(chars);
    }
}