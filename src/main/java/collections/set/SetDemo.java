package collections.set;

import java.util.Comparator;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

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

    //--> TREE SET <--//
    //this will not compile
    TreeSet<Integer> treeSet = new TreeSet <>();
    treeSet.add(1);
    treeSet.add(2);
//    treeSet.add(null); //this will throw NullPointerException

    //the only way to makes TreeSet works with nulls is to deliver own implementation of Comparator
    IntComparator comparator = new IntComparator();
    TreeSet<Integer> treeSetWithNull = new TreeSet <>(comparator);
    treeSetWithNull.add(null);
    treeSetWithNull.add(3);
  }


  static class IntComparator implements Comparator<Integer> {
    @Override
    public int compare(Integer o1, Integer o2) {
      if(o1==null){
        return -1;
      }else if(o2==null){
        return 1;
      }else{
        return o1.compareTo(o2);
      }
    }
  }

}
