
public class f1 {
    
    public static void main(String[] args) {
        int[] arr = {2, 4, 4, 4, 6, 8, 10};
        int target = 4;

        int low = 0 ;
        int high = arr.length - 1;
        int index =0;
        

        int mid = ( low + high ) / 2;

        while  (low<=high){
            mid = (low + high)/2;
            if (arr[mid] == target){
                index = mid;
                high = mid-1;
                
                
            }else if (arr[mid]< target) {
                    low = mid + 1;
            }else{
                    high=mid-1;
                }
            }
            System.out.println("Last occurrence found at index:"+index);
        }
        




        
}
