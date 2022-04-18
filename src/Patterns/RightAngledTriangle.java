package Patterns;
public class RightAngledTriangle
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
            star(row,++column);
            System.out.print("*");
        }
        else
        {
            star(--row,0);
            System.out.println();
        }
    }

}

