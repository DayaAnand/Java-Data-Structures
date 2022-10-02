public class InsertionSort {
    public static void main(String[] args) {
        int arr[] ={10,3,2,5,8,4,3,1};
        int n=arr.length;
        for(int i=1;i<n;i++){
            int temp=arr[i],j=i; //temp is very important here. If we do not use temp here then it will print 10 to the size of the array.
            while(j>0 && arr[j-1]>temp){
                arr[j]=arr[j-1];
                j--;
            }
            arr[j]=temp;
        }

        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
    }
}

