public class StarPattern1 {
    /*
       @this is for learning about star pattern
    */
    public static void main(String[] args) {
        pattern(7);
        pattern2(6);
        number(7);
        number1(6);
        pattern3(6);
        mergeNumber(6);
        pattern4(6);
        spacePattern(6);
        pattern5(6);
        pattern6(6);
        pattern7(6);
        pattern8(6);
    }
    public static void pattern(int s) { 
        for(int i = 0; i<s; i++) { // i = row
            // for every row run the col 
            for(int j = 0; j <= i; j++ ) { // j = col
                System.out.print("* ");
                // when one line is printed we need to add a new line
            }
            System.out.println(); // from this we are adding a new line
        }
    } 
    public static void pattern2(int s) {
        for(int i = 0; i < s; i++) { // i = row
            // for every row, we need to minus the col
            for(int j = s - i; j > 0; j--) { // j = col
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    public static void number(int s) {
        for(int i = 1; i<= s; i++) {
            for(int j = 1; j<=i ; j++) {
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }
    public static void number1(int s) {
        for(int i = 1; i <= s; i++) {
            for(int j = 1; j <= s - i + 1; j++) { // try to find the formula in this pattern question
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }
    public static void pattern3(int s){ // this will print the pattern like increasing and decreasing order
        for(int i = 1; i <= s; i++){
            for(int j = 1; j <= i; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
        for(int i = s - 1; i >= 1; i--){
            for(int j = 1; j <= i; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    public static void mergeNumber(int s){ // this is the single method for the number pattern
        for(int i = 1; i <= s; i++){
            for(int j = 1; j<=i; j++){
                System.out.print(j+" ");
            }
            System.out.println();
        }
        for(int i = 0; i<=s; i++){
            for(int j = 1; j<=s-i-1; j++){
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }
    public static void pattern4(int s) {  // this is the merged program for pattern and pattern1
        for(int i = 0; i<2*s;i++) {
            int totalcol = i > s ? 2*s-i : i;
            for(int j = 0; j<totalcol; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    public static void spacePattern(int n) {
        for(int i = 0; i<n; i++) {
            int spaces = n-i;
            for(int s = 0; s<spaces; s++) {
                System.out.print(" ");
            }
            for(int j = 0; j<=i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    public static void pattern5(int n) {
        for(int i = 1; i <= 2*n - 1; i++) {
            int totalCol = i > n ? 2*n - i : i;
            int spaces = n - totalCol;
            for(int s = 0; s < spaces; s++) {
                System.out.print(" ");
            }
            for(int j = 0; j < totalCol; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    public static void pattern6(int s){
        for(int i = 0; i<= 2*s-1; i++){
            int totalCol = i > s ? 2*s - i : i;
            int star = s+1-totalCol;
            for(int a = 0; a<star; a++) {
                System.out.print("*");
            }
            for(int j = 0; j<totalCol; j++) {
                System.out.print("  ");
            } 
            for(int d = 0; d<star; d++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void pattern7(int s) {  
        for(int i = 0; i<=s ; i++) {
            int space = s - i;
            for(int j = 0; j<=space; j++) {
                System.out.print("  ");
            }
            for(int j = i; j >= 1; j--){
                System.out.print(j+ " ");
            }
            for(int j = 2; j<=i; j++){
                System.out.print(j+ " ");
            }
            System.out.println();
        }
    }
    public static void pattern8(int s){
        for(int i = 0; i<=2*s-1; i++){
            int col = i>s ? 2*s-i : i;
            int space = s-col;
            for(int j = 0; j<=space; j++ ){
                System.out.print("  ");
            }
            for(int j = col; j>=1 ; j--){
                System.out.print(j+" ");
            }
            for(int j = 2; j<=col; j++){
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }
}