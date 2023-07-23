package com.dev.gam.behavior.memento.example1;

public class Memento {

  private String state;

  public Memento(String state){
    this.state = state;
  }

  public String getState(){
    return state;
  }
}
