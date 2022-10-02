public class LInearSearch {
    public static void main(String[] args) {
        int[] arr = {8, 9, 12, 15, 17, 19, 20, 21, 28};
        int k = 15; //enter the element to search in the array
        for(int i=0;i<arr.length;i++){
            if(arr[i]==k){
                System.out.println("The Element "+k+" is present in the position "+i);
                return;
            }
        }
    }
}
