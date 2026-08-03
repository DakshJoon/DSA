public class StarPattern {
    public static void main(String[] args){
        // today we are going to perform * pattern format
        String x = "*"; // let the string x be = *
        straightPattern(x); // this will print the straight pattern
        pattern(x); // this will print the star pattern
        reversePattern(x); // this will print the reverse star pattern
        numberPattern(); // this will print the number pattern
        aplaPattern('a'); // this will print the alpa pattern
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
    public static void straightPattern(String x){ // this will print the straight pattern of string x
        for(int i = 0; i<=6; i++){
            for(int j = 0; j<=6; j++){
                System.out.print(x);
            }
            System.out.println();
        }
    }
    public static void numberPattern(){ // this will print the number patter
        for(int i = 1; i<= 6; i++){
            for(int j = 1; j<=i; j++){
                System.out.print(j);
            }
            System.out.println();
        }
    }
    public static void aplaPattern(char x){ // this will print the aplabet pattern
        for(int i = 0; i <=6; i++){
            for(int j = 0; j<=i; j++){
                System.out.print((char)(x+j));
            }
            System.out.println();
        }
    }
}
