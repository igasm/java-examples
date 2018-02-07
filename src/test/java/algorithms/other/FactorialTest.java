package algorithms.other;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class FactorialTest {

  Factorial factorial = new Factorial();

  @DataProvider
  private Object[][] poolOfNAndResults(){
    return new Object[][]{
        {0, 1},
        {4, 24},
        {5, 120},
        {6, 720}
    };
  }

  @Test(dataProvider = "poolOfNAndResults")
  public void testResultOfComputingFactorialRecursiveWay(int n, int expectedResult){
    int actualResult = factorial.computeRecursive(n);
    assertThat(actualResult).isEqualTo(expectedResult);
  }

  @Test(dataProvider = "poolOfNAndResults")
  public void testResultOfComputingFactorialRecursiveWithLoop(int n, int expectedResult){
    int actualResult = factorial.computeWithLoop(n);
    assertThat(actualResult).isEqualTo(expectedResult);
  }

}