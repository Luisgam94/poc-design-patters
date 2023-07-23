package com.dev.gam.structural.flyweight;

import java.awt.*;

public class FlyweightPatternTest {

  public static void main(String[] args) {
    Vehicle blackVehicle = VehicleFactory.createVehicle(Color.BLACK);
    Vehicle blueVehicle = VehicleFactory.createVehicle(Color.BLUE);

    System.out.println(blackVehicle);
    System.out.println(blueVehicle);
    System.out.println(blackVehicle.getColor());
    System.out.println(blueVehicle.getColor());

    Vehicle blackVehicle1 = VehicleFactory.createVehicle(Color.BLACK);
    Vehicle anotherBlackVehicle1 = VehicleFactory.createVehicle(Color.BLACK);

    System.out.println(blackVehicle1);
    System.out.println(anotherBlackVehicle1);
  }
}
