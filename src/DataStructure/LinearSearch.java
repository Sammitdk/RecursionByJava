package DataStructure;
import java.util.Arrays;
public class LinearSearch
{
    public static void main(String[] args)
    {
        int[] arr = {23,34,1,45,63,53};
        System.out.println(linearSearch(arr,0,45));

    }
    public static boolean linearSearch(int[] arr,int start,int target)
    {
        if(start == arr.length)
        {
            return false;
        }
        return arr[start] == target || linearSearch(arr,++start,target);
    }
}
