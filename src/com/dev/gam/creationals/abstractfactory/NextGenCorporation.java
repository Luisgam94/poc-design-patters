package com.dev.gam.creationals.abstractfactory;

import com.dev.gam.creationals.factory.MotorVehicle;

public class NextGenCorporation extends Corporation {
  @Override
  public MotorVehicle createMotorVehicle() {
    return new NextGenMotorcycle();
  }
  @Override
  public ElectricVehicle createElectricVehicle() {
    return new NextGenElectricCar();
  }
}
