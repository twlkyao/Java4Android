package com.twlkyao.call_super_method;

public class DClass extends BClass
{
  private int y;


  public void set(int a, int b)
  {
    set(a); // call set from BClass.
    y = b;
  }
  
  public void print() {
	  super.print();
	  System.out.println("and" + y);
  }
  
  public static void main(String[] args) {
	DClass dClass = new DClass();
	dClass.print();
  }
}