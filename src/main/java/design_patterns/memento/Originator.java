package design_patterns.memento;

public class Originator {

  private Tv tv;

  public void setTv(Tv tv) {
    this.tv = tv;
    System.out.println("new Tv added: " + tv);
  }

  public Memento createMemento() {
    System.out.println("created memento for: " + tv);
    return new Memento(tv);
  }

  public void restoreMemento(Memento memento) {
    tv = memento.getTv();
    System.out.println("restored memento for: " + tv);
  }
}
