package singleton;

//it may create many instances of the class if called concurrently by multiple threads
public class NaiveSingleton {

  private static NaiveSingleton instance;

  private NaiveSingleton() {
  }

  public static NaiveSingleton getInstance(){
    if(instance == null){
      instance = new NaiveSingleton();
    }
    return instance;
  }

}
