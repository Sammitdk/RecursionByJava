package DataStructure;

import java.util.Arrays;

public class SelectionSort
{
    public static void main(String[] args)
    {
        int[] arr = {4,3,2,1};
        bubbleSort(arr,arr.length-1,0,0);
        System.out.println(Arrays.toString(arr));
    }
    public static void bubbleSort(int[] arr,int row,int column,int max)
    {
        if(row == 0)
        {
            return;
        }
        if(column <= row)
        {
            if(arr[column] > arr[max])
            {
                bubbleSort(arr,row,column+1,column);
            }
            else
            {
                bubbleSort(arr,row,column+1,max);
            }
        }
        else
        {
            int temp = arr[max];
            arr[max] = arr[row];
            arr[row] = temp;
            bubbleSort(arr, row - 1, 0, 0);
        }
    }
}
