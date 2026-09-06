public class recursionPattern {
    public static void main(String[] args){
        pattern(5);
        pattern1(5);
    }
    public static void pattern(int row){ 
        helper(row, 0);
    }
    public static void helper(int row, int col){ // helper function for @pattern method
        if(row == 0){
            return;
        }
        if(col<row){
            System.out.print("* ");
            helper(row, col+1);
        }
        else{
            System.out.println();
            helper(row-1, 0);
        }
    }
    public static void pattern1(int row){ 
        helper1(row, 0);
    }
    public static void helper1(int row, int col){ // this is the helper method of @pattern1
        if(row == 0){
            return;
        }
        if(col<row){
            helper1(row, col+1);
            System.out.print("* ");
        }
        else{
            helper1(row-1, 0);
            System.out.println();
        }
    }
}
