package design_patterns.strategy.battleships;

public class Missed implements Behaviour {
  @Override
  public String getMessage() {
    return "Missed";
  }
}
