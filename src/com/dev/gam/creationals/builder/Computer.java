package com.dev.gam.creationals.builder;

public class Computer {

  //required parameters
  private String hdd;
  private String ram;

  //optional parameters
  private boolean isGraphicsCardEnabled;
  private boolean isBluetoothEnabled;


  public String getHdd() {
    return hdd;
  }

  public String getRam() {
    return ram;
  }

  public boolean isGraphicsCardEnabled() {
    return isGraphicsCardEnabled;
  }

  public boolean isBluetoothEnabled() {
    return isBluetoothEnabled;
  }

  private Computer(Builder builder) {
    this.hdd=builder.hdd;
    this.ram=builder.ram;
    this.isGraphicsCardEnabled=builder.isGraphicsCardEnabled;
    this.isBluetoothEnabled=builder.isBluetoothEnabled;
  }

  @Override public String toString() {
    return "Computer{" + "hdd='" + hdd + '\'' + ", ram='" + ram + '\'' + ", isGraphicsCardEnabled=" + isGraphicsCardEnabled + ", isBluetoothEnabled=" + isBluetoothEnabled + '}';
  }

  //Builder Class
  public static class Builder{

    // required parameters
    private String hdd;
    private String ram;

    // optional parameters
    private boolean isGraphicsCardEnabled;
    private boolean isBluetoothEnabled;

    /*public Builder(String hdd, String ram){
      this.HDD=hdd;
      this.RAM=ram;
    }*/
    public Builder hdd(String hdd) {
      this.hdd = hdd;
      return this;
    }
    public Builder ram(String ram) {
      this.ram = ram;
      return this;
    }

    public Builder graphicsCardEnabled(boolean isGraphicsCardEnabled) {
      this.isGraphicsCardEnabled = isGraphicsCardEnabled;
      return this;
    }

    public Builder bluetoothEnabled(boolean isBluetoothEnabled) {
      this.isBluetoothEnabled = isBluetoothEnabled;
      return this;
    }

    public Computer build(){
      return new Computer(this);
    }

  }

}
