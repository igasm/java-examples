package fibbonaci;

import java.util.HashMap;
import java.util.Map;

public class RecursiveFibonacciWithResultsCaching {

  private final Map<Integer, Integer> resultMap = new HashMap <>();

  public int calculateWord(int number){
    if(number == 0){
      return 0;
    }else if(number == 1){
      return 1;
    }else if(number > 1){

      if(resultMap.containsKey(number)){
        return resultMap.get(number);
      }else{
        Integer result = calculateWord(number-1) + calculateWord(number - 2);
        resultMap.put(number, result);
        return result;
      }

    }
    return 0;
  }

}
