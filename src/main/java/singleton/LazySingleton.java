package singleton;

//non-lazy created but proper for multiple threads
public class LazySingleton {

  //initialized once by class-loader
  private static LazySingleton instance;

  private LazySingleton() {
  }

  public static synchronized LazySingleton getInstance(){
    if( instance == null ) {
      instance = new LazySingleton();
    }
    return instance;
  }

}
