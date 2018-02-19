package design_patterns.strategy.battleships;

public interface Ship {
  void setBehaviour(Behaviour behaviour);
  String process();
}
