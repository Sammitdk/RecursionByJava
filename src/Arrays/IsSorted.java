package Arrays;
public class IsSorted
{
    public static void main(String[] args)
    {
        int[] arr = {20,40,50,80,100};
        System.out.println(isSorted(arr,0, arr.length-1));
    }
    public static boolean isSorted(int[] arr,int start,int end)
    {
        if(arr[start]==arr[end])
        {
            return true;
        }
        if (arr[start] < arr[start+1])
        {
            return isSorted(arr,++start,end);
        }
        return false;
    }
}
