package design_patterns.strategy.vehicles;

public class DriveSlow implements Drives{

  @Override
  public String drive() {
    return "driving slow";
  }
}
