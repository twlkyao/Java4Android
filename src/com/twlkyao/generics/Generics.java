package com.twlkyao.generics;

public class Generics {
	
	public static void main(String[] args) {
		Point<Object> point= new Point<Object>();
		point.setVar(20);
		point.setYar("30");
		System.out.println("x coordinate: " +point.getVar());
		System.out.println("y coordinate: " +point.getYar());
	}
}