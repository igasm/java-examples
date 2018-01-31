package classes_and_interfaces.immutability;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;


public class ImmutableClass {
  //firstly, all of fields should be final
  private final long id;
  private final String[] arrayOfStrings;
  private final Collection<String> collectionOfString;

  //secondly proper initialization
  //should provide copy of array or list, not reference to array, to avoid changing it from outside
  public ImmutableClass(long id, String[] arrayOfStrings, Collection <String> collectionOfString) {
    this.id = id;
    this.arrayOfStrings = Arrays.copyOf(arrayOfStrings, arrayOfStrings.length);
    this.collectionOfString = new ArrayList <>(collectionOfString);
  }

  //provide proper getters with immutable view
  public Collection<String> getCollectionOfString() {
    return Collections.unmodifiableCollection(collectionOfString);
  }

  public String[] getArrayOfStrings() {
    return Arrays.copyOf(arrayOfStrings, arrayOfStrings.length);
  }
}
