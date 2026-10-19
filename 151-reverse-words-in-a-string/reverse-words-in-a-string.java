class Solution {
    public String reverseWords(String s) {
        s = s.trim();
        if (s.isEmpty()) {
            return "";
        }
        String[] ans = s.split("\\s+");
        int left = 0;
        int right = ans.length - 1;
        while(left <= right){
            String temp = ans[left];
            ans[left] = ans[right];
            ans[right] = temp;
            left++;
            right--;
        }

        return String.join( " ", ans);
    }
}