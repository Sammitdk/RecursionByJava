package Math;
public class Print
{
    public static void main(String[] args)
    {
        test(5);
    }

    public static void test(int n)
    {
        if(n==0)
        {
            return;
        }
        System.out.println(n);
        test(n-1);
        System.out.println(n);
    }
}
