import java.util.ArrayList;

public class MazeWithObstacles {
    public static void main(String[] args){
        System.out.println(river(1, 1, 3, 2, 2));
        System.out.println(river1(1, 1, 3, 2, 2));
        
        
    }
    
    public static int river(int row, int column, int size, int blocked1, int blocked2){
        if(row == size && column == size){
            return 1;
        }

        boolean ans = !(row == blocked1 && column == blocked2);
        int count = 0;
        if(row < size && ans){
            count += river(row + 1, column, size, blocked1, blocked2);
        }
    
        if(column < size && ans){
            count += river(row , column + 1, size, blocked1, blocked2);
        }

        return count;
    }


    public static ArrayList<String> river1(int row, int column, int size, int blocked1, int blocked2){
        return river1(row, column, size , "", blocked1, blocked2);
    }
    private static ArrayList<String> river1(int row, int column, int size , String path, int blockedRow, int blockedCol){
        if(row == size && column == size){
            ArrayList<String> ans = new ArrayList<>();
            ans.add(path);
            return ans;
        }

        boolean an = !(row == blockedRow && column == blockedCol);
        ArrayList<String> ans = new ArrayList<>();

        if(row < size && an){
            ans.addAll(river1(row + 1, column ,size, path + "R", blockedRow , blockedCol));
        }
        if(column < size && an){
            ans.addAll(river1(row , column + 1,size, path + "D",blockedRow , blockedCol));
        }

        return ans;
    }
}
