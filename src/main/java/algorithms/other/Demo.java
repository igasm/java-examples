package algorithms.other;

import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;

public class Demo {

  public static void main(String[] args) {
    String demo = "King";
    int hashCode = demo.hashCode();
    int size = 16;
    int index = hashCode % (size);
    int index2 = hashCode & (size-1);

    HashMap<String, String> hm = new HashMap<>();
    hm.put(null, "ello");
    hm.put(null, "hello");
    hm.put("a", "test1");
    hm.put("a", "test2");

    System.out.println(hm.size());
    System.out.println(hm.get(null));
    System.out.println(hm.get("a"));

  }



}
