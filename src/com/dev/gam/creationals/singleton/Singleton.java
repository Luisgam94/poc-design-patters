package com.dev.gam.creationals.singleton;

public final class Singleton {
  private static Singleton instance;

  private Singleton() {
    // The following code emulates slow initialization.
    try {
      Thread.sleep(1000);
    } catch (InterruptedException ex) {
      ex.printStackTrace();
    }
  }

  public static Singleton getInstance() {
    if (instance == null) {
      instance = new Singleton();
    }
    return instance;
  }
}
