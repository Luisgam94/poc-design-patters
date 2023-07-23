package com.dev.gam.creationals.builder;

public class TestBuilderPattern {
  public static void main(String[] args) {
    //Using builder to get the object in a single line of code and
    //without any inconsistent state or arguments management issues
    Computer comp = new Computer.Builder()
        .hdd("a")
        .ram("b")
        .bluetoothEnabled(true)
        .graphicsCardEnabled(true)
        .build();

    System.out.println(comp);
  }
}
