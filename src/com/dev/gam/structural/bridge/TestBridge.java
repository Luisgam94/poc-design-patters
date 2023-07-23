package com.dev.gam.structural.bridge;

public class TestBridge {
  public static void main(String[] args) {
    Shape shape = new Square(new Blue());
    System.out.println(shape.draw());

    Shape shape1 = new Triangle(new Red());
    System.out.println(shape1.draw());

  }
}
