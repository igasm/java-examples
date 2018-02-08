package algorithms.other;

public class BinarySearchRecursive {

  private int[] arr;
  private int target;

  int binaryFind(int arr[], int target){
    this.arr = arr;
    this.target = target;
    return step(0, arr.length -1);
  }

  private int step(int start, int end){
    int middle = (start + end) / 2;
    if(start <= end) {
      if (arr[middle] == target) {
        return middle;
      } else if (arr[middle] > target) {
        return step(start, middle - 1);
      } else {
        return step(middle + 1, end);
      }
    }
    return -1;
  }


}
