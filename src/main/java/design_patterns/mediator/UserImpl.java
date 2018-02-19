package design_patterns.mediator;

public class UserImpl implements User {

  private final String name;
  private final Mediator mediator;

  public UserImpl(String name, Mediator mediator) {
    this.name = name;
    this.mediator = mediator;
  }

  @Override
  public void send(String message) {
    mediator.process(this, message);
  }

  @Override
  public void receive(String message) {
    System.out.println(name + " received message: " + message);
  }
}
