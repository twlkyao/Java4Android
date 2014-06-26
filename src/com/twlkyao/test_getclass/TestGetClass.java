package com.twlkyao.test_getclass;

/**
 * @author Jack
 *
 */
public class TestGetClass {
	
	public static void main(String[] args) {
		TestGetClass testGetClass = new TestGetClass();
		System.out.println(testGetClass.getClass());
		int x =3,y;
		y = (x++ ) + (x++) + (x++); // The y is 12.
		System.out.println(y);
	}
}
