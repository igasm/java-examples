package algorithms.other;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class BinarySearchRecursiveTest {

  BinarySearchRecursive binarySearch = new BinarySearchRecursive();
  int[] array = {-2, -2, 0, 3, 8, 13};

  @DataProvider
  private Object[][] pollOfTargetAndExpectedIndex(){
    return new Object[][]{
        {3, 3},
        {1, -1},
        {0, 2},
        {13, 5},
        {11, -1},
        {20, -1}
    };
  }


  @Test(dataProvider = "pollOfTargetAndExpectedIndex")
  public void test(int target, int expectedIndex){
    int actualIndex = binarySearch.binaryFind(array, target);
    assertEquals(actualIndex, expectedIndex);
  }

}