package fibbonaci;

public class RecursiveFibonacci {

  public int calculateWord(int number){
    if(number == 0){
      return 0;
    }else if(number == 1){
      return 1;
    }else if(number > 1){
      return calculateWord(number-1) + calculateWord(number - 2);
    }
    return 0;
  }

}
