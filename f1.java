
import java.util.Arrays;

public class f1 {

    public int binarySearch(int[] arr, int size, int target) {
        int low = 0;
        int high = size - 1;

        while (low <= high) {
            int mid = (low + high) / 2;

            if (arr[mid] == target) {
                return mid;
            } else if (arr[mid] > target) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }

        return -1;
    }
    public static void main(String[] args) {
        int[] b = {5, 15, 25, 35, 45};
        System.out.println(Arrays.toString(b));
        

        // BINARY SEARCH
        int[] even = {1,5,6,9,34,56};
        int[] odd = {2,4,6,8,6,56};

        int index = binarySearch(even,6,56);
        System.out.println("index"+ index);
        










        }
  



    
}
