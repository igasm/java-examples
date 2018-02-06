package algorithms.sorting;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.util.Arrays;

import static org.assertj.core.api.Assertions.assertThat;

public class BubbleSortTest {

  @DataProvider
  private Object[][] pollOfArrays(){
    return new Object[][]{
       {2, 1},
       {3, 2, 1},
       {5, 1, 4, 2, 8},
       {5, 1, 5, 2, 8},
       {0, 1, 0, 2, 8},
       {0, -1, 0, -2, -8}
    };
  }

  @Test(dataProvider = "pollOfArrays")
  public void testOfProperSorting(int[] unsortedArray){
    BubbleSort bubbleSort = new BubbleSort(unsortedArray);
    int[] sortResult = bubbleSort.sort();
    int[] sortedByJavaUtils = Arrays.copyOf(unsortedArray, unsortedArray.length);
    Arrays.sort(sortedByJavaUtils);
    assertThat(sortResult).isEqualTo(sortedByJavaUtils);
  }

}