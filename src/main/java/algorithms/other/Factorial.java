package algorithms.other;

public class Factorial {

  public int computeRecursive(int n){
    if(n <= 0){
      return 1;
    }else{
      return n * computeRecursive(n-1);
    }
  }

  public int computeWithLoop(int n){
    int result = 1;
    while(n > 0){
      result *= n;
      n--;
    }
    return result;
  }

}
