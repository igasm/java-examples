package design_patterns.strategy.vehicles;

import java.util.ArrayList;
import java.util.List;

public class Demo {

  public static void main(String[] args) {
    List<Vehicle> vehicles = new ArrayList <>();
    Ferrari ferrari = new Ferrari(new DriveFast());
    OldCar oldCar = new OldCar(new DriveSlow());

    System.out.println("Ferrari: " + ferrari.tryToDrive());
    System.out.println("Old car: " + oldCar.tryToDrive());

    ferrari.setDrivingType(new DriveSlow());

    System.out.println("Ferrari: " + ferrari.tryToDrive());
    System.out.println("Old car: " + oldCar.tryToDrive());
  }

}
