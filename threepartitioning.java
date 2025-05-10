import java.util.*;
public class threepartitioning {
    public static void ThreePart(int arr[] , int low, int high){
        int n = arr.length;
        int start = 0;
        int mid = 0;
        int end = n-1;
        while(mid<=end){
            if(arr[mid] < low){
                swap(arr,mid,start);
                start++;
                mid++;
            }
            
            else if(arr[mid] > high){
                swap(arr,mid,end);
                end--;
            }
            else{
                mid++;

            }
        }
    }
    public static void swap(int arr[] , int start , int end){
        int temp = arr[start];
        arr[start] = arr[end];
        arr[end] = temp;
    }
    public static void main(String args[]){
        int arr[] ={1,14,5,20,4,2,54,20,87,98,3,1};
        int low = 14;
        int high = 20;
        ThreePart(arr, low, high);
        System.out.println(Arrays.toString(arr));
    }
    
}
