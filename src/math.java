/*
    Today we are going to study about Math for Data structure and algorithms
*/
public class math {
    public static void main(String[] args){
        System.out.println(evenOrOdd(89));
        System.out.println(evenOrOdd(74));

        // now try to find an integer in an array which is the only one who is not getting repeat 
        int[] arr = {1,1,2,2,3,3,4,4,5,5,6}; 
        System.out.println(findNumber(arr)); // it should return 6 

        // find the iTh bit of a number
        System.out.println(bit(10));

        
    }

    public static String evenOrOdd(int n){
        if((n&1) == 1){ 
            // using this AND (&) operator we can find that if the number is odd or even
            return "odd";
        }
        return "even";
    }

    public static int findNumber(int[] array){
        // now we now every number is getting repeated else a single number number which is not getting repeated 
        int unique = 0;
        for(int n : array){
            unique ^= n;
        }
        return unique;
    }

    public static int bit(int n){
        int ans = n & (1<<(n-1)); 
        return ans;
    }
}
