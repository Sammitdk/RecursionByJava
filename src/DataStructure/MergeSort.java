// Time Complexity
// n is the total number of comparisons
// log N is the total levels
// It is the time complexity of Merge Sort O(n * log N)

// Space Complexity
// N is the max height of tree / extra space
// It is the space complexity O(N)
    
package DataStructure;
import java.util.Arrays;
public class MergeSort
{
    public static void main(String[] args)
    {
        int[] arr = {5,4,3,2,1};
        int[] ans = mergeSort(arr);
        System.out.println(Arrays.toString(ans));
    }
    public static int[] mergeSort(int[] arr)
    {
        if(arr.length == 1)
        {
            return arr;
        }
        int mid = arr.length/2;
        int[] left = mergeSort(Arrays.copyOfRange(arr,0,mid));
        int[] right = mergeSort(Arrays.copyOfRange(arr,mid,arr.length));
        return  merge(left,right);
    }
    public static int[] merge(int[] left,int[] right)
    {
        int[] arr = new int[left.length+right.length];
        int i = 0;
        int j = 0;
        int k = 0;
        while(i< left.length && j< right.length)
        {
            if(left[i]<right[j])
            {
                arr[k] = left[i];
                i++;
            }
            else
            {
                arr[k] = right[j];
                j++;
            }
            k++;
        }
        while (i < left.length)
        {
            arr[k] = left[i];
            i++;
            k++;
        }
        while (j < right.length)
        {
            arr[k] = right[j];
            j++;
            k++;
        }
        return arr;
    }
}
