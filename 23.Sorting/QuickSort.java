public class QuickSort {

  static int partition(int[] array, int start, int end) {
    int pivot = end;
    int i = start - 1;
    for (int j= start; j<=end; j++) { 
      if (array[j] <= array[pivot]) {
        i++;
        int temp = array[i]; //swapping the elements
        array[i] = array[j];
        array[j] = temp;
      }
    }
    return i; //returning the pivot index
  }

  public static void quickSort(int[] array, int start, int end) {
    if (start < end) {
      int pivot = partition(array, start, end); //used recursion
      quickSort(array, start, pivot -1);
      quickSort(array, pivot + 1, end);
    }
  }

	public static void printArray(int []array) {
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i]+"  ");
		}
	}
  public static void main(String[] args) {
    int array[] = {10,3,2,7,7,5,8,4,1,2,9,7,8,11};
    quickSort(array, 0, array.length-1);
    printArray(array);
  }
}

// Visualization of the code:
// https://cscircles.cemc.uwaterloo.ca/java_visualize/#code=public+class+QuickSort+%7B%0A%0A++static+int+partition(int%5B%5D+array,+int+start,+int+end)+%7B%0A++++int+pivot+%3D+end%3B%0A++++int+i+%3D+start+-+1%3B%0A++++for+(int+j%3D+start%3B+j%3C%3Dend%3B+j%2B%2B)+%7B+%0A++++++if+(array%5Bj%5D+%3C%3D+array%5Bpivot%5D)+%7B%0A++++++++i%2B%2B%3B%0A++++++++int+temp+%3D+array%5Bi%5D%3B%0A++++++++array%5Bi%5D+%3D+array%5Bj%5D%3B%0A++++++++array%5Bj%5D+%3D+temp%3B%0A++++++%7D%0A++++%7D%0A++++return+i%3B%0A++%7D%0A%0A++public+static+void+quickSort(int%5B%5D+array,+int+start,+int+end)+%7B%0A++++if+(start+%3C+end)+%7B%0A++++++int+pivot+%3D+partition(array,+start,+end)%3B%0A++++++quickSort(array,+start,+pivot+-1)%3B%0A++++++quickSort(array,+pivot+%2B+1,+end)%3B%0A++++%7D%0A++%7D%0A%0A%09public+static+void+printArray(int+%5B%5Darray)+%7B%0A%09%09for+(int+i+%3D+0%3B+i+%3C+array.length%3B+i%2B%2B)+%7B%0A%09%09%09System.out.print(array%5Bi%5D%2B%22++%22)%3B%0A%09%09%7D%0A%09%7D%0A++public+static+void+main(String%5B%5D+args)+%7B%0A++++int+array%5B%5D+%3D+%7B10,3,2,7,8%7D%3B%0A++++quickSort(array,+0,+array.length-1)%3B%0A++++printArray(array)%3B%0A++%7D%0A%7D%0A&mode=display&curInstr=0
