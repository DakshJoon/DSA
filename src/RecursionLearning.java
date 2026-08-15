/*   
    @ now we are going to learn about recursion
*/
public class RecursionLearning {
    public static void main(String[] args) {
        hello(1); // printing a String 5 times without using loops
        number(1); // printing number for 5 times without using loops
    } 
    public static void number(int s){
        if(s == 6){
            return;
        }
        System.out.println(s);
        number(s+1);
    }
    public static void hello(int s){
        if(s == 6){
            return;
        }
        System.out.println("started learning about recursion");
        hello(s+1);
    }
}