package algorithms.other;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import static org.testng.Assert.*;

public class MaxTest {

  Max max = new Max();

  @DataProvider
  private Object[][] poolOfArrays(){
    return new Object[][]{
        {1},
        {0, 1},
        {0, 20, 100},
        {-100, 0, 1},
        {-1, -100, -50},
        {-100, -50, -1},
        {-50, -1, -100}
    };
  }

  @Test(dataProvider = "poolOfArrays")
  public void testing_maxForArray(Integer[] array){
    Integer actualResult = max.maxForArray(array);
    Arrays.sort(array);
    Integer expectedResult = array[array.length - 1];
    assertEquals(actualResult, expectedResult);
  }

  @Test(dataProvider = "poolOfArrays")
  public void testing_maxForList(Integer[] array){
    List<Integer> list = Arrays.asList(array);
    Integer actualResult = max.maxForList(list);
    Collections.sort(list);
    Integer expectedResult = list.get(list.size()-1);
    assertEquals(actualResult, expectedResult);
  }

  @Test(dataProvider = "poolOfArrays")
  public void testing_maxForCollection(Integer[] array){
    Set<Integer> set = new HashSet <>(Arrays.asList(array));
    Integer actualResult = max.maxForCollection(set);
    Arrays.sort(array);
    Integer expectedResult = array[array.length - 1];
    assertEquals(actualResult, expectedResult);
  }
}