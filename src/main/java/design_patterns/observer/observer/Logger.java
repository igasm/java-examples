package design_patterns.observer.observer;

import design_patterns.observer.subject.Move;

public class Logger implements Observer {

  @Override
  public void update(Move move) {
    System.out.println("Logger received move: " + move);
  }

}
