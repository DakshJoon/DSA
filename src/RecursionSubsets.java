
public class RecursionSubsets {
    public static void main(String[] args){
        // now we are going to study about the subesets and all other kind of stufff
        String a = "baccad";
        System.out.println(removingA(a)); 
        remo("baccad");
        System.out.println();
        System.out.println(skipApple("bapplecab"));
        System.out.println(skipAppNotApple("bappalecab"));
    }


    public static String removingA(String s){ // this is for removing char 'a' from a String 
        return removingA(s, "", 0);
    }
    private static String removingA(String s, String c, int start){ // this is the helper method 
        if(start >= s.length()){
            return c;
        }
        if(s.charAt(start)!= 'a'){
            c += s.charAt(start);
        }
        else if (s.charAt(start) == 'a'){
            return removingA(s, c, start+1); 
        }
        return removingA(s, c, start+1);
    }


    public static void remo(String s){ // this method will not return any string but do the same output
        remo(s, "", 0);
    }
    private static void remo(String s, String c, int start){ // this is a helper method
        if(start == s.length()) {
            return;
        }
        if(s.charAt(start) != 'a'){
            System.out.print(s.charAt(start));
        }
        remo (s, c, start+1);
    }


    public static String skipApple(String s){
        if(s.isEmpty()){
            return "";
        }

        if(s.startsWith("apple")){
            return skipApple(s.substring(5));
        }
        return String.valueOf(s.charAt(0)) + skipApple(s.substring(1)); // using substring removing apple from a string
    }


    public static String skipAppNotApple(String s){
        if(s.isEmpty()){
            return "";
        }

        if (s.startsWith("app") && !s.startsWith("apple")){
            return skipAppNotApple(s.substring(3));
        }
        return s.charAt(0) + skipAppNotApple(s.substring(1)); 
    }
}