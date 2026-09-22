public class leetcode69 {
    public static void main(String[] args){
        System.out.println(squareRoot(4));
        System.out.println(squareRoot(8));


    }
    public static int squareRoot(int x){
        int start = 0;
        int end = x;
        int ans = 0;
        while(start <= end){
            int middle = start + (end - start) / 2;

            if((long) middle * middle <= x){
                ans = middle;
                start = middle + 1;
            }
            else {
                end = middle - 1;
            }

        }
        return ans;
    }
}