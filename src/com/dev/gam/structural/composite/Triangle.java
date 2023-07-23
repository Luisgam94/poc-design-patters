package com.dev.gam.structural.composite;

public class Triangle implements Shape { // hoja

  @Override
  public void draw(String fillColor) {
    System.out.println("Drawing Triangle with color "+fillColor);
  }

}
