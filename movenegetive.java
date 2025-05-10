import java.util.*;

public class movenegetive {
    public static void MoveZero(int arr[]) {
        int low = 0;
        int high = arr.length - 1;
        
        while (low < high) {
            if (arr[low] < 0 && arr[high] > 0) {
                swap(arr, low, high);
                low++;
                high--;
            } else {
                if (arr[low] >= 0) low++;
                if (arr[high] <= 0) high--;
            }
        }
    }

    public static void swap(int arr[], int low, int high) {
        int temp = arr[low];
        arr[low] = arr[high];
        arr[high] = temp;
    }

    public static void main(String args[]) {
        int arr[] = {1, -1, 3, 2, -7, 11, 6};
        MoveZero(arr);
        System.out.print(Arrays.toString(arr));
    }
}