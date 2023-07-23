package com.dev.gam.creationals.abstractfactory;

import com.dev.gam.creationals.factory.MotorVehicle;

public class FutureVehicleMotorcycle implements MotorVehicle {
  @Override
  public void build() {
    System.out.println("Future Vehicle Motorcycle");
  }
}
