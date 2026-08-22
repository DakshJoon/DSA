public class NthmagicNumber {
    public static void main(String[] args){
        System.out.println(magic(6));
    }
    public static int magic(int n){
        int count = 0;
        int power = 5;
        while(n>0){
            int last = n & 1;
            n = n>>1;
            count += last*power;
            power *= 5;
        }
        return count;
    }
}
