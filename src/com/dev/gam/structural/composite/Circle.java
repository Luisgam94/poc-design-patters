package com.dev.gam.structural.composite;

public class Circle implements Shape { // hoja

  @Override
  public void draw(String fillColor) {
    System.out.println("Drawing Circle with color "+fillColor);
  }

}
