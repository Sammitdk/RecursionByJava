package BackTracking;
import java.util.Arrays;

public class MazeIndexPath
{
    public static void main(String[] args)
    {
        boolean[][] b =
                {
                        {true,true,true},
                        {true,true,true},
                        {true,true,true}
                };
        int[][] path = new int[b.length][b[0].length];
        mazeObstaclesIndexPath(b,0,0,"",path,1);
    }
    public static void mazeObstaclesIndexPath(boolean[][] obstacle, int row, int column, String ans,int[][] path,int index)
    {
        if(row == obstacle.length-1 && column == obstacle[0].length-1)
        {
            path[row][column] = index; // For last index it will not go to line 35 because of base condition so for indexing
            for (int[]arr: path)
            {
                System.out.println(Arrays.toString(arr));
            }
            System.out.println(ans);
            System.out.println();
            return;
        }
        if(obstacle[row][column]==false)
        {
            return;
        }
        obstacle[row][column] = false;
        path[row][column] = index;
        // Right
        if(row<obstacle.length-1)
        {
            mazeObstaclesIndexPath(obstacle, row + 1, column, ans + "R",path,index+1);
        }
        // Downward
        if(column<obstacle[0].length-1)
        {
            mazeObstaclesIndexPath(obstacle,row,column+1,ans+"D",path,index+1);
        }
        //Upward
        if(row > 0)
        {
            mazeObstaclesIndexPath(obstacle, row -1, column, ans + "U",path,index+1);
        }
        if(column > 0)
        {
            mazeObstaclesIndexPath(obstacle, row , column-1, ans + "U",path,index+1);
        }
        obstacle[row][column] = true;
        path[row][column] = 0;
    }
}

