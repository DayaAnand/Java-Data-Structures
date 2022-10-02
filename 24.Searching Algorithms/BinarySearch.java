public class BinarySearch {
    public static void main(String[] args) {
        int[] arr = {8, 9, 12, 15, 17, 19, 20, 21, 28};
        int searchValue = 12;
        int start=0;
        int end=arr.length-1;
        int middle = (start+end)/2;

        while(start<=end && arr[middle]!=searchValue ){
            if(searchValue<arr[middle]){ //search for the element in the left subarray
                end=middle-1;
            }
            else{
                start=middle+1; //search for the element in the right subarray
            }
            middle= (start+end)/2;   
        }
        if(arr[middle]==searchValue){
            System.out.println("The element is found at the index: " + middle);
            return;
        }else{
            System.out.println("The element " + searchValue+ " not found.");
            return;

        }
        
    }   
}
