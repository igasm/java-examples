package classes_and_interfaces;

//old-fashioned way before lambdas
public class AnonymousClassDemo {
  public static void main(String[] args) {
    new Thread(
        new Runnable() {
          @Override
          public void run() {
            System.out.println("running");
          }
        }
    ).start();
  }
}
