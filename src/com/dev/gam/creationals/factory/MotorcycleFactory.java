package com.dev.gam.creationals.factory;

public class MotorcycleFactory extends MotorVehicleFactory {
  @Override
  protected MotorVehicle createMotorVehicle() {
    return new Motorcycle();
  }
}
