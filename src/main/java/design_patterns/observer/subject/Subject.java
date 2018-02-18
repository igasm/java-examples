package design_patterns.observer.subject;

import design_patterns.observer.observer.Observer;

public interface Subject {

  void addObserver(Observer observer);
  void removeObserver(Observer observer);

}
