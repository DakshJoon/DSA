import java.util.Arrays;

public class BackTracking {
    public static void main(String[] args){
        boolean[][] arr = {
            {true, true, true}, 
            {true, true, true}, 
            {true, true, true}
        };

        allPath(arr, 0, 0, ""); 
        System.out.println();

        int[][] arrr = new int[arr.length][arr[0].length];

        allPath1(arr, 0,0,"", arrr,1);
    }

    public static void allPath(boolean[][] maze, int c, int r, String path){
        if(r == maze.length -1 && c == maze[0].length - 1){
            System.out.print(path + ", ");
            return;
        }

        if(!maze[r][c]){
            return;
        }

        // i am considering this col in my path
        maze[r][c] = false;

        if(r < maze.length - 1){
            allPath(maze, r + 1, c , path + "D");
        }

        if(c < maze[0].length -1){
            allPath(maze, r, c + 1, path + "R");
        }

        if(r > 0){
            allPath(maze, r - 1, c, path + "U");
        }

        if(c > 0){
            allPath(maze, r , c - 1, path + "L");
        }

        // here the function will we over
        // so before the function will gets removed, also remove the changes that were made by those function
        
        maze[r][c] = true;

    }


    public static void allPath1(boolean[][] maze, int c, int r, String path, int[][] arr, int step){
        if(r == maze.length - 1 && c == maze[0].length - 1){
            arr[r][c] = step;
            for(int[] nums : arr){
                System.out.println(Arrays.toString(nums));
            }
            System.out.print(path);
            System.out.println();

            return;
        }

        if(!maze[r][c]){
            return;
        }

        // i am considering this cell in my path
        maze[r][c] = false;
        arr[r][c] = step;

        if(r < maze.length - 1){
            allPath1(maze, c, r + 1, path + "D", arr, step + 1);
        }

        if(c < maze[0].length - 1){
            allPath1(maze, c + 1, r, path + "R", arr, step + 1);
        }

        if(r > 0){
            allPath1(maze, c, r - 1, path + "U", arr, step + 1);
        }

        if(c > 0){
            allPath1(maze, c - 1, r, path + "L", arr, step + 1);
        }

        // remove the changes made for this cell before returning to the previous state
        maze[r][c] = true;
        arr[r][c] = 0;
    }
}
