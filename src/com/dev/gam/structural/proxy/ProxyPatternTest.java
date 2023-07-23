package com.dev.gam.structural.proxy;

public class ProxyPatternTest {
  public static void main(String[] args) {
    ExpensiveObject object = new ExpensiveObjectProxy();
    object.process();
    object.process();
  }
}
