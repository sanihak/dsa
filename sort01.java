import java.util.*;
public class sort01 {
    public static void sort01(int arr[]){
        int n =arr.length;
        int low = 0;
        int high = n-1;
        while(low<high){
            if(arr[low] == 1 && arr[high] == 0){
                swap(arr,low,high);
            }
            else{
                low++;
                high--;
            }
        }
        
    }
    public static void swap(int arr[] , int low,int high){
            int temp = arr[low];
            arr[low] = arr[high];
            arr[high] = temp;
        }
    public static void main(String args[]){
        int arr[] = {1,0,0,1,1,0};
        sort01(arr);
        for( int nums:arr){
            System.out.print(nums +" ");

        }
        
    }
    }
    

