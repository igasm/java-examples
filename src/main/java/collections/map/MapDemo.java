package collections.map;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class MapDemo {

  public static void main(String[] args) {
    //elements
    String item1 = "zxy key1";
    String item2 = "hijklmn key2";
    String item3 = "efg key3";
    String item4 = "abcd key4";

    //hash map - does not keep elements value
    Map<String, String > hashMap = new HashMap <>();
    hashMap.put(item1, "item 1 value");
    hashMap.put(item2, "item 2 value");
    hashMap.put(item3, "item 3 value");
    hashMap.put(item4, "item 4 value");
    System.out.println("HashMap: " + hashMap);

    //tree map - element sorted in the natural ordering of keys (because no Comparator was provided)
    Map<String, String > treeMap = new TreeMap <>();
    treeMap.put(item1, "item 1 value");
    treeMap.put(item2, "item 2 value");
    treeMap.put(item3, "item 3 value");
    treeMap.put(item4, "item 4 value");
    System.out.println("TreeMap: " + treeMap);

    //linked has map - remember the order of adding elements
    Map<String, String > linkedHashMap = new LinkedHashMap <>();
    linkedHashMap.put(item1, "item 1 value");
    linkedHashMap.put(item2, "item 2 value");
    linkedHashMap.put(item3, "item 3 value");
    linkedHashMap.put(item4, "item 4 value");
    System.out.println("LinkedHashMap: " + linkedHashMap);
  }

}
