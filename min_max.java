import java.util.*;

public class min_max {
    public static int[] largest(int arr[])
    {
      int n=arr.length;
      int max = Integer.MIN_VALUE;
      int min = Integer.MAX_VALUE;
      for(int i=0;i<n;i++)
      {
        if(arr[i]>max){
          max = arr[i];
          
        }
        if(arr[i]<min){
          min=arr[i];
        }
        
      }
      return new int[] {min,max};
      
    }
    public static void main(String args[]){
      int arr[] ={9,25,15,10,1};
      System.out.println(Arrays.toString(largest(arr)));
    }
  }