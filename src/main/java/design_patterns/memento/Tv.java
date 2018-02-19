package design_patterns.memento;

public class Tv {

  private final int size;

  public Tv(int size) {
    this.size = size;
  }

  @Override
  public String toString(){
    return "Tv : " + size + "\"";
  }

}
