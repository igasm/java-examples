package singleton;

//non-lazy created but proper for multiple threads
public class EagerSingleton {

  //initialized once by class-loader
  private static EagerSingleton instance = new EagerSingleton();

  private EagerSingleton() {
  }

  public static EagerSingleton getInstance(){
    return instance;
  }

}
