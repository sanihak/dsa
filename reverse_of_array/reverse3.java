import java.util.*;
public class reverse3 {
   
    public static int[] reverseArray(int arr[])
    {
        int n = arr.length;
        int left = 0;
        int right = n-1;
        while(left<right)
        {
            swapArray(arr, left, right);
            left++;
            right--;
        }
        return arr;
    }
    public static void swapArray(int arr[] ,int left, int right)
    {
        int temp = arr[left];
        arr[left] = arr[right];
        arr[right]  = temp;
    }
    public static void main(String args[]){
        int arr[] = {5,4,3,2,1};
        System.out.println(Arrays.toString(reverseArray(arr)));
    }
    
}
