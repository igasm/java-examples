package hashCode;

import java.util.HashMap;

public class HashCodeDemo {

  public static void main(String[] args) {
    Employee e1 = new Employee("Alan", "Smith");
    Employee e2 = new Employee("Matt", "Smith");
    Employee e3 = new Employee("Alan", "Smith");
    System.out.println(e1.hashCode() + ", " + e2.hashCode() + ", " + e3.hashCode());

    String aa = "aa";
    aa.hashCode();

    HashMap<String, Employee> employeeHashMap = new HashMap <>();
    employeeHashMap.put("e1", e1);
    employeeHashMap.get("e1");
    employeeHashMap.containsKey("e1");
    employeeHashMap.containsValue(e1);
    employeeHashMap.remove("e1");

  }

}
