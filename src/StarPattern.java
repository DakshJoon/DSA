public class StarPattern {
    public static void main(String[] args){
        // today we are going to perform * pattern format
        String x = "*"; // let the string x be = *
        pattern(x); // this will print the star pattern
        reversePattern(x); // this will print the reverse star pattern
    }
    public static void pattern(String x){ // this is the method to make star pattern of any String
        for(int i = 1; i<= 6; i++){
            for(int j = 1; j<=i; j++){
                System.out.print(x);
            }
            System.out.println();
        }
    }
    public static void reversePattern(String x){  // this is the reverse of the * pattern
        for(int i = 1; i<=6; i++){
            for(int j = 6; j>=i; j--){
                System.out.print(x);
            }
            System.out.println();
        }
    }
}
