package design_patterns.memento;

public class MementoDemo {

  public static void main(String[] args) {
    CareTaker careTaker = new CareTaker();
    Originator originator = new Originator();

    originator.setTv(new Tv(42));
    Memento memento = originator.createMemento();
    careTaker.add(memento);
    originator.setTv(new Tv(50));

    originator.restoreMemento(careTaker.getLast());

  }

}
