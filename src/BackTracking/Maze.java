package BackTracking;

import java.util.ArrayList;

public class Maze
{
    static int count;
    static ArrayList<String> list = new ArrayList<>();
    static ArrayList<String> listD = new ArrayList<>();
    public static void main(String[] args)
    {
        System.out.println(mazeCountDownRight(3,3));
        mazePathVH(3,3,"");
        System.out.println(list);
        mazePathVHD(3,3,"");
        System.out.println(listD);
    }
    public static int mazeCountDownRight(int row, int column)
    {
        if(row == 1 || column == 1)
        {
            return count++;
        }
        mazeCountDownRight(row-1,column);
        mazeCountDownRight(row,column-1);
        return count;
    }
    public static void mazePathVH(int row, int column, String ans)
    {
        if(row == 1 && column == 1)
        {
            list.add(ans);
            return;
        }
        if(row > 1)
        {
            mazePathVH(row - 1, column, ans + 'V');
        }
        if(column > 1)
        {
            mazePathVH(row, column - 1, ans + 'H');
        }
    }
    public static void mazePathVHD(int row, int column, String ans)
    {
        if(row == 1 && column == 1)
        {
            listD.add(ans);
            return;
        }
        if(row > 1)
        {
            mazePathVHD(row - 1, column, ans + 'V');
        }
        if(column > 1)
        {
            mazePathVHD(row, column - 1, ans + 'H');
        }
        if(row > 1 && column > 1)
        {
            mazePathVHD(row-1, column - 1, ans + 'D');
        }
    }
}
