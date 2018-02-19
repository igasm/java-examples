package design_patterns.memento;

import java.util.LinkedList;

public class CareTaker {

  LinkedList<Memento> mementos = new LinkedList<>();

  public void add(Memento memento){
    mementos.add(memento);
  }

  public Memento getLast(){
    return mementos.getLast();
  }

}
