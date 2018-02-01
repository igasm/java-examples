package fibbonaci;

import org.testng.annotations.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class RecursiveFibonacciTest {

  RecursiveFibonacci recursiveFibbonaci = new RecursiveFibonacci();

  @Test
  public void whenCalculatingF0_expectedResultIs0(){
    assertThat(recursiveFibbonaci.calculateWord(0)).isEqualTo(0);
  }

  @Test
  public void whenCalculatingF1_expectedResultIs1(){
    assertThat(recursiveFibbonaci.calculateWord(1)).isEqualTo(1);
  }

  @Test
  public void whenCalculatingF2_expectedResultIs1(){
    assertThat(recursiveFibbonaci.calculateWord(2)).isEqualTo(1);
  }

  @Test
  public void whenCalculatingF3_expectedResultIs2(){
    assertThat(recursiveFibbonaci.calculateWord(3)).isEqualTo(2);
  }

  @Test
  public void whenCalculatingF10_expectedResultIs55(){
    assertThat(recursiveFibbonaci.calculateWord(10)).isEqualTo(55);
  }

  @Test
  public void whenCalculatingF19_expectedResultIs4181(){
    assertThat(recursiveFibbonaci.calculateWord(19)).isEqualTo(4181);
  }
}