package algorithms.sorting;

public class BubbleSort {

  private int[] array;

  public BubbleSort(int[] array) {
    this.array = array;
  }

  public int[] sort(){
    do{
    }while (makeSinglePass());
    return array;
  }

  private boolean makeSinglePass(){
    boolean wasSwapMade = false;
    for(int i=0; i<array.length-1; i++){
      if(array[i] > array[i+1]){
        swap(i, i+1);
        wasSwapMade = true;
      }
    }
    return wasSwapMade;
  }

  private void swap(int indexOfFirst, int indexOfSecond) {
    int firstValue = array[indexOfSecond];
    int secondValue = array[indexOfFirst];
    array[indexOfFirst] = firstValue;
    array[indexOfSecond] = secondValue;
  }
}
