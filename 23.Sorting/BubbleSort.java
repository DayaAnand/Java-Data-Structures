class BubbleSort{
    public static void main(String[] args) {
        int arr[] = {10,5,30,15,50,6};
        int n=arr.length;

        for(int i=0;i<n-1;i++){
            for(int j=0;j<n-i-1;j++){ //we are including j<n-i-1 as the last element will get sorted so to reduce time complexity we do this. It will also work for j<n-1 but will also check for the last element which is of no use
                if(arr[j]>arr[j+1]){
                    int temp = arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }

        // for(int i:arr){ --> we can also use this for each loop
        //     System.out.print(i+" ");
        // }

        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
    }
}

// Visualization of the code: 
// https://cscircles.cemc.uwaterloo.ca/java_visualize/#code=public+class+BubbleSort%7B%0A++++public+static+void+main(String%5B%5D+args)+%7B%0A++++++++int+arr%5B%5D+%3D+%7B5,1,3,9,0%7D%3B%0A++++++++int+n%3Darr.length%3B%0A++++++++for(int+i%3D0%3Bi%3Cn-1%3Bi%2B%2B)%7B%0A++++++++++++for(int+j%3D0%3Bj%3Cn-1%3Bj%2B%2B)%7B%0A++++++++++++++++if(arr%5Bj%5D%3Earr%5Bj%2B1%5D)%7B%0A++++++++++++++++++++int+temp+%3D+arr%5Bj%5D%3B%0A++++++++++++++++++++arr%5Bj%5D%3Darr%5Bj%2B1%5D%3B%0A++++++++++++++++++++arr%5Bj%2B1%5D%3Dtemp%3B%0A++++++++++++++++%7D%0A++++++++++++%7D%0A++++++++%7D%0A%0A++++%7D%0A%7D&mode=display&curInstr=88