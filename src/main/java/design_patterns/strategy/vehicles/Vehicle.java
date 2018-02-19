package design_patterns.strategy.vehicles;

//or maybe interface??
abstract class Vehicle {

  private Drives drivingType;

  protected Vehicle(Drives drivingType) {
    this.drivingType = drivingType;
  }

  public String tryToDrive(){
    return drivingType.drive();
  }

  public void setDrivingType(Drives drivingType){
    this.drivingType = drivingType;
  }
}
