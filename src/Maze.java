public class Maze {
    public static void main(String[] args){
        System.out.println(maze(4,4));
        mazePath(3, 3);
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
}