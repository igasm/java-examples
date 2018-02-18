package design_patterns.observer.subject;

public class Move {

  private final String playerName;
  private final Integer fieldNumber;

  public Move(String playerName, Integer fieldNumber) {
    this.playerName = playerName;
    this.fieldNumber = fieldNumber;
  }

  public String getPlayerName() {
    return playerName;
  }

  public Integer getFieldNumber() {
    return fieldNumber;
  }

  @Override
  public String toString(){
    return "Player " + playerName + " moves to " + fieldNumber;
  }

}
