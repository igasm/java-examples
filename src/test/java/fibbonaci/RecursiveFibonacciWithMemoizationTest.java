package fibbonaci;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class RecursiveFibonacciWithMemoizationTest {

  RecursiveFibonacciWithMemoization recursiveFibonacci = new RecursiveFibonacciWithMemoization();

  @DataProvider
  private Object[][] resultsPoolForNumber(){
    return new Object[][] {
        {0, 0},
        {1, 1},
        {2, 1},
        {3, 2},
        {10, 55},
        {19, 4181},
        {30, 832040},
        {45, 1134903170}
    };
  }

  @Test(dataProvider = "resultsPoolForNumber")
  public void whenCalculatingNumber_expectedResult(int number, int result){
    assertThat(recursiveFibonacci.calculateWord(number)).isEqualTo(result);
  }

}