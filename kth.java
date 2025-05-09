import java.util.*;

public class kth {
    public static int Kthsmallest(int arr[], int k) {
        Arrays.sort(arr);  
        
        return arr[k - 1]; 
    }

    public static void main(String args[]) {
        int arr[] = {9, 25, 10, 15, 1};
        int k = 3;  
        System.out.println("Kth smallest element: " + Kthsmallest(arr, k));
    }
}
