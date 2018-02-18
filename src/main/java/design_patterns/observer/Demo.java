package design_patterns.observer;

import design_patterns.observer.observer.Controller;
import design_patterns.observer.observer.Logger;
import design_patterns.observer.observer.Observer;
import design_patterns.observer.subject.GameMoves;
import design_patterns.observer.subject.Move;

public class Demo {

  public static void main(String[] args) {
    Observer logger = new Logger();
    Observer controller = new Controller();
    GameMoves gameMoves = new GameMoves();
    gameMoves.addMove(new Move("Player 1", 5)); //no observers in list

    gameMoves.addObserver(logger);
    gameMoves.addObserver(controller);
    gameMoves.addMove(new Move("Player 2", 10)); //2 observers in list

    gameMoves.removeObserver(logger);
    gameMoves.addMove(new Move("Player 3", 20)); //1 observer in list
  }

}
