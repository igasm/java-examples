package classes_and_interfaces.immutability;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

import static org.assertj.core.api.Assertions.*;
import static org.testng.Assert.assertEquals;

public class ImmutableClassTest {

  String[] simpleArray;
  List<String> simpleList;
  ImmutableClass immutableClass;

  @BeforeMethod
  private void setUp(){
    simpleArray = new String[]{"aa", "bb", "cc"};
    simpleList = new ArrayList <>();
    simpleList.add("first item");
    simpleList.add("second item");

    immutableClass = new ImmutableClass(1, simpleArray, simpleList);
  }

  @Test
  public void whenChangingElementsOfSimpleArray_expectedArrayInsideImmutableClassNottoChange(){
    String[] originalArray = Arrays.copyOf(simpleArray, simpleArray.length);
    simpleArray[0] = "xx";
    assertThat(immutableClass.getArrayOfStrings()).isEqualTo(originalArray);
  }

  @Test
  public void whenChangingElementsOfSimpleList_expectedListInsideImmutableClassNotToChange(){
    List<String> originalList = new ArrayList <>(simpleList);
    simpleList.add("third item");
    assertEquals(immutableClass.getCollectionOfString(), originalList);
  }

  @Test(expectedExceptions = UnsupportedOperationException.class)
  public void whenGettingListAndChangingIt_expectedUnsupportedOperationExceptionToBeThrown(){
    Collection<String> list = immutableClass.getCollectionOfString();
    list.add("xxx");
  }

  @Test
  public void whenGettingArrayAndChangingIt_expectedArrayInsideImmutableCollectionToNotBeChanged(){
    String[] array = immutableClass.getArrayOfStrings();
    array[0] = "xx";
    assertEquals(simpleArray, immutableClass.getArrayOfStrings());
  }

}