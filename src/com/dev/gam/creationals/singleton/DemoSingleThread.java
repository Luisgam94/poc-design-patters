package com.dev.gam.creationals.singleton;

public class DemoSingleThread {
  public static void main(String[] args) {
    Singleton singleton = Singleton.getInstance();
    Singleton anotherSingleton = Singleton.getInstance();
    System.out.println(singleton.toString());
    System.out.println(anotherSingleton.toString());
  }
}
