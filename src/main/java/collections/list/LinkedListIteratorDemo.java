package collections.list;

import java.util.ConcurrentModificationException;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class LinkedListIteratorDemo {

  public static void main(String[] args) {
    List<String> strings = new LinkedList <>();
    strings.add("item1");
    strings.add("item2");
    strings.add("item3");

    ListIterator<String> iter1 = strings.listIterator();
    ListIterator<String> iter2 = strings.listIterator();

    //if one iterator modifies collection
    //and there is also second iterator for the same collection
    //ConcurrentModificationException may happen
    try {
      String item1 = iter1.next();
      System.out.println("First element: " + item1);
      iter1.set(item1 + "_changed");
      System.out.println("Changing first element: " + strings);
      System.out.println("First element: " + item1);
      iter1.remove();
      System.out.println(strings);
      iter2.next(); ///should throw exception
    } catch (ConcurrentModificationException ex){
      System.out.println("uuups! Two iterators for one list are not such good idea");
    }

  }


}
