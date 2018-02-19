package design_patterns.memento;

public class Memento {

  private final Tv tv;

  public Memento(Tv tv) {
    this.tv = tv;
  }

  public Tv getTv() {
    return tv;
  }
}
