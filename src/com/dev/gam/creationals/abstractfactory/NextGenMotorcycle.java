package com.dev.gam.creationals.abstractfactory;

import com.dev.gam.creationals.factory.MotorVehicle;

public class NextGenMotorcycle implements MotorVehicle {
  @Override
  public void build() {
    System.out.println("NextGen Motorcycle");
  }
}
