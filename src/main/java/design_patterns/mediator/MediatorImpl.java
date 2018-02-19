package design_patterns.mediator;

import java.util.HashSet;
import java.util.Set;

public class MediatorImpl implements Mediator {

  private Set<User> users = new HashSet<>();

  @Override
  public void addUser(User user) {
    users.add(user);
  }

  @Override
  public void process(User user, String message) {
    users.stream()
        .filter(u -> !u.equals(user))
        .forEach(u -> u.receive(message));
  }


}
