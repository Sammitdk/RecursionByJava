package Math;
public class CountZero
{
    public static void main(String[] args)
    {
        System.out.println(countZero(30210,0));
    }
    public static int countZero(int no,int count)
    {
        if(no == 0)
        {
            return count;
        }
        if(no%10 == 0)
        {
            return countZero(no/10,++count);
        }
        return countZero(no/10,count);
    }
}