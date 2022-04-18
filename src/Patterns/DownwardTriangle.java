package Patterns;

public class DownwardTriangle
{
    public static void main(String[] args)
    {
        star(5,0);
    }

    public static void star(int row,int column)
    {
        if(row == 0)
        {
            return;
        }
        if(column < row)
        {
            System.out.print("*");
            star(row,++column);
        }
        else
        {
            System.out.println();
            star(--row,0);
        }
    }

}
