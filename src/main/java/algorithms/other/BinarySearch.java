package algorithms.other;

public class BinarySearch {

  public int binaryFind(int arr[], int target){
    int start = 0;
    int end = arr.length-1;
    int middle;

    while(start <= end){

      middle = (start + end) / 2;

      if(arr[middle] == target){
        return middle;
      } else if(arr[middle] > target){
        end = middle - 1; //go to the left part
      } else {
        start = middle + 1; //go to the right part
      }

    }

    return -1;
  }

}
