package algorithms.other;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;

public class Max {

  public <T extends Comparable> T maxForArray(T[] array){
    if(array == null || array.length == 0){
      throw new IllegalArgumentException("array cannot be null or empty");
    }else{
      T result = array[0];
      for (int i = 1; i < array.length; i++) {
        if (result.compareTo(array[i]) < 0) {
          result = array[i];
        }
      }
      return result;
    }
  }

  public <T extends Comparable> T maxForList(List<T> list){
    if(list == null || list.isEmpty()){
      throw new IllegalArgumentException("array cannot be null or empty");
    }else{
      Iterator<T> it = list.listIterator();
      T result = it.next();
      while(it.hasNext()){
        T current = it.next();
        if(result.compareTo(current) < 0){
          result = current;
        }
      }
      return result;
    }
  }

  public <T extends Comparable> T maxForCollection(Collection<T> collection){
    if(collection == null || collection.isEmpty()){
      throw new IllegalArgumentException("array cannot be null or empty");
    }else{
      Iterator<T> it = collection.iterator();
      T result = it.next();
      while(it.hasNext()){
        T current = it.next();
        if(result.compareTo(current) < 0){
          result = current;
        }
      }
      return result;
    }
  }
}
