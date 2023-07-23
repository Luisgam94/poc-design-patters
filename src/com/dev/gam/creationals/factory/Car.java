package com.dev.gam.creationals.factory;

public class Car implements MotorVehicle {
  @Override
  public void build() {
    System.out.println("Build Car");
  }
}
