package design_patterns.observer.observer;

import design_patterns.observer.subject.Move;

public class Controller implements Observer {

  @Override
  public void update(Move move) {
    System.out.println("Controller received move: " + move);
  }

}
