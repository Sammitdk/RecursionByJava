package Arrays;
import java.util.ArrayList;
public class FindIndex
{
    static ArrayList<Integer> list = new ArrayList<>();
    public static void main(String[] args)
    {
        int[] arr = {21,44,22,44,52,55,44,21};
        int target = 44;
        findIndex(arr,target,0);
    }
    public static void findIndex(int[] arr,int target,int index)
    {
        if(arr.length == index)
        {
            System.out.println(list);
            return;
        }
        if(arr[index] == target)
        {
            list.add(index);
        }
        findIndex(arr,target,++index);
    }
}
