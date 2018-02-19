package design_patterns.mediator;

public interface Mediator {

  void addUser(User user);

  void process(User user, String message);
}
