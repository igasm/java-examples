package design_patterns.observer.subject;

import design_patterns.observer.observer.Observer;

import java.util.ArrayList;
import java.util.List;

public class GameMoves implements Subject{

  private List<Move> moves = new ArrayList<>();
  private List<Observer> observers = new ArrayList<>();

  public void addMove(Move move){
    moves.add(move);
    notifyObservers(move);
  }

  @Override
  public void addObserver(Observer observer) {
    observers.add(observer);
  }

  @Override
  public void removeObserver(Observer observer) {
    observers.remove(observer);
  }

  private void notifyObservers(Move move) {
    for (Observer observer : observers){
      observer.update(move);
    }
  }
}
