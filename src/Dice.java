import java.util.ArrayList;
import java.util.List;

public class Dice { 
    public static void main(String[] args){
        dice(4);
        System.out.println(); 
        System.out.println(dice1(4));
        System.out.println(diceCount(4));
    }

    public static void dice(int target){
        if(target > 6 || target < 0){
            System.out.println("invalid number");
            return;
        }

        dice("", target);
    }
    private static void dice(String p , int target){
        if(target == 0){
            System.out.print(p + ", ");
            return;
        }

        for(int i = 1; i <= 6 && i <= target; i++) {
            dice(p + i, target - i);
        }
    }


    public static List<String> dice1(int target){
        if(target > 6 || target < 0){
            System.out.println("invalid number");
            return new ArrayList<>();
        }

        return dice1("", target);
    }
    private static List<String> dice1(String p, int target){
        if(target == 0){
            ArrayList<String> ans = new ArrayList<>();
            ans.add(p);
            return ans;
        }
        
        ArrayList<String> ans = new ArrayList<>();

        for(int i = 1; i<= 6 && i <= target; i++){
            ans.addAll(dice1(p + i, target - i));
        }

        return ans;
    }


    public static int diceCount(int target){
        if(target > 6 || target < 0){
            System.out.println("invalid number");
            return -1;
        }

        return diceCount("", target);
    }
    private static int diceCount(String p, int target){

        if(target == 0){
            return 1;
        }

        int count = 0;
        for(int i = 1; i<=6 && i<= target ; i++){
            count += diceCount(p + i, target - i);
        }
        return count;
    }
}
