package com.dev.gam.structural.decorator;

public class SportsCar extends CarDecorator {

  public SportsCar(Car c) {
    super(c);
  }

  @Override
  public void assemble(){
    super.assemble();
    System.out.print(" Adding features of Sports Car.");
  }
}