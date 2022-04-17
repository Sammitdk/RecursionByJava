package Math;
public class SumOfNumbers
{
    public static void main(String[] args)
    {
        System.out.println(sumOfNumbers(1));
    }
    public static int sumOfNumbers(int n)
    {
        if(n==0)
        {
            return 0;
        }
        return (n%10)+sumOfNumbers(n/10);
    }
}
