public class SelectionSort {
    public static void main(String[] args) {
        int arr[] = {10,2,5,8,1,9};
        int n=arr.length;

        for(int i=0;i<n;i++){
            int minIndex=i;
            for(int j=i+1;j<n;j++){
                if(arr[j]<arr[minIndex]){
                    minIndex=j;
                }
            }
            if(minIndex!=i){ //optimization --> when we have already placed the element at right place so no need of swap - see visualization to get it more clear
                int temp=arr[i];
                arr[i]=arr[minIndex];
                arr[minIndex]=temp;
            }
        }

        for(int k=0;k<n;k++){
            System.out.print(arr[k]+" ");
        }
    }
}


// Visualization of the code:
// https://cscircles.cemc.uwaterloo.ca/java_visualize/#code=public+class+SelectionSort+%7B%0A++++public+static+void+main(String%5B%5D+args)+%7B%0A++++++++int+arr%5B%5D+%3D+%7B10,2,5,8,1,9%7D%3B%0A++++++++int+n%3Darr.length%3B%0A%0A++++++++for(int+i%3D0%3Bi%3Cn%3Bi%2B%2B)%7B%0A++++++++++++int+minIndex%3Di%3B%0A++++++++++++for(int+j%3Di%2B1%3Bj%3Cn%3Bj%2B%2B)%7B%0A++++++++++++++++if(arr%5Bj%5D%3Carr%5BminIndex%5D)%7B%0A++++++++++++++++++++minIndex%3Dj%3B%0A++++++++++++++++%7D%0A++++++++++++%7D%0A++++++++++++if(minIndex!%3Di)%7B+//optimization%0A++++++++++++++++int+temp%3Darr%5Bi%5D%3B%0A++++++++++++++++arr%5Bi%5D%3Darr%5BminIndex%5D%3B%0A++++++++++++++++arr%5BminIndex%5D%3Dtemp%3B%0A++++++++++++%7D%0A++++++++%7D%0A%0A++++++++for(int+k%3D0%3Bk%3Cn%3Bk%2B%2B)%7B%0A++++++++++++System.out.print(arr%5Bk%5D%2B%22+%22)%3B%0A++++++++%7D%0A++++%7D%0A%7D%0A&mode=display&curInstr=116
