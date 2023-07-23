package com.dev.gam.creationals.factory;

public class TestFactoryMethod {
  public static void main(String[] args) {
    MotorVehicle motorcycle = new MotorcycleFactory().createMotorVehicle();
    motorcycle.build();

    MotorVehicle car = new CarFactory().createMotorVehicle();
    car.build();

  }
}
