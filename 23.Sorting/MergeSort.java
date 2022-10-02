public class MergeSort {

  static void merge(int[] A, int left, int middle, int right) {
    //temp arrays for storing the left part of the array and the right part of the array
    int[] leftTmpArray = new int[middle-left+2];
    int[] rightTmpArray = new int[right-middle+1];
    for (int i=0; i<=middle-left; i++) {
      leftTmpArray[i] = A[left+i];
    }
    for (int i=0; i<right-middle; i++) {
      rightTmpArray[i] = A[middle+1+i];
    }


    leftTmpArray[middle-left+1] = Integer.MAX_VALUE;
    rightTmpArray[right-middle] = Integer.MAX_VALUE;

    int i = 0, j = 0;
    for (int k = left; k<=right; k++) {
      if (leftTmpArray[i] < rightTmpArray[j]) {
        A[k] = leftTmpArray[i];
        i++;
      } else {
        A[k] = rightTmpArray[j];
        j++;
      }

    }

  }

  public void mergeSort(int[] Array, int left, int right) {
    if (right > left) {
      int m = (left+right)/2;
      mergeSort(Array, left, m); //merge sort is achieved by recursion
      mergeSort(Array, m+1, right);
      merge(Array, left, m, right);
    }
  }



	public void printArray(int []array) {
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i]+"  ");
		}
	}
  public static void main(String[] args) {
    int array[] = {10,3,2,5,8,4,3,1,2,9,7,8};
    MergeSort ms = new MergeSort();
    ms.mergeSort(array, 0, array.length-1);
    ms.printArray(array);
  }

}


