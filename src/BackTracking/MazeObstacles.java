package BackTracking;

import java.util.ArrayList;

public class MazeObstacles
{
    static ArrayList<String> list = new ArrayList<>();
    public static void main(String[] args)
    {
        boolean[][] b =
                {
                    {true,true,true},
                    {true,false,true},
                    {true,true,true}
                };
        mazeObstacles(b,0,0,"");
        System.out.println(list);
    }
    public static void mazeObstacles(boolean[][] obstacle,int row,int column,String ans)
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
        if(row<obstacle.length-1)
        {
            mazeObstacles(obstacle, row + 1, column, ans + "H");
        }
        if(column<obstacle[0].length-1)
        {
            mazeObstacles(obstacle,row,column+1,ans+"V");
        }
    }
}
