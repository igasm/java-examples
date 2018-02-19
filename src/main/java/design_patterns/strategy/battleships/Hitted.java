package design_patterns.strategy.battleships;

public class Hitted implements Behaviour {
  @Override
  public String getMessage() {
    return "Hit!";
  }
}
