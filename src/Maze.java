import java.util.ArrayList;

public class Maze {
    public static void main(String[] args){
        System.out.println(maze(3,3));
        mazePath(3, 3);

        System.out.println();
        System.out.println(mazePath1(3,3));
    }


    public static int maze(int numberOfRow, int numberOfColumn){
        if(numberOfRow == 1 || numberOfColumn == 1){
            return 1;
        }

        int left = maze(numberOfRow - 1 , numberOfColumn);
        int right = maze(numberOfRow , numberOfColumn-1);

        return left + right;
    }

    public static void mazePath(int r, int c){
        mazePath(r, c, "");
    }
    private static void mazePath(int r, int c, String path){
        if(r == 1 && c == 1){
            System.out.print(path+", ");
            return;
        }

        if(r > 1){
            mazePath(r - 1, c , path + "R");
        }

        if(c > 1){
            mazePath(r, c-1 , path + "D");
        }
    }

    public static ArrayList<String> mazePath1(int r , int c){
        return mazePath1(r, c, "");
    }
    private static ArrayList<String> mazePath1(int r , int c, String path){
        if(c == 1 && r == 1){
            ArrayList<String> ans = new ArrayList<>();
            ans.add(path);
            return ans;
        }
        ArrayList<String> ans = new ArrayList<>();
        if(r > 1){
            ans.addAll(mazePath1(r - 1, c , path + "R"));
        }

        if(c > 1){
            ans.addAll(mazePath1(r, c-1 , path + "D"));
        }

        return ans;
        
    } 
}