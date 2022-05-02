package BackTracking;

import java.util.ArrayList;

public class MazeAllPathBacktracking
{
    static ArrayList<String> list = new ArrayList<>();
    public static void main(String[] args)
    {
        boolean[][] b =
                {
                        {true,true,true},
                        {true,true,true},
                        {true,true,true}
                };
        mazeObstaclesAllPath(b,0,0,"");
        System.out.println(list);
    }
    public static void mazeObstaclesAllPath(boolean[][] obstacle, int row, int column, String ans)
    {
        if(row == obstacle.length-1 && column == obstacle[0].length-1)
        {
            list.add(ans);
            return;
        }
        if(obstacle[row][column]==false)
        {
            return;
        }

        //When I will visit this path i will make it false So it can't go to that same path

        obstacle[row][column] = false;

        // Right
        if(row<obstacle.length-1)
        {
            mazeObstaclesAllPath(obstacle, row + 1, column, ans + "R");
        }
        // Downward
        if(column<obstacle[0].length-1)
        {
            mazeObstaclesAllPath(obstacle,row,column+1,ans+"D");
        }
        //Upward
        if(row > 0)
        {
            mazeObstaclesAllPath(obstacle, row -1, column, ans + "U");
        }
        if(column > 0)
        {
            mazeObstaclesAllPath(obstacle, row , column-1, ans + "U");
        }
        //at the end i will make it true which were marked as false while going
        obstacle[row][column] = true;
    }
}

