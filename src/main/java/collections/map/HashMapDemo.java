package collections.map;

import java.util.HashMap;
import java.util.IdentityHashMap;
import java.util.Map;

public class HashMapDemo {

  public static void main(String[] args) {
    //hashMap vs identityHashMap
    Map<String, Integer> hashMap = new HashMap<>();
    hashMap.put(new String("a"), 1);
    hashMap.put(new String("a"), 2);
    hashMap.put("a", 3);
    System.out.println("hashMap size: " + hashMap.size());

    Map<String, Integer> identityHashMap = new IdentityHashMap <>();
    identityHashMap.put(new String("a"), 1);
    identityHashMap.put(new String("a"), 2);
    identityHashMap.put("a", 3);
    System.out.println("identityHashMap size: " + identityHashMap.size());
  }

  //flags tests
  private static void flagsTest(){
    for(int i=0; i<100; i++){
      Object o = new Object();
      System.out.println(o.hashCode());
    }
  }

  //same hashCode
  private static void utilSameHashCode(){
    Object first = new Object();
    Object o;
    do {
      o = new Object();
    } while(o.hashCode() != first.hashCode());
    System.out.println(first.hashCode());
  }

}
