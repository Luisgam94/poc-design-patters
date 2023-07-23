package com.dev.gam.creationals.abstractfactory;

import com.dev.gam.creationals.factory.MotorVehicle;

public class FutureVehicleCorporation extends Corporation {
  @Override
  public MotorVehicle createMotorVehicle() {
    return new FutureVehicleMotorcycle();
  }
  @Override
  public ElectricVehicle createElectricVehicle() {
    return new FutureVehicleElectricCar();
  }
}
