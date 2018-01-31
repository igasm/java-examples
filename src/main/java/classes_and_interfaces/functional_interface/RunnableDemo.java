package classes_and_interfaces.functional_interface;

public class RunnableDemo {


  public static void main(String[] args) {
    Runnable r = () -> System.out.println("Run!");
    UsingRunnable runnableDemo = new UsingRunnable();
    runnableDemo.runMe(r);
  }

}


