
public class f1 {
    
    public static void main(String[] args) {
        int[] arr = {2, 4, 4, 4, 6, 8, 10};
        int target = 4;

        int low = 0 ;
        int high = arr.length - 1;
        int fastoc=0;
        int lastoc=0;
        int count=(lastoc-fastoc) + 1;

        
        
        

        int mid = ( low + high ) / 2;

        while  (low<=high){
            mid = (low + high)/2;
            if (arr[mid] == target){
                lastoc = mid;
                low = mid +1;
            }
            if (arr[mid] == target){
                fastoc = mid;
                high = mid -1;
                
                
                
            }else if (arr[mid]< target) {
                    low = mid + 1;
            }else{
                    high=mid-1;
                }
            }
            System.out.println("Target occures : "+ count + " times");
        }
        




        
}
