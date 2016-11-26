package com.sd.ch8;
public class Rectangle{
  protected double length;
  protected double width;
  protected boolean isSelected;
  public Rectangle(double l, double w){
    this.length=1;
    this.width=1;
  }
  public double getLenth(){
    return this.length;
  }
  public double getWidth(){
    return this.width;
  }
  public boolean getSelected(){
    return this.isSelected;
  }
  public void setSelected(boolean b){
    this .isSelected=b;
  }
}