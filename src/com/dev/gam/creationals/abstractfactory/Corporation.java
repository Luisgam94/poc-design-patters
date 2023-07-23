package com.dev.gam.creationals.abstractfactory;

import com.dev.gam.creationals.factory.MotorVehicle;

public abstract class Corporation {
  public abstract MotorVehicle createMotorVehicle();
  public abstract ElectricVehicle createElectricVehicle();
}
