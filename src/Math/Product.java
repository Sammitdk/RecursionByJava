package Math;
public class Product
{
    public static void main(String[] args)
    {
        System.out.println(product(123));
    }
    public static int product(int no)
    {
        if(no%10==no)
        {
            return no;
        }
        return (no%10) * product(no/10);
    }
}
