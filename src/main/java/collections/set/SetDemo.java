package collections.set;

import java.util.HashSet;
import java.util.Set;

public class SetDemo {

  public static void main(String[] args) {
    Set<String> set1 = new HashSet <>();
    String item1 = "item1";
    String item2 = "item2";
    set1.add(item1);
    set1.add(item2);

    Set<String> set2 = new HashSet <>();
    set2.add(item2);
    set2.add(item1);

    //if two sets contains the same elements, their hash code should be the same
    System.out.println(set1.hashCode() == set2.hashCode());

  }

}
