package design_patterns.strategy.battleships;

public class TwoMast implements Ship{

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
