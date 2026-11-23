package DSA.leetcode;

public class leetcode7 {
    public static void main(String[] args){
        System.out.println(reverse(123));
        System.out.println(reverse(-123));
        System.out.println(reverse(120));
    }
    public static int reverse(int x) {
        if(x < 0){
            String s = integerToString(Math.abs(x));
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
             

            return Integer.parseInt(new String(chars)) * -1;
        }
        String n = integerToString(x);
        char[] chars = n.toCharArray();
        int start = 0;
        int end = chars.length - 1;
        while(start <= end){
            char temp = chars[start];
            chars[start] = chars[end];
            chars[end] = temp;
            start++;
            end--;
        }

        return Integer.parseInt(new String(chars));
    }

    public static String integerToString(int n){
        return Integer.toString(n);
    }
}
