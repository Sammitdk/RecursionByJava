// leet code #1342
// Number of steps to reduce number to Zero.
package Math;
public class NumberOfSteps
{
    public static void main(String[] args)
    {
        System.out.println(steps(8,0));
    }
    public static int steps(int arr,int count)
    {
        if(arr == 0)
        {
            return count;
        }
        if(arr%2!=0)
        {
            return steps(arr-1,count+1);
        }
        return steps(arr/2,count+1);
    }
}
