package generics.with_methods;

import java.io.InputStream;
import java.io.Serializable;
import java.util.List;

public class ClassWithGenericsMethods {

  public <T> void print(T value){
    System.out.println(value);
  }

  public <T, R> R perform(T value){
    return (R) value;
  }

  void sort(List<Integer> list){
    //implementation
  }

  //this will not compile due to type erasure
//  void sort(List<String> anotherList){
//    //implementation
//  }

  //this will not compile
  //instanceof cannot be used with generic type
//  public <T> void action(T action){
//    if( action instanceof T){
//      //some code here
//    }
//  }

  //this will not compile
//  public<T> void create(T value){
//    T newValue = new T();
//  }

  //---> usage of extends <---

  //indicating that generic type must be subclass of Number
  public <T extends Number> int toInteger(T value){
    return value.intValue();
  }

  //indicating that generic type must implements interface
  public <T extends Serializable> void store(T object){
    //implementation
  }
  
}
