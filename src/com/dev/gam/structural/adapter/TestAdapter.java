package com.dev.gam.structural.adapter;

public class TestAdapter {
  public static void main(String[] args) {
    Movable bmw = new Bmw();
    System.out.println(bmw.getSpeed()); // MPH
    MovableAdapter bmwAdapter = new MovableAdapterImpl(bmw);
    System.out.println(bmwAdapter.getSpeed()); // KMPH
  }
}
