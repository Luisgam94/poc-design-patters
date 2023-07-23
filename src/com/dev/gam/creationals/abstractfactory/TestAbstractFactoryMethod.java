package com.dev.gam.creationals.abstractfactory;

import com.dev.gam.creationals.factory.MotorVehicle;

public class TestAbstractFactoryMethod {

  public static void main(String[] args) {
    MotorVehicle motorVehicle = new FutureVehicleCorporation().createMotorVehicle();
    motorVehicle.build();

    MotorVehicle motorVehicle2 = new NextGenCorporation().createMotorVehicle();
    motorVehicle2.build();

    ElectricVehicle electricVehicle1 = new FutureVehicleCorporation().createElectricVehicle();
    electricVehicle1.build();

    ElectricVehicle electricVehicle2 = new NextGenCorporation().createElectricVehicle();
    electricVehicle2.build();
  }

}
