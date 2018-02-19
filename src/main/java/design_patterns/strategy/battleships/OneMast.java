package design_patterns.strategy.battleships;

public class OneMast implements Ship{

  private Behaviour behaviour;

  @Override
  public void setBehaviour(Behaviour behaviour) {
    this.behaviour = behaviour;
  }

  @Override
  public String process() {
    return behaviour.getMessage();
  }
}
