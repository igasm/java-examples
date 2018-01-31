package generics.with_methods;

import org.testng.annotations.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class ClassWithGenericsMethodsTest {

  ClassWithGenericsMethods classWithGenericsMethods = new ClassWithGenericsMethods();

  @Test
  public void whenUsingtoIntegerMethodWithDoubleValueThatCanBeRoundedTo2_expectedToReturn2(){
    Double value = new Double(2.3);
    assertThat(classWithGenericsMethods.toInteger(value)).isEqualTo(2);
  }

  @Test
  public void whenUsingtoIntegerMethodWithIntegerWhichEquals2_expectedToReturn2(){
    Integer value = new Integer(2);
    assertThat(classWithGenericsMethods.toInteger(value)).isEqualTo(2);
  }

  //this will not compile due to fact that
  //String does not extends Number class
//  @Test
//  public void test(){
//    String value = new String("aa");
//    assertThat(classWithGenericsMethods.toInteger(value)).isEqualTo(2);
//  }

  @Test
  public void test(){
    Number value = new Integer(2);
    assertThat(classWithGenericsMethods.toInteger(value)).isEqualTo(2);
  }

}