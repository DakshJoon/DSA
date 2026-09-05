public class recursionPattern {
    public static void main(String[] args){
        pattern(5);
    }
    public static void pattern(int row){
        helper(row, 0);
    }
    public static void helper(int row, int col){
        if(row == 0){
            return;
        }
        if(col<row){
            System.out.print("*");
            helper(row, col+1);
        }
        else{
            System.out.println();
            helper(row-1, 0);
        }   
    }
}
