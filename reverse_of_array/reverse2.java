import java.util.*;

public class reverse2 {
   public static int[] reverseArray(int arr[])
   {
     int n=arr.length;
     int j=0;
     int i = n-1;
     int ans[] = new int[n];
     while(i>=0)
     {
       ans[j++] = arr[i--];
     }
     return ans;
   }
   public static void main(String args[])
   {
     int arr[] = {1,2,3,4,5};
     System.out.println(Arrays.toString(reverseArray(arr)));
   }
}
   
   
     
   
   

    

