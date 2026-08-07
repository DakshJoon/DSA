public class StarPattern1 {
    /*
       @this is for learning about star pattern
    */
    public static void main(String[] args) {
        pattern("/\\");
        pattern ("c");
    }
    public static void pattern(String s) {
        for(int i = 0; i<6; i++) {
            for(int j = 0; j <= i; j++ ) {
                System.out.print(s);
            }
            System.out.println(); 
        }
    }
}