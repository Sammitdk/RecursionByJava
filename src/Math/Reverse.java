package Math;
public class Reverse
{
    static int sum;
    public static void main(String[] args)
    {
        reverse(4321);
        System.out.println(sum);
    }
    public static void reverse(int no)
    {
        if(no == 0)
        {
            return;
        }
        int rem = no % 10;
        sum = sum * 10 + rem;
        reverse(no/10);
    }
}
